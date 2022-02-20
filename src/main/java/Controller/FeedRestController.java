package Controller;

import dto.FeedDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.FeedServiceImpl;

@RestController
public class FeedRestController {

    @Autowired
    private FeedServiceImpl feedService;

    @PostMapping("/v1/feed")
    public int writeFeed(@RequestBody FeedDto feedDto){
       feedService.writeFeed(feedDto);
       return 0;
    }
}
