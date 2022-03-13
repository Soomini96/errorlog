package Controller;

import dto.FeedDto;
import dto.FeedLikeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.FeedLikeServiceImpl;
import service.FeedServiceImpl;

import java.util.HashMap;

@RestController
public class FeedLikeController {

    @Autowired
    private FeedLikeServiceImpl feedLikeService;

    @GetMapping("/v1/feedLike/id={id}/no={no}")
    public FeedLikeDto checkByIdAndNo(@PathVariable String id, @PathVariable int no){
        HashMap<String,Object>map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("no",no);
        return feedLikeService.checkByIdAndNo(map);
    }

    @PostMapping("/v1/feedLike")
    public void checkLike(@RequestBody FeedLikeDto feedLikeDto){
        feedLikeService.checkLike(feedLikeDto);
    }
}
