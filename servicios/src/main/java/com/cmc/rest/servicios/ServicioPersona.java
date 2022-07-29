package com.cmc.rest.servicios;


import com.cmc.rest.commons.ValidationException;
import com.cmc.rest.entidades.Persona;

public class ServicioPersona {

	public static Persona actualizar(Persona p) throws ValidationException{
	
		if(p.getNombre().length()<=3){
			throw new ValidationException("el nombre es muy corto");
		}if(p.getApellido().length()<=3){
			throw new ValidationException("El apellido es muy corto");
		}
			p.setNombre(p.getNombre().toUpperCase());
			p.setApellido(p.getApellido().toUpperCase());
			return p;
	}
}
