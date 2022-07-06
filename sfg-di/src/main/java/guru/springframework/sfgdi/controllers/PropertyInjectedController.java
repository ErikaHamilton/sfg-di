package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController{
    //tells spring to inject greeting service
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;
    
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}