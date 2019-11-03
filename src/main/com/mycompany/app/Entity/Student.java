package main.com.mycompany.app.Entity;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by пользователь on 03.11.2019.
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {
    @Id
    @Column(name ="id_stud" )
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lName;
    @Column(name = "sec_name")
    private String secName;

    public Student() {
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
