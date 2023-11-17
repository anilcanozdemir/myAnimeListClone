package com.myanimelist.myAnimeListClone.Entity;

import com.myanimelist.myAnimeListClone.Enums.AnimeType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "anime")
public class Anime extends Item {
    @Column
    @Enumerated(EnumType.STRING)

    private AnimeType animeType;
}