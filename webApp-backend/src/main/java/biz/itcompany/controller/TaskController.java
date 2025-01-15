package biz.itcompany.controller;

import biz.itcompany.service.TaskService;
import biz.itcompany.view.TaskView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<TaskView> getList(){
        return taskService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public TaskView get(@RequestBody String id){
        return taskService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public TaskView updateClient(@RequestBody TaskView taskView) {
        taskService.save(taskView);
        return taskView;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void deleteClient(@RequestBody String id) {
        taskService.deleteById(Integer.parseInt(id));
    }
}
