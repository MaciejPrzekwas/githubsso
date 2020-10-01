package pl.maciej.springbootopenid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiContr {

    @GetMapping("/front1")
    public String front1() {
        return "front1";
    }

    @GetMapping("/front2")
    public String front2() {
        return "front2";
    }

}
