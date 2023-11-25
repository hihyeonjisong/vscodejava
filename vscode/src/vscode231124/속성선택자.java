package vscode231124;

public class 속성선택자 {
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
    <style>
    img {
        width: 100px;
    }
    [src] { /* 모든 src 대상 */
        border: 2px dotted plum;
    }
    [alt=koala] { /* 일치하는 */
        border-style: inset;
    }
    [src^='/'] { /* ^ :시작하는("/"로 시작하는 src 대상) */
      box-shadow:  5px 2px 2px red;
    }
    [alt$=j] { /* $ :끝나는 */
      border-color: green;
    }
    [title~=ifrm] { /* '*''~=':포함하는( ~= : 온전한(다른문장과분리된...'ifrm'만 해당)) */
      background-color: blue;
    }
    </style>
    </head>
    <body>
        <img src="../images/ala.jpg" alt="koala">
        <img src="/images/bara1.jpg" alt="bara">
        <img src="../images/고윤정.jpg" alt="yj">
    
        <iframe src="../231122/유투브.html" title="iframedia"></iframe>
        <iframe src="../231122/div_span.html" title="ifrm-doc"></iframe>
        <iframe src="../231122/많이쓰는태그.html" title="ifrm"></iframe>
        
    </body>
    </html>
}
