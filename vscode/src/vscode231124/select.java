package vscode231124;

public class select {
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body>
        <select id="id_sel" onchange="f_sel(this)">
            <option value="0">선택</option>
            <option value="heartping">하츄핑</option>
            <option value="happing">해핑</option>
            <option value="shyping">부끄핑</option>
            <option value="nonoping">시러핑</option>
            <option value="lovping">바네핑</option>
            <option value="coolping">덜덜핑</option>
            <option value="sleeping">코자핑</option>
        </select>
    <script>
        function f_sel(p_this){
            //this를 통해 넘어온 매개변수는 요소의 id값으로 접근한 것과
            //동일하게 요소 자체를 나타낸다
    
            // 단일 선택시 .value속성으로 간단히 값을 얻을수 있음
            //!
            //console.log(id_sel.value, p_this.value. p_this.selectedIndex);
            console.log(p_this.options);
            console.log(p_this.options[p_this.selectedIndex].innerHTML);
            console.log(p_this.options[p_this.selectedIndex].innerText);
            console.log(p_this.options[p_this.selectedIndex].outerText);
            console.log(p_this.options[p_this.selectedIndex].text);
            console.log(p_this.options[p_this.selectedIndex].textContent);
            console.log(p_this.options[p_this.selectedIndex].label);
            console.log(p_this.options[p_this.selectedIndex].value);
        }
    </script>    
    </body>
    </html>
}
