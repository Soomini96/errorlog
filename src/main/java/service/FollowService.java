package service;

import java.util.List;

public interface FollowService {
    public List<String> selectFollowIdByUserId(String user_id);
}
