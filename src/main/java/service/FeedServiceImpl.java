package service;

import dao.FeedDao;
import dto.FeedDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedServiceImpl implements FeedService{

    private FeedDao feedDao;
    public void setFeedDao(FeedDao feedDao) {
        this.feedDao = feedDao;
    }

    @Override
    public int writeFeed(FeedDto feedDto){
        return feedDao.writeFeed(feedDto);
    }

    @Override
    public List<FeedDto> allFeed() {
        return feedDao.allFeed();
    }
}
