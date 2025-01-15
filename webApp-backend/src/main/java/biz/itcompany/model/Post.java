package biz.itcompany.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "post", schema = "dbo")
public class Post {

    @Id
    @Column(name = "post_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    @Column(name = "post_name", nullable = false)
    @NotNull(message = "Поле \"Наименование должности\" не может быть пустым")
    @Size(max=20, message = "Поле \"Наименование должности\" не может содержать больше {max} символов")
    private String postName;

    public Post() {
    }

    public Post(Integer postId,
                String postName) {
        this.postId = postId;
        this.postName = postName;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
}
