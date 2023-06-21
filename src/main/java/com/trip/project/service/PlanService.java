package com.trip.project.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.trip.project.dto.LoginDTO;
import com.trip.project.dto.PlaceDTO;

public interface PlanService {
	
	public List<PlaceDTO> placeCategoryMarker(String categoey);
	
	public List<PlaceDTO> placeRestaurantList();

	public List<LoginDTO> genderList(int recommandPlaceNumber);
	
	public List<LoginDTO> birthList(int recommandPlaceNumber);
}
