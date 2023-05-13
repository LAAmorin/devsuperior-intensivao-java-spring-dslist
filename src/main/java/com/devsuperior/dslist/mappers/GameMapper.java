package com.devsuperior.dslist.mappers;

import org.mapstruct.Mapper;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;

@Mapper(componentModel = "spring")
public interface GameMapper {
	
	
	GameMinDTO gameToGameMinDTO(Game game);	

}
