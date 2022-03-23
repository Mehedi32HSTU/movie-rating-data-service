package com.spring.rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.models.Rating;
import com.spring.rest.models.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@RequestMapping(value="/{movieId}", method = RequestMethod.GET)
    public ResponseEntity<?> getRating(@PathVariable("movieId") Long movieId) {
        Rating rating = new Rating(movieId, 4D);
        
        return ResponseEntity.ok().body(rating);
    }
	
	@RequestMapping(value="/user/{userId}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserRating(@PathVariable("userId") Long userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating(1001L,5D),
				new Rating(1002L,6D),
				new Rating(1003L,10D),
				new Rating(1005L,7D),
				new Rating(1004L,9D)
				);
        UserRating userRating = new UserRating();
        userRating.setUserId(userId);
        userRating.setRatings(ratings);
        return ResponseEntity.ok().body(userRating);
    }
	
	

}
