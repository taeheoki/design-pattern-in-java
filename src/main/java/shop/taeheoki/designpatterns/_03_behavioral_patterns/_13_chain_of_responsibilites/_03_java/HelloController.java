package shop.taeheoki.designpatterns._03_behavioral_patterns._13_chain_of_responsibilites._03_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
