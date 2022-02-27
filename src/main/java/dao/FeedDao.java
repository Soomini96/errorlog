package dao;

import dto.FeedDto;
import dto.MemberDto;
import mapper.FeedMapper;
import mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.swing.text.StyleContext;
import java.util.List;

@Repository
public class FeedDao {

    private SqlSession sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public int writeFeed(final FeedDto feedDto){
        FeedMapper mapper = sqlSession.getMapper(FeedMapper.class);
        return mapper.writeFeed(feedDto);
    }

    public List<FeedDto> allFeed(){
        FeedMapper mapper = sqlSession.getMapper(FeedMapper.class);
        return mapper.allFeed();
    }
}
