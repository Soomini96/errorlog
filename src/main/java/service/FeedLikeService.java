package service;

import dto.FeedLikeDto;

import java.util.Map;

public interface FeedLikeService {
    public boolean checkByIdAndNo(Map map);
    public boolean checkLike(FeedLikeDto feedLikeDto);
}
