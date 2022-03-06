package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
public class FeedLikeDto {
    private int no;
    private String user_id;
    private int feed_no;
    private Timestamp createdAt;
    private Timestamp modifiedAt;

    public FeedLikeDto(int no, String user_id,int feed_no,Timestamp createdAt, Timestamp modifiedAt){
        this.no = no;
        this.user_id = user_id;
        this.feed_no = feed_no;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public FeedLikeDto(String user_id,int feed_no){
        this.user_id = user_id;
        this.feed_no = feed_no;
    }

}
