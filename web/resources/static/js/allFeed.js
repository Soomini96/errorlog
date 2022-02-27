// 팔로우한 사람 목록
let follow = [];
function myfollow(logId){
    $.ajax({
        url : '',
        method : 'get'
    }).done(res => {
        follow = res;
    })
}

window.onload = function (){
    // 팔로우한 사람의 피드만 볼 수 있도록
    const logId = document.getElementById("logId").value;
    myfollow(logId);


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
                        `<tr>
                            <td>${user_id}</td>
                         </tr>`
                    );
                }
            });

        });
    });
}


function agoTime(time){
    return time;
}