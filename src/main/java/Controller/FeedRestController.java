package Controller;

import dto.FeedDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.FeedServiceImpl;

import java.util.List;

@RestController
public class FeedRestController {

    @Autowired
    private FeedServiceImpl feedService;

    @PostMapping("/v1/feed")
    public int writeFeed(@RequestBody FeedDto feedDto){
       int result = feedService.writeFeed(feedDto);
       return result;
    }

    @GetMapping("/v1/feed")
    public List<FeedDto>allFeed(){
        return feedService.allFeed();
    }

    @GetMapping("/v1/feed/no={no}")
    public FeedDto selectFeedByNo(@PathVariable int no){
        return feedService.selectFeedByNo(no);
    }
}
