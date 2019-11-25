package main.com.mycompany.app.entity;
import javax.persistence.*;
import java.util.List;

/**
 * Created by пользователь on 03.11.2019.
 */
@Entity
@Table(name = "_group")
public class GroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_gen")
    @SequenceGenerator(name = "group_gen", sequenceName = "group_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "group_num")
    private Integer num;
    @Column(name = "faculty")
    private Integer fac;
    @OneToMany(mappedBy = "group")
    private List<StudentEntity> stuents;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<StudentEntity> getStuents() {
        return stuents;
    }

    public void setStuents(List<StudentEntity> stuents) {
        this.stuents = stuents;
    }


    public GroupEntity() {
    }

    public Integer getNum() {
        return num;
    }

    public Integer getFac() {
        return fac;
    }

    public void setFac(Integer fac) {
        this.fac = fac;
    }
}
