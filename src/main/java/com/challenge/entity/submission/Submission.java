package com.challenge.entity.submission;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Submission {

    @EmbeddedId
    private SubmissionIdentity identity;

    @NotNull
    @NotBlank
    private float score;

    @CreatedDate
    private LocalDateTime createdAt;


}
