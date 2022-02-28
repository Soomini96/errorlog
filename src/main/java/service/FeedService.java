package service;

import dto.FeedDto;

import java.util.List;

public interface FeedService {
    public int writeFeed(FeedDto feedDto);
    public List<FeedDto> allFeed();
    public FeedDto selectFeedByNo(int no);
}
