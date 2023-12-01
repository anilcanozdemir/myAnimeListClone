package com.myanimelist.myAnimeListClone.Service.Contracts;



import java.util.List;

public interface CRUDService<EntityResponseDto, EntitySaveRequestDto, EntityUpdateRequestDto> {

    Result add(EntitySaveRequestDto entitySaveRequestDto);

    DataResult<EntityResponseDto> deleteByid(Long id);

    DataResult<List<EntityResponseDto>> getAll();

    DataResult<EntityResponseDto> getById(Long id);

    Result updateById(EntityUpdateRequestDto entityUpdateRequestDto);
}
