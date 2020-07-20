package application.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName School
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/20 21:17
 * @Version V1.0
 **/
@Entity
public class School implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(length =50,name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
