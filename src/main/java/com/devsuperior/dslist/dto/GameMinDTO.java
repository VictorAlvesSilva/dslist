package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
public class GameMinDTO {
	private long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = title;
		this.year = year;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
	}
