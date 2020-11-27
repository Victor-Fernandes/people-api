package one.digitalinovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class PersonController {
  
  @GetMapping
  public String getBook(){
    return "Hi Fucking world";
  }
}
