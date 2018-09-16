package com.example.demo.service;

import java.util.List;
import java.util.Set;

public interface GenericService<T> {

	List<T> getAll();
	T getOne(int theId);
	Set<T> search(String word);
	List<T> sortHeader();
	List<T> sortDate();
	void createOne(T theObject);
	T updateOne(T theObject);
	void deleteOne(int theId);
	
}
