package com.myanimelist.myAnimeListClone.Entity;

import com.myanimelist.myAnimeListClone.Enums.MangaType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "manga")
public class Manga extends Item {
    @Column
    @Enumerated(EnumType.STRING)
    private MangaType mangaType;
    private Magazine serializationMagazine;


}