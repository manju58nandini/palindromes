package com.goldman.palindrome.serviceimpls;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldman.palindrome.models.Palindrome;
import com.goldman.palindrome.repositories.PalindromeRepo;
import com.goldman.palindrome.services.LongestPalindromeService;

@Service
public class LongestPalindromeServiceImpl implements LongestPalindromeService {

	@Autowired
	PalindromeRepo palindromeRepo;

	@Override
	public Palindrome savelongestPalindrome(String input) {
		int[] currentLongest = { 0, 1 };

		for (int i = 1; i < input.length(); i++) {
			int[] odd = expandCenter(input.toCharArray(), i - 1, i + 1);
			int[] even = expandCenter(input.toCharArray(), i - 1, i);
			int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
			currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
		}
		String longestValue = input.substring(currentLongest[0], currentLongest[1]);
		Palindrome p = new Palindrome(input, longestValue);
		return palindromeRepo.save(p);
	}

	public int[] expandCenter(char[] inputCharArray, int leftIndex, int rightIndex) {
		while (leftIndex >= 0 && rightIndex < inputCharArray.length) {
			if (inputCharArray[leftIndex] != inputCharArray[rightIndex])
				break;
			leftIndex--;
			rightIndex++;
		}
		int[] value = { leftIndex + 1, rightIndex };
		return value;
	}

	@Override
	public List<Palindrome> getAllPalindromes() {
		return StreamSupport.stream(palindromeRepo.findAll().spliterator(), false).collect(Collectors.toList());
	}

}
