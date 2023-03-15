package com.geekster.Music.Streaming.Service.repository;

import com.geekster.Music.Streaming.Service.model.Playlist;


import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

    Optional<Playlist> findByNameAndUser(String name, User user);

}
