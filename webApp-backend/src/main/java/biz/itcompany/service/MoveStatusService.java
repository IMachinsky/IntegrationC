package biz.itcompany.service;

import biz.itcompany.model.MoveStatus;
import biz.itcompany.repository.MoveStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoveStatusService {

    @Autowired
    private MoveStatusRepository moveStatusRepository;

    public List<MoveStatus> getAll(){
        return moveStatusRepository.findAll();
    }

    public MoveStatus getOne(Integer id){
        return moveStatusRepository.findById(id).get();
    }

    public void save(MoveStatus post){
        moveStatusRepository.save(post);
    }

    public void deleteById(Integer id){
        moveStatusRepository.deleteById(id);
    }
}
