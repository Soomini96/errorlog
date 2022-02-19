package service;

import dto.MemberDto;

import java.util.List;

public interface MemberService {
    int joinMember(MemberDto memberDto);
    MemberDto selectMemberById(String id);
    MemberDto selectMemberByNo(int no);
    List<MemberDto> selectMembers();
    int updateMember(MemberDto memberDto);
    int deleteMemberByNo(int no);
    int deleteMemberById(String id);

}
