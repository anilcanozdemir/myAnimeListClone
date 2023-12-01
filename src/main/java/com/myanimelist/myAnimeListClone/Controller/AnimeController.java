package com.myanimelist.myAnimeListClone.Controller;



import com.myanimelist.myAnimeListClone.Core.Result.DataResult;
import com.myanimelist.myAnimeListClone.Core.Result.Result;
import com.myanimelist.myAnimeListClone.DTOs.AnimeResponseDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeSaveRequestDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/anime")
@RequiredArgsConstructor
public class AnimeController implements CRUDController<AnimeResponseDto, AnimeSaveRequestDto, AnimeUpdateRequestDto> {


    @Override
    public ResponseEntity<Result> add(AnimeSaveRequestDto animeSaveRequestDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataResult<List<AnimeResponseDto>>> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<DataResult<AnimeResponseDto>> getById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Result> updateById(AnimeUpdateRequestDto animeUpdateRequestDto) {
        return null;
    }

    @Override
    public ResponseEntity<DataResult<AnimeResponseDto>> deleteById(Long id) {
        return null;
    }
}
