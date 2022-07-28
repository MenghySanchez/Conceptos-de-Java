package com.cmc.wsrest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
	public Persona modificar(Persona per){
		System.out.println(per);
		Persona upPer = new Persona();
		upPer =  ServicioPersona.actualizar(per);
		return upPer;
	}
}
