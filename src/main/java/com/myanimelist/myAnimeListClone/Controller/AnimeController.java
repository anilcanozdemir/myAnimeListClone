package com.myanimelist.myAnimeListClone.Controller;


import com.myanimelist.myAnimeListClone.Core.Result.DataResult;
import com.myanimelist.myAnimeListClone.Core.Result.Result;
import com.myanimelist.myAnimeListClone.DTOs.AnimeResponseDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeSaveRequestDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeUpdateRequestDto;
import com.myanimelist.myAnimeListClone.Service.Contracts.AnimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/anime")
@RequiredArgsConstructor
public class AnimeController implements CRUDController<AnimeResponseDto, AnimeSaveRequestDto, AnimeUpdateRequestDto> {
    private final AnimeService animeService;

    @Override
    @PostMapping("/add")
    public ResponseEntity<Result> add(AnimeSaveRequestDto animeSaveRequestDto) {
        return ResponseEntity.ok().body(animeService.add(animeSaveRequestDto));
    }

    @Override
    @GetMapping("getAll")
    public ResponseEntity<DataResult<List<AnimeResponseDto>>> getAll() {
        return ResponseEntity.ok().body(animeService.getAll());
    }

    @Override
    @GetMapping("getById")
    public ResponseEntity<DataResult<AnimeResponseDto>> getById(@RequestParam Long id) {
        return ResponseEntity.ok().body(animeService.getById(id));
    }

    @Override
    @PostMapping("/updateById")
    public ResponseEntity<Result> updateById(@RequestBody AnimeUpdateRequestDto animeUpdateRequestDto, @RequestParam Long id) {
        return ResponseEntity.ok().body(animeService.updateById(animeUpdateRequestDto, id));
    }

    @Override
    @DeleteMapping("/deleteById")
    public ResponseEntity<DataResult<AnimeResponseDto>> deleteById(@RequestParam Long id) {
        return ResponseEntity.ok().body(animeService.deleteByid(id));

    }
}
