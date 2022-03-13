package mapper;

import dto.FeedLikeDto;

import java.util.Map;

public interface FeedLikeMapper {
    public FeedLikeDto checkByIdAndNo(Map map);
    public void checkLike(FeedLikeDto feedLikeDto);
}
