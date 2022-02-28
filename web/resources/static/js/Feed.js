window.onload = function (){
    // 해당 글 불러오기
    const no = document.getElementById("no").value;
    $.ajax({
        url : `/v1/feed/no=${no}`,
        method : 'get'
    }).done(res => {
        const feed_no = res.no;
        const user_id = res.user_id;
        const feed_image = res.imagefile;
        const content = res.content;
        const likes = res.likes;
        $('div.feed-wrap').append(
        ` <span>이미지${user_image}</span><br>
            <span>내용${content}</span><br>
            <span>by ${user_id}</span><br>
            <span>좋아요${likes}</span>`
        );
    });
}