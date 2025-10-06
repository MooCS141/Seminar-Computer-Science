package com.example.backend.models.course;

import com.example.backend.models.auth.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "subjects", schema = "course")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonManagedReference
    @ManyToMany
    @JoinTable(
            name = "subjects_users",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> users;

    @Column(name = "name_th", length = 100, nullable = false)
    private String nameTh;

    @Column(name = "name_en", length = 100, nullable = false)
    private String nameEn;

    @Column(name = "description_th", nullable = false)
    private String descriptionTh;

    @Column(name = "description_en", nullable = false)
    private String descriptionEn;

    @Column(nullable = false)
    private int credit;

    @JsonIgnore
    @ManyToMany(mappedBy = "subjects")
    private Set<Semester> semester;

}
