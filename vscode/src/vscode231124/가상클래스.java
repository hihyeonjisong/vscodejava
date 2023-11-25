package vscode231124;

public class 가상클래스 {
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    <style> /* 상태에 의한 선택 */
    a:link { /* 방문전 */
      color : lightblue
    }
    a:link { /* 방문후 */
      color : white;
    }
    a:hover {
      color: gold;
    }
    a:active {
        color: plum;
    }
    /* 구조에 의한 선택 */
    tr:first-child {
        background-color: bisque;
    }
    tr:last-child {
        background-color: aquamarine;
    }
    /* tr:nth-child(index) { */ /* index는 1부터 */ 
        /* :nth-child(2n) 2의배수 */ /* :nth-child(n+5) 5와 이후의 모든 영역 */
        /* :nth-child(2n+5) 2의배수+3 영역 */
    tr:nth-child(2n+5) {
        background-color: brown;   
    }
    </style>
    </head>
    <body>
        <!-- 상태 또는 구조에 의한 선택방법을 제공하는 클래스 -->
        <table border="1">
            <tr>
                <td><a href="https://www.w3schools.com/css/default.asp#gsc.tab=0">w3schools</a>
    
                </td>
            </tr>
            <tr>
                <td>2</td>
            </tr>
            <tr>
                <td>3</td>
            </tr>
            <tr>
                <td>4</td>
            </tr>
            <tr>
                <td>5</td>
            </tr>
            <tr>
                <td>6</td>
            </tr>
            <tr>
                <td>7</td>
            </tr>
            <tr>
                <td>8</td>
            </tr>
            <tr>
                <td>9</td>
            </tr>
            <tr>
                <td>10</td>
            </tr>
        </table>
    
        
    </body>
    </html>
}
