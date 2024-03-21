package com.eb.annotationclass;

import org.springframework.stereotype.Service;

@Service
public class DisplayInfoImpl implements DisplayInfo{

	@Override
	public String disp(String name) {
		
		return "Name is "+name;
	}

}
