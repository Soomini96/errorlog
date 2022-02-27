package dto;

import java.sql.Timestamp;

public class FollowDto {
    private int no;
    private String user_id,follow_id;
    private Timestamp created_at, modified_at;

    public FollowDto(int no,String user_id,String follow_id,Timestamp created_at,Timestamp modified_at){
        this.no = no;
        this.user_id = user_id;
        this.follow_id = follow_id;
        this.created_at = created_at;
        this.modified_at = modified_at;
    }

}
