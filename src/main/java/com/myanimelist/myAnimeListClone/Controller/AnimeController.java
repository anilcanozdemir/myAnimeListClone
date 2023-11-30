package com.myanimelist.myAnimeListClone.Controller;


import com.myanimelist.myAnimeListClone.Entity.Item.Anime;
import com.myanimelist.myAnimeListClone.Service.AnimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anime")
@RequiredArgsConstructor
public class AnimeController {
    private AnimeService animeService;
    public Result add(Anime)
}
