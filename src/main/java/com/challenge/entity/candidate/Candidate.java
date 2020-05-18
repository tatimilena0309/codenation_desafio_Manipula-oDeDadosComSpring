package com.challenge.entity.candidate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Candidate {

    @EmbeddedId
    private CandidateIdentity identity;

    @NotNull
    private int status;

    @CreatedDate
    private LocalDateTime createdAt;
}
