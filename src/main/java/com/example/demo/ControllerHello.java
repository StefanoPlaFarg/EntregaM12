/**
 * 
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

/**
 * @author stefano
 *
 */

@Controller
public class ControllerHello {
	
	 @GetMapping("/hello")
	 //@ResponseBody
	    String hello(Model model) {
	        return "hello";
	 }
}




