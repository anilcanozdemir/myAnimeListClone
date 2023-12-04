package com.myanimelist.myAnimeListClone.Repository;

import com.myanimelist.myAnimeListClone.Entity.Item.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
