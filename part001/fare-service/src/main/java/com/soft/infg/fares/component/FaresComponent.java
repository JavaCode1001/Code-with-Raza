package com.soft.infg.fares.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soft.infg.fares.entity.Fare;
import com.soft.infg.fares.repository.FaresRepository;

@Component 
public class FaresComponent {
	private static final Logger logger = LoggerFactory.getLogger(FaresComponent.class);

	FaresRepository faresRepository;
	
	public FaresComponent(){
		
	}
	@Autowired
	public FaresComponent(FaresRepository faresRepository){
		this.faresRepository = faresRepository;
	}

	public Fare getFare(String flightNumber, String flightDate){ 
		logger.info("Looking for fares flightNumber "+ flightNumber + " flightDate "+ flightDate);
		return faresRepository.getFareByFlightNumberAndFlightDate(flightNumber, flightDate);
	}
}
