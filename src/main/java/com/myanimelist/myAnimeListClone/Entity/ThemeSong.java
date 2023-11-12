package com.myanimelist.myAnimeListClone.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "theme_song")
public class ThemeSong {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;

}