package dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@Data
public class FeedDto implements Serializable {
    private int no,likes,bookmark;
    private String user_id,imagefile,content;
    private Timestamp createdAt, modifiedAt;

    public FeedDto(int no, String user_id, String imagefile, String content, int likes, int bookmark, Timestamp createdAt, Timestamp modifiedAt) {
        this.no = no;
        this.user_id = user_id;
        this.imagefile = imagefile;
        this.content = content;
        this.likes = likes;
        this.bookmark = bookmark;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public FeedDto(String user_id, String imagefile, String content) {
        this.user_id = user_id;
        this.imagefile = imagefile;
        this.content = content;
    }
}
