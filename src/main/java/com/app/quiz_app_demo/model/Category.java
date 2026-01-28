package com.app.quiz_app_demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Category {

    @Column(name = "categoryID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryID;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parentID")
    @JsonIgnore
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> children;
}
