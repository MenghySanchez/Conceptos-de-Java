package com.cmc.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {

	private static Logger logger = LogManager.getLogger(Admin.class);
	
	public void agregar(){
		logger.warn("Mensaje de warn");
		logger.info("Mensaje de info");		
		logger.debug("loger debug");
		// mostrar variables o constantes que generen el error
		logger.trace("loger de trace"); 
		// el valor de trace es para mostrar los errores mas detallados
		// secciones de codigo, constructores
		logger.error("Logger de error"); 
		// indpendinete del nivel el error siempre sale en el log
		
		}
	
}
