package com.myanimelist.myAnimeListClone.Entity.Item;

import com.myanimelist.myAnimeListClone.Entity.Company.Magazine;
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
    @ManyToOne
    @JoinColumn(name = "serialization_magazine_id")
    private Magazine serializationMagazine;


}