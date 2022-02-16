package Controller;

import dto.FeedDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.FeedService;

@RestController
public class FeedController {

    @Autowired
    private FeedService feedService;

    @PostMapping("/feed/write")
    public void writeFeed(String user_id,String imagefile,String content){

        FeedDto feedDto = new FeedDto(user_id,imagefile,content);
        feedService.writeFeed(feedDto);
    }
}
