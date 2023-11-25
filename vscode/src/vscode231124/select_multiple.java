package vscode231124;

public class select_multiple {
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body> <!-- multiple 확장해서 보여줌,몇개까지 보여줄지 크기 선태가능 -->
        <select id="id_sel" multiple size="7" onchange="f_sel(this)">
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
                var v_opts =p_this.options
                console.log(v_opts)
                var v_arr = [];
    
                for(var i =0; i<v_opts.length ;i++){
                    console.log(v_opts[i].value,"=> ",v_opts[i].selected)
                    if(v_opts[i].selected){
                        //v_arr.push( v_opts[i].innerHTML);
                        v_arr[v_arr.length]= v_opts[i].innerText;
                    }
                }
                console.log("당신의 픽은 "+v_arr+"~~!!")
            }
        </script>
      
    </body>
    </html>
}
