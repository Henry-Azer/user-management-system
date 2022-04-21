package org.henry.transformer;

import org.henry.dto.BaseDto;
import org.henry.entity.BaseEntity;
import org.henry.transformer.mapper.BaseMapper;

import java.util.List;
import java.util.stream.Collectors;

public interface BaseTransformer<Entity extends BaseEntity, Dto extends BaseDto, Mapper extends BaseMapper<Entity, Dto>> {

    Mapper getMapper();

    default Dto transformEntityToDto(Entity entity) {
        return getMapper().entityToDto(entity);
    }

    default List<Dto> transformEntityToDto(List<Entity> entities) {
        return entities.stream().map(this::transformEntityToDto).collect(Collectors.toList());
    }

    default Entity transformDtoToEntity(Dto dto) {
        return getMapper().dtoToEntity(dto);
    }

    default List<Entity> transformDtoToEntity(List<Dto> dtos) {
        return dtos.stream().map(this::transformDtoToEntity).collect(Collectors.toList());
    }

    default void updateEntity(Dto dto, Entity entity) {
        getMapper().updateEntity(dto, entity);
    }

}
