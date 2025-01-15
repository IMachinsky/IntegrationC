package biz.itcompany.service;

import biz.itcompany.model.Post;
import biz.itcompany.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAll(){
        return postRepository.findAll();
    }

    public Post getOne(Integer id){
        return postRepository.findById(id).get();
    }

    public void save(Post post){
        postRepository.save(post);
    }

    public void deleteById(Integer id){
        postRepository.deleteById(id);
    }

}
