window.onload = function (){
    $.ajax({
        url : 'v1/feed',
        method : 'get'
    }).done(res =>{
        // 모든 피드 불러오기
        res.forEach(e => {
            // 유저 프로필 사진 불러오기
            $.ajax({
                url : `/v1/member/id=${e.user_id}`,
                method : 'get'
            }).done(res => {

               /* let feed = document.createElement('div');
                feed.className = `${e.no}`;*/

                $('<div></div>').addClass(`feed${e.no}`);
                $('<span></span>').html(res.imagefile).appendTo(`feed${e.no}`);
                $('<span></span>').html(e.user_id).appendTo(`feed${e.no}`);
                $('<span></span>').html(e.imagefile).appendTo(`feed${e.no}`);
                $('<span></span>').html(e.content).appendTo(`feed${e.no}`);
                $('<span></span>').html(e.likes).appendTo(`feed${e.no}`);

                // ..시간 전
                const time = ago(e.createdAt);
                $('<span></span>').html(time+'시간 전').appendTo(`feed${e.no}`);

                $('main').appendTo(`feed${e.no}`);
            })

        })
    })
}


function ago(time){
    return 5;
}