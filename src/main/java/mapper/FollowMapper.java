package mapper;

import java.util.List;

public interface FollowMapper {
    public List<String> selectFollowIdByUserId(String user_id);
}
