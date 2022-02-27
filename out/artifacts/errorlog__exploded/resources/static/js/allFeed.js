window.onload = function (){
    $.ajax({
        url : 'v1/feed',
        method : 'get'
    }).done(res => {
        // 모든 피드 불러오기
        res.forEach(e => {
            // 유저 프로필 사진 불러오기
            $.ajax({
                url: `/v1/member/id=${e.user_id}`,
                method: 'get',
                success: function (user) {
                    const feed_no = e.no;
                    const user_id = e.user_id;
                    const user_image = user.imagefile;
                    const feed_image = e.imagefile;
                    const content = e.content;
                    const likes = e.likes;
                    const ago = agoTime(e.createdAt);
                    $("table.feed-wrap").append(
                        `<div class="feed" id="${feed_no}">
                            <span>이미지${user_image}</span><br>
                            <span>내용${content}</span><br>
                            <span>by ${user_id}</span><br>
                            <span>♥ ${likes}</span><br>
                         </div>`
                    );
                }
            });

        });
    });
}


function agoTime(time){
    return time;
}