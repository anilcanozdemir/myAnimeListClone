package com.myanimelist.myAnimeListClone.Core.ModelMapper;

public interface MapperProfile<EntityResponseDto, EntitySaveRequestDto, EntityUpdateRequestDto,Entity> {
    EntityResponseDto entitytoResponseDto(Entity entity);
    Entity saveRequestDtoToEntity(EntitySaveRequestDto saveRequestDto);

    Entity updateRequestDtoEntity(EntityUpdateRequestDto updateRequestDto);
}
