package com.cmc.wsrest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cmc.rest.commons.ValidationException;
import com.cmc.rest.entidades.Persona;
import com.cmc.rest.servicios.ServicioPersona;

@Path("/personas")
public class PersonaRest {
	
	@Path("/mgs")
	@GET
	public String msg(){
		return "si esta llegando a PersonaRest";
	}
	
	@Path("/cambiar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Persona modificar(Persona per) throws ValidationException{
		System.out.println(per);
		Persona upPer = new Persona();
		try {
			upPer =  ServicioPersona.actualizar(per);
			return upPer;
		} catch (ValidationException e) {
			e.printStackTrace();
		}
		return upPer;
	}
	
	
	@Path("/cambio")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public static Response cambiar(Persona per){
		
		System.out.println(per);
		Persona persona = null;
		
		try {
			persona=ServicioPersona.actualizar(per);
		} catch (ValidationException e) {
			e.printStackTrace();
			return Response.status(200).entity(e.getMessage()).build();
		}
		return Response.status(200).entity(persona).build();
	}
}
