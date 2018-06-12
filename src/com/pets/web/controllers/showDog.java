package com.pets.web.controllers;

//import the class Dog:
import com.pets.web.models.Dog;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

// User comes to /showDog. Apache Webserver finds the route below
@WebServlet("/showDog")
public class showDog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public showDog() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		User comes to /showDog with a get Request. We have to create the three variables below and add the value as given via POST
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		int weigth = Integer.valueOf(request.getParameter("weigth"));
//		Below, I create a new Object Dog with the name dogs and the attributes from above
		Dog dogs = new Dog(name, breed, weigth);
//		The setAttribute will handover the object information as created above. the first attribute is the key and the second the value (Object Name)
		request.setAttribute("dog", dogs);
//		The setAttribute gets handed over to the dogs.jsp file as shown in the Dispatcher belwo
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dogs.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
