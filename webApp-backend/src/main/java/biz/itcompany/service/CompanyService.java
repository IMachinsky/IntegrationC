package biz.itcompany.service;

import biz.itcompany.model.Company;
import biz.itcompany.model.Worker;
import biz.itcompany.repository.CompanyRepository;
import biz.itcompany.repository.WorkerRepository;
import biz.itcompany.view.CompanyView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyService {

    @Autowired
    private WorkerRepository workerRepository;
    @Autowired
    private CompanyRepository companyRepository;

    public List<CompanyView> getAll(){
        List<Company> companyList = companyRepository.findAll();
        List<CompanyView> companyViewList = new ArrayList<>();
        companyList.forEach(company -> {
            CompanyView companyView = new CompanyView();
            BeanUtils.copyProperties(company, companyView);
            Worker worker = workerRepository.getOne(company.getWorkerId());
            companyView.setWorkerName(worker.getWorkerName());
            companyView.setWorkerLastName(worker.getWorkerLastName());
            companyView.setWorkerMiddleName(worker.getWorkerMiddleName());
            companyViewList.add(companyView);
        });
        return companyViewList;
    }

    public CompanyView getOne(Integer id){
        Company company = companyRepository.getOne(id);
        CompanyView companyView = new CompanyView();
        BeanUtils.copyProperties(company, companyView);
        Worker worker = workerRepository.getOne(company.getCompanyId());
        companyView.setWorkerName(worker.getWorkerName());
        companyView.setWorkerLastName(worker.getWorkerLastName());
        companyView.setWorkerMiddleName(worker.getWorkerMiddleName());
        return companyView;
    }

    public void save(CompanyView companyView){
        Company company = new Company();
        BeanUtils.copyProperties(companyView, company);
        companyRepository.save(company);
    }

    public void deleteById(Integer id){
        companyRepository.deleteById(id);
    }

}
