package dao;

import dto.FollowDto;
import mapper.FollowMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class FollowDao {
    private SqlSession sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<String> selectFollowIdByUserId(final String user_id){
        FollowMapper mapper = this.sqlSession.getMapper(FollowMapper.class);
        return mapper.selectFollowIdByUserId(user_id);
    }
}
