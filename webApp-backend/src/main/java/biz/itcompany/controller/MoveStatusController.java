package biz.itcompany.controller;

import biz.itcompany.model.MoveStatus;
import biz.itcompany.service.MoveStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movestatus")
public class MoveStatusController {

    @Autowired
    private MoveStatusService moveStatusService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<MoveStatus> getList(){
        return moveStatusService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public MoveStatus get(@RequestBody String id){
        return moveStatusService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public MoveStatus update(@RequestBody MoveStatus projectStatus) {
        moveStatusService.save(projectStatus);
        return projectStatus;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void delete(@RequestBody String id) {
        moveStatusService.deleteById(Integer.parseInt(id));
    }
}
