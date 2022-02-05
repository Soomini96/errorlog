package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Map;

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

    @GetMapping("/goJoin")
    public String goJoin(){
        return "user/join";
    }
//    @PostMapping("/goLogin")
//    public String goLogin(HttpServletRequest request){
//        System.out.println();
////        return userController.checkLogin(data, request, response);
//    }
//    @PostMapping("/goLogin")
//    public String goLogin(@RequestParam Map<String, String> data, HttpServletRequest request, HttpServletResponse response) throws IOException {
//        return userController.checkLogin(data, request, response);
//    }
}
