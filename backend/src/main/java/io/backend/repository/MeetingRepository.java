package io.backend.repository;

import io.backend.model.MeetingEntity;
import io.backend.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MeetingRepository extends JpaRepository<MeetingEntity, Long> {

    Optional<List<MeetingEntity>> findAllByFromUser(UserEntity fromUser);

}
