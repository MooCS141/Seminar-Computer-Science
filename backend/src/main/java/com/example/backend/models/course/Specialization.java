package com.example.backend.models.course;

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
@Table(name = "specializations", schema = "course")
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "major_id", referencedColumnName = "id")
    private Major major;

    @ManyToMany
    @JoinTable(
            name = "specializations_semesters",
            joinColumns = @JoinColumn(name = "specialization_id"),
            inverseJoinColumns = @JoinColumn(name = "semester_id")
    )
    private Set<Semester> semesters;

    @Column(name = "name_th", nullable = false, unique = true)
    private String nameTh;

    @Column(name = "name_en", nullable = false, unique = true)
    private String nameEn;

    @Column(name = "description_th", nullable = false, unique = true)
    private String descriptionTh;

    @Column(name = "description_en", nullable = false, unique = true)
    private String descriptionEn;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDate createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @Column(nullable = false)
    private boolean status = false;

}
