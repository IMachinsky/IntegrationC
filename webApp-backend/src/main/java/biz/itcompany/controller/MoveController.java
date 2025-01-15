package biz.itcompany.controller;

import biz.itcompany.service.MoveService;
import biz.itcompany.view.MoveView;
import biz.itcompany.view.TaskView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/move")
public class MoveController {

    @Autowired
    private MoveService moveService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<MoveView> getList(){
        return moveService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public MoveView get(@RequestBody String id){
        return moveService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public MoveView updateClient(@RequestBody MoveView moveView) {
        moveService.save(moveView);
        return moveView;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void deleteClient(@RequestBody String id) {
        moveService.deleteById(Integer.parseInt(id));
    }
}
