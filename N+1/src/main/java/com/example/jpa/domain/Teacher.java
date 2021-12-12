package com.example.jpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
