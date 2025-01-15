package biz.itcompany.service;

import biz.itcompany.model.Task;
import biz.itcompany.repository.TaskRepository;
import biz.itcompany.view.TaskView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskView> getAll(){
        List<Task> taskList = taskRepository.findAll();
        List<TaskView> taskViewList = new ArrayList<>();
        taskList.forEach(task -> {
            TaskView taskView = new TaskView();
            BeanUtils.copyProperties(task, taskView);
            taskViewList.add(taskView);
        });
        return taskViewList;
    }

    public TaskView getOne(Integer id){
        Task task = taskRepository.getOne(id);
        TaskView taskView = new TaskView();
        BeanUtils.copyProperties(task, taskView);
        return taskView;
    }

    public void save(TaskView taskView){
        Task task = new Task();
        BeanUtils.copyProperties(taskView, task);
        taskRepository.save(task);
    }

    public void deleteById(Integer id){
        taskRepository.deleteById(id);
    }
}
