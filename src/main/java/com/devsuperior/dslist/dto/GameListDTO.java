package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO(GameList list) {
		BeanUtils.copyProperties(list, this);
	}

	public Long getId() { return id; }
	public void setId(Long value) { this.id = value; }

	public String getName() { return this.name; }
	public void setName(String value) { this.name = value; }

}
