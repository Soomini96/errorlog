package Controller;

import dto.FeedDto;
import dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.FeedService;
import service.MemberService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private MemberRestController memberRestController;
    @Autowired
    private FeedRestController feedRestController;

    @Autowired
    private MemberService memberService;
    @Autowired
    private FeedService feedService;


    void jdbcConnectionTest() {
        // 커넥션 연결을 확인하기 위한 try-catch
        try (Connection conn = dataSource.getConnection()) {
            System.out.println("연결 성공 : " + conn);
        } catch (Exception e) {
            System.out.println("연결 실패!");
            e.printStackTrace();
        }
    }

    @GetMapping("/")
    public String goIndex() {
        jdbcConnectionTest();
        return "index";
    }

    @GetMapping("/goMain")
    public String goMain() {
        return "main";
    }

    @GetMapping("/goTest") // 마크다운 테스트용
    public String goTest(){
        return "user/test";
    }


    @GetMapping("/goWriteFeed")
    public String goWriteFeed() {
        return "feed/write";
    }

    @GetMapping("/goAllFeed")
    public String goAllFeed() {
        return "feed/allFeed";
    }

    @RequestMapping("/goFeed/no={no}")
    public String goFeed(Model model,@PathVariable int no){
        model.addAttribute("no",no);
        return "feed/Feed";
    }

    @GetMapping("/goJoin")
    public String goJoin() {
        return "user/join";
    }

    @GetMapping("/goTetris")
    public String goTetris() {
        return "game/tetris";
    }

    @PostMapping("/goLogin") // 비회원일시 alert창 뜨게! 추가하기
    public String goLogin(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        return memberRestController.goLogin(request, response);
    }

    @GetMapping("/goLogout")
    public String goLogout(HttpServletRequest request) throws IOException {
        request.getSession().removeAttribute("log");
        return "index";
    }

    @GetMapping("/goMarkdown")
    public String goMarkdown(){
        return "user/markdown";
    }

    @GetMapping("/all-members")
    public String selectMembers(Model model) {
        List<MemberDto> memberList = memberService.selectMembers();
        model.addAttribute("memberList", memberList);
        System.out.println("컨트롤러 리!턴!");
        return "viewAllUser";
    }

    @PostMapping("/post-feed")
    public String writeFeed(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String imagefile = request.getParameter("imagefile");
        String content = request.getParameter("content");

        FeedDto feed = new FeedDto(id,imagefile,content);
        System.out.println(feed);
        feedRestController.writeFeed(feed);
        return "feed/allFeed";
    }

//    public String joinMember(String id){
//
//    }
}
