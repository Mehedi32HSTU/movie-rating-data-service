package com.spring.rest.models;

import java.util.List;

public class UserRating {
	private Long userId; 
	
	List<Rating> ratings;

	public UserRating() {
		
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
