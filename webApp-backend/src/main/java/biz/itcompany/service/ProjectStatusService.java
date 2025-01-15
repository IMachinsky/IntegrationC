package biz.itcompany.service;

import biz.itcompany.model.ProjectStatus;
import biz.itcompany.repository.ProjectStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectStatusService {

    @Autowired
    private ProjectStatusRepository projectStatusRepository;

    public List<ProjectStatus> getAll(){
        return projectStatusRepository.findAll();
    }

    public ProjectStatus getOne(Integer id){
        return projectStatusRepository.findById(id).get();
    }

    public void save(ProjectStatus post){
        projectStatusRepository.save(post);
    }

    public void deleteById(Integer id){
        projectStatusRepository.deleteById(id);
    }
}
