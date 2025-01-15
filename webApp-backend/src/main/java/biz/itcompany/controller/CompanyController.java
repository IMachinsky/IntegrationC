package biz.itcompany.controller;

import biz.itcompany.model.Company;
import biz.itcompany.service.CompanyService;
import biz.itcompany.view.CompanyView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<CompanyView> getList(){
        return companyService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public CompanyView get(@RequestBody String id){
        return companyService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public CompanyView updateClient(@RequestBody CompanyView company) {
        companyService.save(company);
        return company;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void deleteClient(@RequestBody String id) {
        companyService.deleteById(Integer.parseInt(id));
    }
}
