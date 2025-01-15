package biz.itcompany.service;

import biz.itcompany.model.Move;
import biz.itcompany.model.Worker;
import biz.itcompany.repository.*;
import biz.itcompany.view.MoveView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoveService {

    @Autowired
    private WorkerRepository workerRepository;
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private MoveRepository moveRepository;
    @Autowired
    private MoveStatusRepository moveStatusRepository;

    public List<MoveView> getAll(){
        List<Move> moveList = moveRepository.findAll();
        List<MoveView> moveViewList = new ArrayList<>();
        moveList.forEach(move -> {
            moveViewList.add(fillMoveView(move));
        });
        return moveViewList;
    }

    public MoveView getOne(Integer id){
        Move move = moveRepository.getOne(id);
        return fillMoveView(move);
    }

    private MoveView fillMoveView(Move move) {
        MoveView moveView = new MoveView();
        BeanUtils.copyProperties(move, moveView);
        Worker worker = workerRepository.getOne(move.getRecipientId());
        moveView.setRecipientLastName(worker.getWorkerLastName());
        moveView.setRecipientName(worker.getWorkerName());
        moveView.setRecipientMiddleName(worker.getWorkerMiddleName());
        worker = workerRepository.getOne(move.getSenderId());
        moveView.setSenderLastName(worker.getWorkerLastName());
        moveView.setSenderName(worker.getWorkerName());
        moveView.setSenderMiddleName(worker.getWorkerMiddleName());
        moveView.setMoveStatusName(moveStatusRepository.getOne(move.getMoveStatusId()).getMoveStatusName());
        moveView.setTaskMission(taskRepository.getOne(move.getTaskId()).getTaskMission());
        return moveView;
    }

    public void save(MoveView moveView){
        Move move = new Move();
        BeanUtils.copyProperties(moveView, move);
        moveRepository.save(move);
    }

    public void deleteById(Integer id){
        moveRepository.deleteById(id);
    }
}
