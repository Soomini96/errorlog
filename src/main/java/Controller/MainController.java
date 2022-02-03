package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String goIndex(){
        return "index";
    }

    @GetMapping("/goMain")
    public String goMain(){
        return "main";
    }
}
