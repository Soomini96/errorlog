package dao;

import mapper.FeedLikeMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.Map;

public class FeedLikeDao {
    private SqlSession sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    // 사용자의 게시글 좋아요 여부 학인
    public boolean checkByIdAndNo(Map map){
        FeedLikeMapper feedLikeMapper = sqlSession.getMapper(FeedLikeMapper.class);
        return feedLikeMapper.checkByIdAndNo(map);
    }
}
