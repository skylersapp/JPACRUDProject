package com.skilldistillery.jpacrudmacbookboot.data;

import java.util.List;

import com.skilldistillery.jpacrudmacbook.entities.Macbook;

public interface MacbookDAO {


		Macbook findMacbookById(Integer id);

		List<Macbook> findAll();
		
		boolean delete(Integer id);
		
		Macbook update(Integer id, Macbook macbook);

		Macbook create(Macbook macbook);

	}


