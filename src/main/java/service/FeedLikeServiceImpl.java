package service;

import dao.FeedDao;
import dao.FeedLikeDao;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FeedLikeServiceImpl {
    private FeedLikeDao feedLikeDao;
    public void setFeedLikeDao(FeedLikeDao feedLikeDao) {
        this.feedLikeDao = feedLikeDao;
    }

    public boolean checkByIdAndNo(Map map){
        return feedLikeDao.checkByIdAndNo(map);
    }
}