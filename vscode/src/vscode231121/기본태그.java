package vscode231121;

public class 기본태그 {
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
    </head>
    <body>
        <!-- heading -->
        <h1>개발자가 알아야할 기본태그</h1>
    
        <!-- horizontal -->
        <hr>
        horizontal
    
        <!-- line break -->
         ㅋㅋ
        <!-- 특수문자 표현: 꺽쇠는 태그로 인식하므로 문자처리르 위해 사용 -->
        &lt;br&gt;태그를 사용해서 <br
        
        
        
        
        
        
        
        > 줄 넘김 처리를 합시다
    
        <!-- 지정된 서식대로 보여짐/block 레벨 요소 -->
        <pre>
            pre에선 작성한           그대로 
                   보여짐
        </pre>
    
        <code>code태그는 사용중지상태</code>
    
        <p>
            p태그이것은 문단 <br>
            위아래로                                  라인이생김<br>
            위아래로&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;라인이생김
        </p>
    
        <!-- unordered list -->
        <ul type="square"><!--default: disk,square,circle-->
            <li>순서없는 리스트1</li>
            <li>순서없는 리스트2</li>
            <li>순서없는 리스트3</li>
            <li>순서없는 리스트4</li>
        </ul>
    
        <!-- ordered list -->
        <ol style="list-style: lower-alpha;"><!--css 검색해보기 종류많음-->
            <li>순서있는 리스트1</li>
            <li>순서있는 리스트2</li>
            <li>순서있는 리스트3</li>
            <li>순서있는 리스트4</li>
        </ol>
        <!-- definition list -->
        <dl>
            <dt>정의리스트 제목1</dt>
            <dd>정의리스트 내용1</dd>
            <dt>정의리스트 제목2</dt>
            <dd>정의리스트 내용2</dd>
        </dl>
    
    </body>
    </html>
}
