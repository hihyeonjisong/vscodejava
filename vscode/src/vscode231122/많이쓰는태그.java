package vscode231122;

public class 많이쓰는태그 {
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <style>
            img{
                width:100px;
            }
            /* table,tr,td,th{
                border:1px solid
            } */
            #id1 td{
                width:60px;
                height:50px;
                border:1px solid purple;
            }
        </style>
    </head>
    <body>
        <!-- alternative(대안):이미지를 대체하는 항목(웹 접근성 관련 속성) -->
        <img src="./차준환.jpg" width="200px;" alt="차준환사진">
    
        <!-- 절대경로: 웹 페이지나 파일이 갖고 있는 고유경로
            *프로젝트 외부에 존재하는 파일은 보안상 이유로 접근 불가함(=웹에서 로컬로 접근불가)
            그래서 대체텍스트로만 나타남
        -->
        <img src="D:\D_setting\A_TeachingMaterial\05_JQuery\vscode/231122/차준환.jfif" alt="절대경로img">
        
        <!-- 상대경로: 현재 위치를 기준으로 경로 지정 
         /    웹 리소스 시작위치(=최상위 디렉토리)=루트
         ./   현재위치  (차준환도 현재 폴더 안에서 위치해서)
         ../  현재 위치의 상위=부모위치 ( 231122,image들중에 고름)
    
        -->
        <img src="../images/수지.jpg" alt="상대경로suzy">
    
        <img src="/images/수지.jpg" alt="루트기준으로 이미지표현">
        <img src="/231122/차준환.jpg" alt="루트기준으로 이미지표현">
    
        <!-- 다른 서버의 이미지 표현 가능 :주소복사-->
        <img src="https://img2.daumcdn.net/thumb/R658x0.q70/?fname=https://t1.daumcdn.net/news/202301/03/startoday/20230103103009408tnvd.jpg" alt="고윤정이미지 주소복사">
        
        <hr>
    
        <!-- inline-style을 지양해야하지만 border는 예외로 사용(내부스타일 정의가 더 비효율) -->
        <table border="1" width="300px">
            <!--tr: 행/table row -->
            <tr>
                <!--th: table head - bold 및 align-center기능 -->
                <th>1</th>
                <th>2</th>
                <th>3</th>        
            </tr>
            <tr>
                <!--td: 셀 구성 table data -->
                <td>1</td>
                <td>2</td>
                <td>3</td>        
            </tr>
        </table>
    
        <hr>
    
        <!-- 4행 3열 테이블 만들기 -->
        <!-- table>tr*4>td*3> :4행3열테이블 자동생성됌 -->
        <table border="1" width="300px">
            <caption>테이블 이름 지정</caption>
            <tr>
                <th>1행1열</th>
                <th>1행2열</th>
                <th>1행3열</th>        
            </tr>
            <tr>
                <td rowspan="2">2행1열</td><!--3행1열은 지워줘야함-->
                <td>2행2열</td>
                <td>2행3열</td>        
            </tr>
            <tr>
                <!-- <td>3행1열</td> -->
                <td>2</td>
                <td>3</td>        
            </tr>
            <tr>
                <td colspan="3">4행1열</td><!--4행2,3열은 지워줘야함-->
                <!-- <td>4행2열</td>
                <td>4행3열</td>         -->
            </tr>
        </table>
    
        <hr>
    
        <!-- ppt테이블연습하기 -->
        <!-- <table border="1" style ="border: 1px solid red"  width="300px"> -->
        <table border="1" id="id1"">
            <tr>
                <th colspan="2">1-1</th>
                <!-- <th></th> -->
                <th colspan="2">1-3</th>
                <!-- <th></th> -->
                <th>1-5</th>
                <th>1-6</th>
            </tr>
            <tr>
                <td colspan="4">2-1</td>
                <!-- <td></td> -->
                <!-- <td></td> -->
                <!-- <td></td> -->
                <td colspan="2">2-5</td>
                <!-- <td></td> -->
            </tr>
            <tr>
                <td colspan="4">3-1</td>
                <!-- <td></td> -->
                <!-- <td></td> -->
                <!-- <td></td> -->
                <td colspan="2" rowspan="2">3-5</td>
                <!-- <td></td> -->
            </tr>
            <tr>
                <td>4-1</td>
                <td>4-2</td>
                <td>4-3</td>
                <td>4-4</td>
                <!-- <td></td>
                <td></td> -->
            </tr>
        </table>
    
    
    
    
    </body>
    </html>
}
