package main.com.mycompany.app.entity;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by пользователь on 03.11.2019.
 */
@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")
    @SequenceGenerator(name = "student_gen", sequenceName = "student_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lName;
    @Column(name = "sec_name")
    private String secName;
    @ManyToOne
    @JoinColumn(name = "group_num")
    private GroupEntity group;


    public void setId(Integer id) {
        this.id = id;
    }

    public GroupEntity getGroup() {
        return group;
    }

    public void setGroup(GroupEntity group) {
        this.group = group;
    }

    public StudentEntity() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }
}
