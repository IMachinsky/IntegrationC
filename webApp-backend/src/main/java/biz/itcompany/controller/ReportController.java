package biz.itcompany.controller;

import biz.itcompany.dto.RangeDTO;
import biz.itcompany.model.Worker;
import biz.itcompany.service.ReportService;
import biz.itcompany.view.ContractClientView;
import biz.itcompany.view.ContractWorkerView;
import biz.itcompany.view.TaskChartView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping(value ="/client")
    @CrossOrigin
    public ContractClientView getClient(@RequestBody String id){
        return reportService.getClientContract(Integer.parseInt(id));
    }

    @PostMapping(value ="/worker")
    @CrossOrigin
    public ContractWorkerView getWorker(@RequestBody String id){
        return reportService.getWorkerClient(Integer.parseInt(id));
    }

    @PostMapping(value ="/taskchart")
    @CrossOrigin
    public List<TaskChartView> getTaskChart(@RequestBody String id){
        return reportService.getTaskChart(Integer.parseInt(id));
    }

    @PostMapping(value ="/orderstat")
    @CrossOrigin
    public List<TaskChartView> getOrderStat(@RequestBody String id){
        return reportService.getMoveStat(Integer.parseInt(id));
    }

    @PostMapping(value ="/projectstat")
    @CrossOrigin
    public List<TaskChartView> getProjectStat(@RequestBody String id){
        return reportService.getProjectStat(Integer.parseInt(id));
    }

    @PostMapping(value ="/projectteam")
    @CrossOrigin
    public List<Worker> getProjectTeam(@RequestBody String id){
        return reportService.getProjectTeam(Integer.parseInt(id));
    }

    @PostMapping(value ="/taskrange")
    @CrossOrigin
    public List<TaskChartView> getTaskInDate(@RequestBody RangeDTO dto){
        return reportService.getTaskInRange(dto);
    }
}
