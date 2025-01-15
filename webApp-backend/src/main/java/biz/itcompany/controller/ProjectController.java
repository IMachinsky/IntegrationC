package biz.itcompany.controller;

import biz.itcompany.service.OrderService;
import biz.itcompany.service.ProjectService;
import biz.itcompany.view.OrderView;
import biz.itcompany.view.ProjectView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<ProjectView> getList(){
        return projectService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public ProjectView get(@RequestBody String id){
        return projectService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public ProjectView updateClient(@RequestBody ProjectView projectView) {
        projectService.save(projectView);
        return projectView;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void deleteClient(@RequestBody String id) {
        projectService.deleteById(Integer.parseInt(id));
    }

}
