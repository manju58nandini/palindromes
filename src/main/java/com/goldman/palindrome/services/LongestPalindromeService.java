package com.goldman.palindrome.services;

import java.util.List;

import com.goldman.palindrome.models.Palindrome;

public interface LongestPalindromeService {

	public Palindrome savelongestPalindrome(String value);

	public List<Palindrome> getAllPalindromes();

	

}
