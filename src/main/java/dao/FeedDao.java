package dao;

import dto.FeedDto;
import dto.MemberDto;
import mapper.FeedMapper;
import mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.swing.text.StyleContext;

@Repository
public class FeedDao {
    private SqlSession sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public FeedDto selectMember(final FeedDto feedDto){
        FeedMapper mapper = sqlSession.getMapper(FeedMapper.class);

        FeedDto result = mapper.writeFeed(feedDto);
        return  feedDto;
    }
}
