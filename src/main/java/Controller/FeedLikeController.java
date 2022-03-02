package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.FeedLikeServiceImpl;
import service.FeedServiceImpl;

import java.util.HashMap;

@RestController
public class FeedLikeController {

    @Autowired
    private FeedLikeServiceImpl feedLikeService;

    @GetMapping("/v1/feedLike/id={id}/no=(no}")
    public boolean checkByIdAndNo(@PathVariable String id, @PathVariable int no){
        HashMap<String,Object>map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("no",no);
        return feedLikeService.checkByIdAndNo(map);
    }
}
