package com.example.backend.models.course;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "semesters", schema = "course")
public class Semester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonIgnore
    @ManyToMany(mappedBy = "semesters")
    private Set<Major> majors;

    @JsonIgnore
    @ManyToMany(mappedBy = "semesters")
    private Set<Specialization> specializations;

    @Column(nullable = false)
    private int semester_number;

    @ManyToMany
    @JoinTable(
            name = "semesters_subjects",
            joinColumns = @JoinColumn(name = "semester_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private Set<Subject> subjects;

    @Column(nullable = false)
    private BigDecimal tuition_fee = BigDecimal.ZERO;

}
