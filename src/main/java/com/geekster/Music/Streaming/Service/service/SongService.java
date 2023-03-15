package com.geekster.Music.Streaming.Service.service;

import com.geekster.Music.Streaming.Service.exception.ResourceNotFoundException;
import com.geekster.Music.Streaming.Service.model.Song;
import com.geekster.Music.Streaming.Service.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public Song addSong(Song song) {
        return songRepository.save(song);
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public Song getSongById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    public Song updateSong(Long id, Song song) {
        Song existingSong = songRepository.findById(id).orElse(null);
        if (existingSong != null) {
            existingSong.setTitle(song.getTitle());
            existingSong.setArtist(song.getArtist());
            existingSong.setGenre(song.getGenre());
            return songRepository.save(existingSong);
        } else {
            return null;
        }
    }

    public boolean deleteSong(Long id) {
        Song existingSong = songRepository.findById(id).orElse(null);
        if (existingSong != null) {
            songRepository.delete(existingSong);
            return true;
        } else {
            return false;
        }
    }
}
