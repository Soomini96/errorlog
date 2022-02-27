package service;

import dao.FollowDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowServiceImpl implements FollowService{

    private FollowDao followDao;
    public void setFollowDao(FollowDao followDao) {
        this.followDao = followDao;
    }

    @Override
    public List<String> selectFollowIdByUserId(String user_id) {
        return followDao.selectFollowIdByUserId(user_id);
    }
}
