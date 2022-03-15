package service;

import dao.FeedDao;
import dao.FeedLikeDao;
import dto.FeedLikeDto;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FeedLikeServiceImpl implements FeedLikeService{
    private FeedLikeDao feedLikeDao;
    public void setFeedLikeDao(FeedLikeDao feedLikeDao) {
        this.feedLikeDao = feedLikeDao;
    }

    @Override
    public FeedLikeDto checkByIdAndNo(Map map){
        return feedLikeDao.checkByIdAndNo(map);
    }

    @Override
    public void checkLike(FeedLikeDto feedLikeDto){
        feedLikeDao.checkLike(feedLikeDto);
    }

    @Override
    public void cancelLike(FeedLikeDto feedLikeDto) {
        feedLikeDao.cancelLike(feedLikeDto);
    }

}
