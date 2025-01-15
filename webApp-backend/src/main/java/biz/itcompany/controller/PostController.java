package biz.itcompany.controller;

import biz.itcompany.model.Post;
import biz.itcompany.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<Post> getList(){
        return postService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public Post get(@RequestBody String id){
        return postService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public Post update(@RequestBody Post post) {
        postService.save(post);
        return post;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void delete(@RequestBody String id) {
        postService.deleteById(Integer.parseInt(id));
    }

}
