package com.sam.movie_ticket.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyErrorController implements ErrorController {
	
	@RequestMapping("/error")
	public String errorHandling(HttpServletRequest request)
	{
	 int error=(int) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	 if(error==404)
	 {
		 return "404.html";
	 }
	 else
	 {
		 return "505.html";
	 }
	}

}
