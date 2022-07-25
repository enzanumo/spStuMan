package site.umou.spstuman.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
}
