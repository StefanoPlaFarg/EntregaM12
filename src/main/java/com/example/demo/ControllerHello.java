/**
 * 
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

/**
 * @author stefano
 *
 */

@Controller
public class ControllerHello {
	
	 /**
	  * Metode que mapeja l'endpoint /hello/{name} des de l' index.html (carpeta static) i retorna al navegador l'arxiu hello.html amb el nom (carpeta templates)
	  * 
	 * @param model
	 * @return  hello.html
	 */
	
		@GetMapping("/hello/{name}")
		// @ResponseBody
		String hello(@PathVariable("name") String name, Model model) {

			model.addAttribute("name", name);
			return "hello";
		}
}





