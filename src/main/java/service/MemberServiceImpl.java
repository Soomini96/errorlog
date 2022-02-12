package service;

import dao.MemberDao;
import dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    @Override
    public MemberDto selectMember(String id) {
        System.out.println("inService!!");
        MemberDto memberDto = memberDao.selectMember(id);
        System.out.println("serviceDto: " + memberDto.getId());
        return memberDto;
    }
}
