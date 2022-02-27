package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.FollowService;

import java.util.List;

@RestController
public class FollowRestController {

    @Autowired
    private FollowService followService;

    @GetMapping("/v1/follow/id={id}")
    public List<String> selectFollowIdByUserId(@PathVariable String id){
        return followService.selectFollowIdByUserId(id);
    }
}
