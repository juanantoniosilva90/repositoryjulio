package com.persona.service;

import java.util.List;
import java.util.Optional;

import com.persona.modelo.Persona;

public interface IPersonaService {

	public List<Persona> listPersona();
	public Optional<Persona> getPersonaById(int id);
	public int save (Persona persona);
	public void delete (int id);
	
}