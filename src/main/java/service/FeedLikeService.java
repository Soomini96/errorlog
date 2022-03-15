package service;

import dto.FeedLikeDto;

import java.util.Map;

public interface FeedLikeService {
    public FeedLikeDto checkByIdAndNo(Map map);
    public void checkLike(FeedLikeDto feedLikeDto);
    public void cancelLike(FeedLikeDto feedLikeDto);
}
