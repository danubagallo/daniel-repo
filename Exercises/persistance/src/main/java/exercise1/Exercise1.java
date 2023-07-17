package exercise1;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "exercise1") // model the database user table
public class Exercise1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;

    @CreationTimestamp
    private Date creationTime;

    @UpdateTimestamp
    private Date updateTime;

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exercise1{" +
                "id=" + id +
                ", version=" + version +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
