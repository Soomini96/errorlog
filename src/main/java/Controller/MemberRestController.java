package Controller;

import dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.MemberService;

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
}
