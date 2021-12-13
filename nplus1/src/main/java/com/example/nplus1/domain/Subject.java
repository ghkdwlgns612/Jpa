package com.example.nplus1.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue
    @Column(name = "subject_id")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "academy_id", foreignKey = @ForeignKey(name = "FK_SUBJECT_ACADEMY"))
    private Academy academy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id", foreignKey = @ForeignKey(name = "FK_SUBJECT_TEACHER"))
    private Teacher teacher;

    @Builder
    public Subject(Long id, String name, Academy academy, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.academy = academy;
        this.teacher = teacher;
    }

    public void updateAcademy(Academy academy){
        this.academy = academy;
    }
}
