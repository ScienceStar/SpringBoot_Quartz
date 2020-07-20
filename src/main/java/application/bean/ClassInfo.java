package application.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName ClassInfo
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/20 21:24
 * @Version V1.0
 **/
@Entity
public class ClassInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(length =50,name = "className")
    private String className;
}
