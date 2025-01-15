package biz.itcompany.controller;

import biz.itcompany.service.WorkerService;
import biz.itcompany.view.WorkerView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<WorkerView> getList(){
        return workerService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public WorkerView get(@RequestBody String id){
        return workerService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public WorkerView update(@RequestBody WorkerView workerView) {
        workerService.save(workerView);
        return workerView;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void delete(@RequestBody String id) {
        workerService.deleteById(Integer.parseInt(id));
    }
}
