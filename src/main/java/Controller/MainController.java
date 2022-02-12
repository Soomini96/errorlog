package Controller;

import dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import service.MemberServiceImpl;

import javax.sql.DataSource;
import java.sql.Connection;

@Controller
public class MainController {

    @Autowired
    MemberServiceImpl memberService;

    @Autowired
    DataSource ds;

    @GetMapping("/")
    public String goIndex(Model model){
        // 커넥션 연결을 확인하기 위한 try-catch
        try (Connection conn = ds.getConnection()){
            System.out.println("연결 성공 : " + conn);
        }catch(Exception e){
            System.out.println("연결 실패");
            e.printStackTrace();
        }
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
    @GetMapping("/goTetris")
    public String goTetris(){
        return "game/tetris";
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


    // MyBatis Test용 메서드
    @GetMapping("/login/{id}")
    public String loginTestResult(@PathVariable String id, Model model){
        MemberDto dto = memberService.selectMember(id);

        System.out.println("id: " + id);
        System.out.println("dto: " + dto.getId());

        model.addAttribute("member", dto);

        return "view";
    }
}
