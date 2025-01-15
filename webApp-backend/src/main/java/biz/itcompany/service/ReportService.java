package biz.itcompany.service;

import biz.itcompany.dto.RangeDTO;
import biz.itcompany.model.*;
import biz.itcompany.repository.*;
import biz.itcompany.view.ContractClientView;
import biz.itcompany.view.ContractWorkerView;
import biz.itcompany.view.TaskChartView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ReportService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private WorkerRepository workerRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private MoveRepository moveRepository;
    @Autowired
    private ProjectRepository projectRepository;

    public ContractClientView getClientContract(Integer id){
        ContractClientView contractClientView = new ContractClientView();
        Order order = orderRepository.getOne(id);
        Client client = clientRepository.getOne(order.getClientId());
        List<Worker> workerList = workerRepository.findAll();
        Company company = companyRepository.getOne(1);
        BeanUtils.copyProperties(order, contractClientView);
        BeanUtils.copyProperties(client, contractClientView);
        BeanUtils.copyProperties(company, contractClientView);
        Worker workerDir = workerList.stream().filter(worker -> worker.getPostId().equals(1) && worker.getWorkerDateEndJob() == null).findFirst().get();
        contractClientView.setWorkerName(workerDir.getWorkerName());
        contractClientView.setWorkerLastName(workerDir.getWorkerLastName());
        contractClientView.setWorkerMiddleName(workerDir.getWorkerMiddleName());
        return contractClientView;
    }

    public ContractWorkerView getWorkerClient(Integer id){
        ContractWorkerView contractWorkerView = new ContractWorkerView();
        Worker worker = workerRepository.getOne(id);
        List<Worker> workerList = workerRepository.findAll();
        Worker workerDir = workerList.stream().filter(workerD -> workerD.getPostId().equals(1) && workerD.getWorkerDateEndJob() == null).findFirst().get();
        Company company = companyRepository.getOne(1);
        BeanUtils.copyProperties(company, contractWorkerView);
        BeanUtils.copyProperties(worker, contractWorkerView);
        contractWorkerView.setDirName(workerDir.getWorkerName());
        contractWorkerView.setDirLastName(workerDir.getWorkerLastName());
        contractWorkerView.setDirMiddleName(workerDir.getWorkerMiddleName());
        contractWorkerView.setPostName(postRepository.getOne(worker.getPostId()).getPostName());
        return contractWorkerView;
    }

    public List<TaskChartView> getTaskChart(Integer taskId){
        List<TaskChartView> taskChartViewList = new ArrayList<>();
        List<Move> moveList = moveRepository.findAll();
        List<Move> moveTaskList = new ArrayList<>();
        moveList.forEach(move -> {
            if(move.getTaskId().equals(taskId)){
                moveTaskList.add(move);
            }
        });
        moveTaskList.forEach(move ->{
            TaskChartView taskChartView = new TaskChartView();
            taskChartView.setMoveDateEnd(move.getMoveDateEnd());
            taskChartView.setMoveCount(
            moveTaskList.stream().filter(move1 -> move1.getMoveDateEnd().equals(move.getMoveDateEnd())
            && move1.getMoveDateEnd() != null).count());
            taskChartViewList.add(taskChartView);
        });
        return taskChartViewList;
    }

    public List<TaskChartView> getMoveStat(Integer orderId){
        List<TaskChartView> taskChartViewList = new ArrayList<>();
        List<Project> projectList = projectRepository.findAll().stream().filter(
                project -> project.getOrderId().equals(orderId)).collect(Collectors.toList());
        List<Task> taskList = taskRepository.findAll();
        List<Integer> ids = new ArrayList<>();
        projectList.forEach(project -> ids.add(project.getProjectId()));
        List<Task> taskProjectList = taskList.stream().filter(task -> ids.contains(task.getProjectId())).collect(Collectors.toList());
        taskProjectList.forEach(task -> ids.add(task.getTaskId()));
        List<Move> moveList = moveRepository.findAll();
        List<Move> moveTaskList = moveList.stream().filter(move -> ids.contains(move.getTaskId())).collect(Collectors.toList());
        Map<Date, Move> moveMap = new HashMap<>();
        moveTaskList.forEach(move -> moveMap.put(move.getMoveDateEnd(), move));
        moveMap.forEach((k, v) -> {
            TaskChartView taskChartView = new TaskChartView();
            taskChartView.setMoveDateEnd(k);
            taskChartView.setMoveCount(
                    moveList.stream().filter(move1 -> move1.getMoveDateEnd().equals(v.getMoveDateEnd())
                            && move1.getMoveDateEnd() != null && move1.getMoveStatusId().equals(4)).count());
            taskChartViewList.add(taskChartView);
        });
        return taskChartViewList;
    }

    public List<TaskChartView> getProjectStat(Integer projectId){
        List<TaskChartView> taskChartViewList = new ArrayList<>();
        List<Task> taskList = taskRepository.findAll().stream().filter(
                task -> task.getProjectId().equals(projectId)).collect(Collectors.toList());
        List<Integer> ids = new ArrayList<>();
        taskList.forEach(task -> ids.add(task.getTaskId()));
        List<Move> moveList = moveRepository.findAll();
        List<Move> moveTaskList = moveList.stream().filter(move -> ids.contains(move.getTaskId())).collect(Collectors.toList());
        Map<Date, Move> moveMap = new HashMap<>();
        moveList.forEach(move -> moveMap.put(move.getMoveDateEnd(), move));
        moveMap.forEach((k, v) -> {
            TaskChartView taskChartView = new TaskChartView();
            taskChartView.setMoveDateEnd(k);
            taskChartView.setMoveCount(
                    moveList.stream().filter(move1 -> move1.getMoveDateEnd().equals(v.getMoveDateEnd())
                            && move1.getMoveDateEnd() != null && move1.getMoveStatusId().equals(4)).count());
            taskChartViewList.add(taskChartView);
        });
        return taskChartViewList;
    }

    public List<Worker> getProjectTeam(Integer projectId){
        List<Worker> projectTeam = new ArrayList<>();
        List<Task> taskList = taskRepository.findAll().stream().filter(
                task -> task.getProjectId().equals(projectId)).collect(Collectors.toList());
        List<Integer> ids = new ArrayList<>();
        taskList.forEach(task -> ids.add(task.getTaskId()));
        List<Move> moveList = moveRepository.findAll();
        List<Move> moveTaskList = moveList.stream().filter(move -> ids.contains(move.getTaskId())).collect(Collectors.toList());
        moveTaskList.forEach(move -> {
            ids.add(move.getRecipientId());
            ids.add(move.getSenderId());
        });
        List<Worker> workers = workerRepository.findAll();
        Map<Integer, Worker> projectTeamUnique = new HashMap<>();
        List<Worker> workersTeam = workers.stream().filter(worker -> ids.contains(worker.getWorkerId())).collect(Collectors.toList());
        workersTeam.forEach(worker -> projectTeamUnique.put(worker.getWorkerId(), worker));
        projectTeamUnique.forEach((k, v) -> {
            projectTeam.add(v);
        });
        return projectTeam;
    }

    public List<TaskChartView> getTaskInRange(RangeDTO dto){
        List<TaskChartView> taskChartViewList = new ArrayList<>();
        List<Move> moveList = moveRepository.findAll().stream().filter(move -> move.getMoveDateEnd().getTime() <= dto.getDateEnd().getTime()
        && move.getMoveDateStart().getTime() >= dto.getDateStart().getTime()).collect(Collectors.toList());
        Map<Date, Move> moveMap = new HashMap<>();
        moveList.forEach(move -> moveMap.put(move.getMoveDateEnd(), move));
        moveMap.forEach((k, v) -> {
            TaskChartView taskChartView = new TaskChartView();
            taskChartView.setMoveDateEnd(k);
            taskChartView.setMoveCount(
                    moveList.stream().filter(move1 -> move1.getMoveDateEnd().equals(v.getMoveDateEnd())
                            && move1.getMoveDateEnd() != null && move1.getMoveStatusId().equals(4)).count());
            taskChartViewList.add(taskChartView);
        });
        return taskChartViewList;
    }
}
