package com.geekster.Music.Streaming.Service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "songs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Song {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        @NotBlank(message = "Title is mandatory")
        private String title;

        @Column(nullable = false)
        @NotBlank(message = "Artist is mandatory")
        private String artist;

        @Column(nullable = false)
        @NotBlank(message = "Genre is mandatory")
        private String genre;
}
