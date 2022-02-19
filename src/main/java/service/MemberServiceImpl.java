package service;

import dao.MemberDao;
import dto.MemberDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    public int joinMember(MemberDto memberDto) {
        return memberDao.joinMember(memberDto);
    }

    public MemberDto selectMemberById(String id) {
        MemberDto memberDto = memberDao.selectMemberById(id);
        return memberDto;
    }

    public MemberDto selectMemberByNo(int no){
        return memberDao.selectMemberByNo(no);
    }

    public List<MemberDto> selectMembers() {
        return memberDao.selectMembers();
    }

    @Transactional
    public int updateMember(MemberDto memberDto) {
        if(memberDao.selectMemberById(memberDto.getId()) != null){
            return  memberDao.updateMember(memberDto);
        }
        return 0;
    }

    @Transactional
    public int deleteMemberByNo(int no) {
        if(memberDao.selectMemberByNo(no) != null){
            return memberDao.deleteMemberByNo(no);
        }
        return 0;
    }

    @Transactional
    public int deleteMemberById(String id) {
        if(memberDao.selectMemberById(id) != null){
            return memberDao.deleteMemberById(id);
        }
        return 0;
    }


}
