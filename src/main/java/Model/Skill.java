package Model;

import lombok.Data;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "HIBERNATE_SKILLS")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "NAME",columnDefinition = "VARCHAR(255)")
    private String name;


//    @Enumerated(EnumType.ORDINAL)
//    @ManyToOne
//    @JoinColumn(name="status")
//    private Status status;

    public Skill(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }

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