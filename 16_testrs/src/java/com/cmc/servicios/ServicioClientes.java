package com.cmc.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/servicios")
public class ServicioClientes {

	@Path("/consulta")
	@GET
	public String metodo1(){
		return "saludando desde el rest web service";
	}
}

