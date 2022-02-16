package Controller;

import dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import service.MemberServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class MainController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MemberServiceImpl memberService;

    @Autowired
    MemberRestController memberRestController;

    void jdbcConnectionTest(){
        // 커넥션 연결을 확인하기 위한 try-catch
        try (Connection conn = dataSource.getConnection()){
            System.out.println("연결 성공 : " + conn);
        }catch(Exception e){
            System.out.println("연결 실패!");
            e.printStackTrace();
        }
    }

    @GetMapping("/")
    public String goIndex(){
        jdbcConnectionTest();
        return "index";
    }

    @GetMapping("/goMain")
    public String goMain(){
        return "main";
    }


    @GetMapping("/goWriteFeed")
    public String goWriteFeed(){
        return "feed/write";
    }

    @GetMapping("/goJoin")
    public String goJoin(){
        return "user/join";
    }
    @GetMapping("/goTetris")
    public String goTetris(){
        return "game/tetris";
    }

    @PostMapping("/goLogin") // 비회원일시 alert창 뜨게! 추가하기
    public String goLogin(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        String log = (String) request.getParameter("id");
        MemberDto dto = this.memberService.selectMember(log);

        model.addAttribute("memberModel", dto);

        System.out.println("log:"+log);
        session.setAttribute("log", dto);

        return "view";
    }

    @GetMapping("/all-members")
    public String showAllMembers(Model model){
        List<MemberDto> memberList = memberRestController.getAllMember();
        model.addAttribute("memberList", memberList);
        System.out.println("컨트롤러 리`턴!");
        return "viewAllUser";
    }
}
