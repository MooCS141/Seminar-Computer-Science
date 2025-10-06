package com.example.backend.models.course;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "majors", schema = "course")
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "program_id", referencedColumnName = "id")
    private Program program;

    @Column(name = "name_th", nullable = false, unique = true)
    private String nameTh;

    @Column(name = "name_en", nullable = false, unique = true)
    private String nameEn;

    @Column(name = "description_th", nullable = false, unique = true)
    private String descriptionTh;

    @Column(name = "description_en", nullable = false, unique = true)
    private String descriptionEn;

    @ManyToMany
    @JoinTable(
            name = "majors_semesters",
            joinColumns = @JoinColumn(name = "major_id"),
            inverseJoinColumns = @JoinColumn(name = "semester_id")
    )
    private Set<Semester> semesters;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDate createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @Column(nullable = false)
    private boolean status = false;

    @JsonBackReference
    @OneToMany(mappedBy = "major", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Specialization> specializations;

}
