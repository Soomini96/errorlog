package Controller;

import dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.MemberService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class MemberRestController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/v1/member")
    public int joinMember(@RequestBody MemberDto memberDto) {
        return memberService.joinMember(memberDto);
    }

    @GetMapping("/v1/members")
    public List<MemberDto> selectMembers() {
        return memberService.selectMembers();
    }

    @GetMapping("/v1/member/id={id}")
    public MemberDto selectMemberById(@PathVariable String id) {
        return memberService.selectMemberById(id);
    }

    @GetMapping("/v1/member/no={no}")
    public MemberDto selectMemberByNo(@PathVariable int no) {
        return memberService.selectMemberByNo(no);
    }

    @PutMapping("/v1/member")
    public int updateMember(MemberDto memberDto) {
        return memberService.updateMember(memberDto);
    }

    @DeleteMapping("/v1/member/{no}")
    public int deleteMemberByNo(@PathVariable int no) {
        return memberService.deleteMemberByNo(no);
    }

    @DeleteMapping("/v1/member/{id}")
    public int deleteMemberById(@PathVariable String id) {
        return memberService.deleteMemberById(id);
    }

    public String goLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String url = null;
        String id = (String) request.getParameter("id");
        String pw = (String) request.getParameter("pw");

        MemberDto member = memberService.selectMemberById(id);

        if(member == null) {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('해당 아이디 존재하지 않음');</script>");
            out.flush();

            System.out.println("해당 아이디 존재하지 않음");
            url = "index";
        }else if(!member.getPw().equals(pw)){
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('비밀번호가 틀렸습니다.');</script>");
            out.flush();

            System.out.println("비밀번호가 틀렸습니다.");
            url = "index";
        }else if(member.getPw().equals(pw)){
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('로그인 성공');</script>");
            out.flush();

            System.out.println("로그인 성공");

            HttpSession session = request.getSession();
            session.setAttribute("log", member.getId());
            url = "main";
        }
//        MemberDto dto = selectMemberById(log);

//        model.addAttribute("memberModel", dto);
        return url;
    }
}
