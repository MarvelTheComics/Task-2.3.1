package myApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Second_name")
    private String secondName;
    @Column(name = "Age")
    private int age;
    @Column(name = "Eye_color")
    private String eyeColor;

    public User() {
    }

    public User(String name, String secondName, int age, String eyeColor) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && age == user.age && Objects.equals(name, user.name) && Objects.equals(secondName, user.secondName) && Objects.equals(eyeColor, user.eyeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, secondName, age, eyeColor);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", dateOfBirthday='" + eyeColor + '\'' +
                '}';
    }
}
