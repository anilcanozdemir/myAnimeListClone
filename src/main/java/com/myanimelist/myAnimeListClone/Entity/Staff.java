package com.myanimelist.myAnimeListClone.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "staff")
public class Staff {
    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;

}