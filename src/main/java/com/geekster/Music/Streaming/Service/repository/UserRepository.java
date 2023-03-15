package com.geekster.Music.Streaming.Service.repository;

import com.geekster.Music.Streaming.Service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
