package main.com.mycompany.app.Entity;
import javax.persistence.*;
/**
 * Created by пользователь on 03.11.2019.
 */
@Entity
@Table(name = "_group")
public class Group {
    @Id
    @Column(name = "group_num")
    private Integer num;
    @Column(name = "faculty")
    private Integer fac;

    public Group() {
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
