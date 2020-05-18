package com.challenge.entity.user;

import com.challenge.entity.candidate.Candidate;
import com.challenge.entity.submission.Submission;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@EntityListeners(AuditingEntityListener.class)
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String fullname;

    @NotNull
    @NotBlank
    @Email
    @Size(max = 100)
    private String email;

    @NotNull
    @NotBlank
    @Size(max = 50)
    private String nickname;

    @NotNull
    @NotBlank
    @Size(max = 255)
    private String password;

    @CreatedDate
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "identity.user")
    private List<Candidate> candidates;

    @OneToMany(mappedBy = "identity.user")
    private List<Submission>submissions;

}
