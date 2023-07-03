package com.trip.project.service;

import java.io.IOException;
import java.util.List;

import com.trip.project.dto.WeatherDTO;

public interface WeatherService {

		// 제주 날씨
		public List<WeatherDTO> Jeju() throws IOException;
		
		// 서귀포 날씨
		public List<WeatherDTO> Seogwipo() throws IOException;
}
