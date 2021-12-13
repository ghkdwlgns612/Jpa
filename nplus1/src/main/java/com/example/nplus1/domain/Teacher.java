package com.example.nplus1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue
    @Column(name = "teacher_id")
    private Long id;

    private String name;

    public Teacher(String name) {
        this.name = name;
    }
}
