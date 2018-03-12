package com.puzhen.in28minutes;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {

	public boolean validate(String username, String password) {
		if ("tom".equals(username) && "123".equals(password)) 
			return true;
		return false;
	}
}
