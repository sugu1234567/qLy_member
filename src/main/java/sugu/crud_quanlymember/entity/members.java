package sugu.crud_quanlymember.entity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table (name = "members")
public class members {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String joinDay;
    private String yearOfWork;

    public members(String name, int age, Long id, String gender, String joinDay, String yearOfWork) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.joinDay = joinDay;
        this.yearOfWork = yearOfWork;
    }

    public members() {

    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJoinDay() {
        return joinDay;
    }

    public void setJoinDay(String joinDay) {
        this.joinDay = joinDay;
    }

    public String getYearOfWork() {
        return yearOfWork;
    }

    public void setYearOfWork(String yearOfWork) {
        this.yearOfWork = yearOfWork;
    }
}
