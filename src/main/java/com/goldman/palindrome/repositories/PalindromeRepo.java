package com.goldman.palindrome.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.goldman.palindrome.models.Palindrome;

@Repository
public interface PalindromeRepo extends CrudRepository<Palindrome, Long> {

}
