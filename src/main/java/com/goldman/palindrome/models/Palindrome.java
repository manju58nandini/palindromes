package com.goldman.palindrome.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "palindromelong")
public class Palindrome {

	@Id
	String givenValue;

	String longestValue;

	public Palindrome(String givenValue, String longestValue) {
		super();
		this.givenValue = givenValue;
		this.longestValue = longestValue;
	}

	public Palindrome() {
		super();
	}

	public String getGivenValue() {
		return givenValue;
	}

	public void setGivenValue(String givenValue) {
		this.givenValue = givenValue;
	}

	public String getLongestValue() {
		return longestValue;
	}

	public void setLongestValue(String longestValue) {
		this.longestValue = longestValue;
	}

}
