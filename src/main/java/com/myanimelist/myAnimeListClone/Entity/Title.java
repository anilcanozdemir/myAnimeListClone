package com.myanimelist.myAnimeListClone.Entity;

import com.myanimelist.myAnimeListClone.Enums.Language;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "title")
public class Title {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private Language language;
    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;

}