package vscode231124;

public class 선택자 {
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <style>
        /* 요소(태그)선택자 */
        div {
          color: silver;
          background-color: darkolivegreen;
        }
        p {
          color: lightskyblue; /* fontColor */
          border-style: dotted;/* 미지정시 color값과 동일하게 적용됨 */
          border-width: 5px;
        }
        /* id 선택자 */ /* 후순위로 적용된 style이 적용됨 */
        #elsa {
          color: springgreen;
        }
        /* class 스타일 지정 */ /* 선택자 우선순위에 따른 색 적용(id->class) */
        .dsn {
          color: hotpink;
          background-color: burlywood;
        }
        /* 전체 선택자 */
        * {
            /* 축약순서는 자유이지만 width style color순서 권장 */
          border : 1px dashed brown;
          margin: 10px;
        }
        /* 그룹(다중)선택 */ /* p와 id가 px인 요소 */
        p, #px {
          font-style: italic;
          direction: rtl; /* 우->좌 */
        }
        </style>
    </head>
    <body>
        <!-- id는 페이지 내 유일 값으로, class는 중복 적용가능 -->
        <div class="dsn">알라딘</div>
        <div class="dsn">뮬란</div>
        <div id="elsa" class="dsn">겨울왕국</div>
        <div id="px" >엘리멘탈</div>
        <p class="dsn">라이언킹</p>
        
    </body>
    </html>
}
public class 선택자2{
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
<style>
body * { /* 자식의 모든것들 대상 */
 border: 1px solid lightgreen;
 margin: 10px;
}
/* 자식중에서 */
#parent > div {
  border-color: navy;
}
/* 자식을 포함한 후손들중에서 */
#parent div {
  color: rosybrown;
}
/* 선택자 이후의 모든 형제 */
#second~* { /* 두번째 자식 이후로~ 블러처리하기 */
  text-shadow: 4px 4px 3px purple;
}
/* 선택자의 바로 다음 형제만 */
#second+div { 
    border-style: dashed;

}

</style>
</head>
<body>
    <!-- 단축 : div#parent>div*5 -->
    <!-- 들여쓰기를 통해 상하 계층 구조(부모자식관계)를 한눈에 파악함 -->
    <div id="parent">
        <div>자식1</div>
        <div id="second">자식2
            <div>후손1</div>
            <div>후손2</div>
            <div>후손3</div>
        </div>
        <div>자식3</div>
        <div>자식(p)4</div>
        <div>자식5</div>
    </div>
</body>
</html>
}
