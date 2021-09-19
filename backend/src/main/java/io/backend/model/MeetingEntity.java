package io.backend.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "meetingTable")
@Table(name = "meeting_table")
public class MeetingEntity {

    @Id
    @GeneratedValue
    @Column(name = "meeting_id", nullable = false)
    private Long inviteID;

    @ManyToOne
    @JoinColumn(name = "received_invite")
    private UserEntity receivedInvite;

    @ManyToOne
    @JoinColumn(name = "sent_invite")
    private UserEntity sentInvite;

    @Column(name = "status", nullable = false)
    private String status = "pending";

    @Column(name = "date")
    private Date timeStamp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeetingEntity that = (MeetingEntity) o;
        return Objects.equals(inviteID, that.inviteID) && Objects.equals(receivedInvite, that.receivedInvite) && Objects.equals(sentInvite, that.sentInvite) && Objects.equals(status, that.status) && Objects.equals(timeStamp, that.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteID, receivedInvite, sentInvite, status, timeStamp);
    }
}
