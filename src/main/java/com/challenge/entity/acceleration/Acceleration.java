package com.challenge.entity.acceleration;

import com.challenge.entity.candidate.Candidate;
import com.challenge.entity.challenge.Challenge;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.List;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Acceleration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @NotNull
    @NotBlank
    @Size(max = 100)
    private String name;

    @NotNull
    @NotBlank
    @Size(max = 50)
    private String slug;

    @CreatedDate
    private LocalDateTime createdAt;

    @ManyToOne
    private Challenge challenge;

    @OneToMany(mappedBy = "identity.acceleration")
    private List<Candidate> candidateList;

}
