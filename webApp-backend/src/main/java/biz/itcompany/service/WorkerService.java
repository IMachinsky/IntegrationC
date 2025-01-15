package biz.itcompany.service;

import biz.itcompany.model.Post;
import biz.itcompany.model.Worker;
import biz.itcompany.repository.PostRepository;
import biz.itcompany.repository.WorkerRepository;
import biz.itcompany.view.WorkerView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;
    @Autowired
    private PostRepository postRepository;

    public List<WorkerView> getAll(){
        List<Worker> workerList = workerRepository.findAll();
        List<WorkerView> workerViewList = new ArrayList<>();
        List<Post> postList = postRepository.findAll();
        Map<Integer, String> posts = new HashMap<>();
        postList.forEach(post -> {
            posts.put(post.getPostId(), post.getPostName());
        });
        workerList.forEach(worker -> {
            WorkerView workerView = new WorkerView();
            BeanUtils.copyProperties(worker, workerView);
            workerView.setWorkerBirthday(workerView.getWorkerBirthday());
            workerView.setPostName(posts.get(workerView.getPostId()));
            workerViewList.add(workerView);
        });
        return workerViewList;
    }

    public WorkerView getOne(Integer id){
        Worker worker = workerRepository.getOne(id);
        WorkerView workerView = new WorkerView();
        BeanUtils.copyProperties(worker, workerView);
        workerView.setPostName(postRepository.getOne(worker.getPostId()).getPostName());
        return workerView;
    }

    public void save(WorkerView workerView){
        Worker worker = new Worker();
        BeanUtils.copyProperties(workerView, worker);
        workerRepository.save(worker);
    }

    public void deleteById(Integer id){
        workerRepository.deleteById(id);
    }
}
