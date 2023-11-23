package Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "HIBERNATE_SKILLS")
public class Skill {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "NAME")
    private String name;

    public Skill(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Skill() {
    }

    public Integer getId() {
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
}