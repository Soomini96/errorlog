package mapper;

import dto.MemberDto;

import java.util.List;

public interface MemberMapper {
    int joinMember(MemberDto memberDto);
    List<MemberDto> selectMembers();
    MemberDto selectMemberById(String id);
    MemberDto selectMemberByNo(int no);
    int updateMember(MemberDto memberDto);
    int deleteMemberByNo(int no);
    int deleteMemberById(String id);
}
