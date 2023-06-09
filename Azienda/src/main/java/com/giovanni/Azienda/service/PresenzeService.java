package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;
import com.giovanni.Azienda.model.Presenze;

public interface PresenzeService {
	
	void savePresenze(Presenze presenze);
	List<Presenze> getAll();
	Optional<Presenze> findById(int id);
	void deletePresenze(Presenze presenze);
	List<String[]> findQtaPresenze(int id);	
	List<String[]> findQtaAssenze(int id);
	List<String[]> findOrePermessi(int id);
	
}

