package com.challenge.entity.submission;

import com.challenge.entity.challenge.Challenge;
import com.challenge.entity.user.User;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@EntityListeners(AuditingEntityListener.class)
@Embeddable
public class SubmissionIdentity implements Serializable {

    @ManyToOne
    private User user;

    @ManyToOne
    private Challenge challenge;

}
