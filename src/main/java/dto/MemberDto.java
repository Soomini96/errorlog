package dto;

import lombok.Getter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
public class MemberDto implements Serializable {

    private final int no;
    private final String id, pw, name, phone, imagefile, email, info;
    private final Timestamp createdAt, modifiedAt;

    public MemberDto(int no, String id, String pw, String name, String phone, String imagefile, String email, String info, Timestamp createdAt, Timestamp modifiedAt) {
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.imagefile = imagefile;
        this.email = email;
        this.info = info;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
