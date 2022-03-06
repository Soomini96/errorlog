window.onload = function (){
    // 해당 글 불러오기
    const no = document.getElementById("no").value;
    $.ajax({
        url : `/v1/feed/no=${no}`,
        method : 'get'
    }).done(res => {
        // 2. 유저가 해당 글에 '좋아요' 눌렀는 지 파악
        $.ajax({
            url : `/v1/feedLike/id=${res.user_id}/no=${no}`,
            method: 'get'
        }).success(like => {
            const myLike = like;
            const feed_no = res.no;
            const user_id = res.user_id;
            const feed_image = res.imagefile;
            const content = res.content;
            const likes = res.likes;

            if(myLike === ""){
                // 2-1. 사용자가 해당글에 좋아요를 누르지 않은 경우
                $('div.feed-wrap').append(
                    ` <span>이미지${feed_image}</span><br>
                    <span>내용${content}</span><br>
                    <span>by ${user_id}</span><br>
                    <span>♡${likes}개</span>`
                );
            }else{
                // 2-2. 사용자가 해당글에 좋아요를 누른 경우
                $('div.feed-wrap').append(
                ` <span>이미지${feed_image}</span><br>
                    <span>내용${content}</span><br>
                    <span>by ${user_id}</span><br>
                    <span>♥${likes}개</span>`
                );
            }

        })
    });
}