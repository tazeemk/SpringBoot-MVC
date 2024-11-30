package com.nt.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonFinderServiceImpl implements ISeasonFinderService {

	@Override
	public String findSeason() {

		//getting date Object
		LocalDateTime ldt = LocalDateTime.now(); 
		
		//Get date in month value
		
		int month = ldt.getMonthValue();
		
		//perform business logics
		if(month>=5 && month<=9)
		return "Rainy Season";
		else if(month>=10 && month<=2)
			return "Winter Season";
		else
		return "Summer Season";
	}

}
