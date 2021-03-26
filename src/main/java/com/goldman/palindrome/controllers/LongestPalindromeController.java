package com.goldman.palindrome.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goldman.palindrome.models.Palindrome;
import com.goldman.palindrome.services.LongestPalindromeService;

@RestController
public class LongestPalindromeController {

	@Autowired
	LongestPalindromeService palindromeService;

	@RequestMapping(value = "insertLongPalindrome", method = RequestMethod.GET)
	public ResponseEntity<?> insertLongPalindrome(@RequestParam String value) {
		try {
			return new ResponseEntity<Palindrome>(palindromeService.savelongestPalindrome(value), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "getAllPalindromes", method = RequestMethod.GET)
	public ResponseEntity<?> getAllPalindromes() {
		try {
			return new ResponseEntity<List<Palindrome>>(palindromeService.getAllPalindromes(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
