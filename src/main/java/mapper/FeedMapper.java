package mapper;

import dto.FeedDto;

import java.util.List;

public interface FeedMapper {
    int writeFeed(FeedDto feedDto);
    List<FeedDto>allFeed();
    FeedDto selectFeedByNo(int no);
}
