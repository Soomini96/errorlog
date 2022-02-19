package dao;

import dto.MemberDto;
import mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDao {

    private SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    public int joinMember(final MemberDto memberDto){
        MemberMapper mapper = this.sqlSession.getMapper(MemberMapper.class);
        return mapper.joinMember(memberDto);  // 성공시 1 반환
    }

    public MemberDto selectMemberById(final String id){
        MemberMapper mapper = this.sqlSession.getMapper(MemberMapper.class);
        return mapper.selectMemberById(id);
    }
    public MemberDto selectMemberByNo(final int no){
        MemberMapper mapper = this.sqlSession.getMapper(MemberMapper.class);
        return mapper.selectMemberByNo(no);
    }

    public List<MemberDto> selectMembers(){
        MemberMapper mapper = this.sqlSession.getMapper(MemberMapper.class);
        return mapper.selectMembers();
    }


    public int updateMember(final MemberDto memberDto){
        MemberMapper mapper = this.sqlSession.getMapper(MemberMapper.class);
        return mapper.updateMember(memberDto); // 업데이트 한 행의 개수 반환
    }

    public int deleteMemberByNo(final int no){
        MemberMapper mapper = this.sqlSession.getMapper(MemberMapper.class);
        return mapper.deleteMemberByNo(no); // 삭제 한 행의 개수 반환
    }

    public int deleteMemberById(final String id){
        MemberMapper mapper = this.sqlSession.getMapper(MemberMapper.class);
        return mapper.deleteMemberById(id); // 삭제 한 행의 개수 반환
    }
}
