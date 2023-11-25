package vscode231121;

public class 기본구성 {

<!-- DOC타입 : html태그 정의 전 가장 먼저 선언해야 하는 html버전을 브라우저에 알리는역할-->
<!DOCTYPE html>
<!-- 문서 시작태그/웹 접근성과 관련된 속성으로 스크린리더기를 통해 번역될 언어 설정 -->
<html lang="ko">
<head>
    <!--meat : 브라우저와 검색엔진 로봇에게 메타정보를 제공ㅇ하는 태그-->
    <!--charset : 문서의 언어 인코딩 지정. 이부분 없으면 한글 깨짐-->
    <meta charset="UTF-8">
    <!--접근 기기별 화면 배유를 100%로 맞춰 보여준느 반응형 속성지정-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    제목<title>문서의 제목!</title>
    <!-- internal style sheet: 내부스타일 정의, head영역에만 작성해야함 -->
    <style>
    h2{ 
      color: lightblue;
      background-color: navy;
    }
    </style> 
    <script>
        alert("경고창!3")
    </script>
</head>
<body>
    <script>
        alert("경고창!1")
    </script>
    <!-- inline-style sheet형식: 요소(tag)내부에 스타일 작성/권장X -->
    <h1 style = "color :gold;">h1</h1>
    <h2>h2</h2>
    <h3>h3</h3>
    <h4>h4</h4>
    <h5>h5</h5>
    <h6>h6</h6>
    <!--h7태그는 정의되지않음, default값으로 나옴,오류발생원인도 제공 않음-->
    <h7>h7는 정의되지 않는 태그</h7>
    <!-- script태그는 문서 안에 몇번이든 정의가능/보통 body종료태그 위에 사용됨 -->
    <script>
        alert("경고창!2")
    </script>
</body>
    <script>alert("경고창!2->보통 많이 사용되는 위치")</script>

</html>

}