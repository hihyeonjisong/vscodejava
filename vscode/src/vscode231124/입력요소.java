package vscode231124;

public class 입력요소 {
    <!DOCTYPE html>
    <html lang="en">
    
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <style>
            div {
                border: 3px solid olive;
                padding: 10px;
                margin: 10px;
            }
        </style>
    </head>
    
    <body>
        <div>
            <!-- name으로 그루핑 하여 항목중 하나의 값만 체크할때 -->
            남<input type="radio" name="gender" value="male">
            여<input type="radio" name="gender" value="female" checked><!-- checked:기본적으로 체크됌 -->
            <input type="button" value="선택" onclick="f_chk()">
    
        </div>
    
        <div>
            당신의 취미는 <!-- ctrl shift alt : 전체수정 -->
            <input type="button" value="선택" onclick="f_chk2()"> <br>
            <input type="checkbox" name="hobby" value="java">자바
            <input type="checkbox" name="hobby" value="js">자바스크립트
            <input type="checkbox" name="hobby" value="html">HTML
            <input type="checkbox" name="hobby" value="css">CSS
            <input type="checkbox" name="hobby" value="server">서버
        </div>
    
        <script>
            function f_chk2() {
                var v_chks = document.getElementsByName('hobby');
                console.log(v_chks);
    
                var v_arr = [];//체크된값을 담을 배열공간
    
                for (var i = 0; i < v_chks.length; i++) {
                    console.log(v_chks[i].checked);
                    if (v_chks[i].checked) {
                        //v_arr.push(v_chks[i].value);
                        v_arr.push(v_chks[i].nextSibling.textContent.trim());
    
                    }
                }
                alert("당신의 취미는" + v_arr + "입니다")
            }
        </script>
        <script>
            function f_chk() {
                /* name에서 가져올거라서 */
                //console.log(document.getElementsByName('gender') ) ;
                var v_rdos = document.getElementsByName('gender');
                for (var i = 0; i < v_rdos.length; i++) {
                    console.log(v_rdos[i].checked);//항목별 체크상태 확인
                    if (v_rdos[i].checked) {//true만 인식
                        alert("당신은" + v_rdos[i].value + "이군요!")
                        alert("당신은" + v_rdos[i].previousSibling.textContent.trim()
                     /* 맞닿아있는형제= 맨앞에 남/여 라고 쓴부분 */ /* trim:공백제거 */ + "이군요!!")
                    }
                }
            }
        </script>
    
    </body>
    
    </html>
}
