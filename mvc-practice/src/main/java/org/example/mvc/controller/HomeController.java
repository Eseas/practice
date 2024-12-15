package org.example.mvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.mvc.annotation.Controller;
import org.example.mvc.annotation.RequestMapping;
import org.example.mvc.repository.UserRepository;

@Controller
public class HomeController {
    @RequestMapping(value = "/mvc", method = RequestMethod.GET)
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("users", UserRepository.findAll());
        return "home";
    }
}