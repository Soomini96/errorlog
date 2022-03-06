window.onload = function (){
    // 해당 글 불러오기
    const no = document.getElementById("no").value;
    $.ajax({
        url : `/v1/feed/no=${no}`,
        method : 'get'
    }).done(res => {
        // 유저가 해당 글에 '좋아요' 눌렀는 지 파악
        $.ajax({

        }).success(res => {

        })
        const feed_no = res.no;
        const user_id = res.user_id;
        const feed_image = res.imagefile;
        const content = res.content;
        const likes = res.likes;
        $('div.feed-wrap').append(
        ` <span>이미지${feed_image}</span><br>
            <span>내용${content}</span><br>
            <span>by ${user_id}</span><br>
            <span>좋아요${likes}</span>`
        );
    });
}