package biz.itcompany.controller;

import biz.itcompany.model.ProjectStatus;
import biz.itcompany.service.ProjectStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/projectstatus")
public class ProjectStatusController {

    @Autowired
    private ProjectStatusService projectStatusService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<ProjectStatus> getList(){
        return projectStatusService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public ProjectStatus get(@RequestBody String id){
        return projectStatusService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public ProjectStatus update(@RequestBody ProjectStatus projectStatus) {
        projectStatusService.save(projectStatus);
        return projectStatus;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void delete(@RequestBody String id) {
        projectStatusService.deleteById(Integer.parseInt(id));
    }
}
