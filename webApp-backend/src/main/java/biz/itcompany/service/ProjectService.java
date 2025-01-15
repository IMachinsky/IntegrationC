package biz.itcompany.service;

import biz.itcompany.model.*;
import biz.itcompany.repository.*;
import biz.itcompany.view.OrderView;
import biz.itcompany.view.ProjectView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private WorkerRepository workerRepository;
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProjectStatusRepository projectStatusRepository;

    public List<ProjectView> getAll(){
        List<Project> projectList = projectRepository.findAll();
        List<ProjectView> projectViewList = new ArrayList<>();
        projectList.forEach(project -> {
            projectViewList.add(fillProjectView(project));
        });
        return projectViewList;
    }

    public ProjectView getOne(Integer id){
        Project project = projectRepository.getOne(id);
        return fillProjectView(project);
    }

    private ProjectView fillProjectView(Project project) {
        ProjectView projectView = new ProjectView();
        BeanUtils.copyProperties(project, projectView);
        Worker worker = workerRepository.getOne(project.getWorkerId());
        ProjectStatus projectStatus = projectStatusRepository.getOne(project.getProjectStatusId());
        projectView.setWorkerLastName(worker.getWorkerLastName());
        projectView.setWorkerName(worker.getWorkerName());
        projectView.setWorkerMiddleName(worker.getWorkerMiddleName());
        projectView.setProjectStatusName(projectStatus.getProjectStatusName());
        return projectView;
    }

    public void save(ProjectView projectView){
        Project project = new Project();
        BeanUtils.copyProperties(projectView, project);
        projectRepository.save(project);
    }

    public void deleteById(Integer id){
        projectRepository.deleteById(id);
    }
}
