
$(function () {
    let form = layui.form
        ,laydate = layui.laydate,
        laypage = layui.laypage,
        layer = layui.layer,
        table = layui.table;
    //常规用法

    let i=1,j=1,k=1;
    $('.add-btn').click(function () {
        i++;
        addstrs1(i);
        form.render();
    });

  
 

    $('body').on("click",".btn-del",function () {
         var pre = $(this);
        layer.confirm('确定要删除么？',{
                btn:['确定','取消']
        },function () {
            $(pre).parent().parent().remove();
            layer.closeAll('dialog');
        })

        //
    });


    function getRandomNum() {
        return parseInt(Math.random()*50);
    }
    function addstrs1(i) {
        let  iNums = getRandomNum();
        let strs1;
             strs1 = '<tr>\n' +
                 '                            <td style="display: none">\n' +
                 '                            <input type="text" name="number1" value="'+i+'">\n' +
                 '                            </td>\n' +
                 '                           <td>\n' +
                 '                                <input type="text" name="element" class="layui-input">\n' +
                 '                            </td>\n' +
                 '                            <td>\n' +
                 '                                <input type="text" name="content" class="layui-input">\n' +
                 '                            </td>\n' +
                 '                            <td style="text-align: center"><button type="button" class="layui-btn layui-btn-danger btn-del">删除</button></td>\n' +
                 '                        </tr>';
        $('.addlists').append(strs1);
        //重新渲染


    }

})

$(function () {
    let form = layui.form
        ,laydate = layui.laydate,
        laypage = layui.laypage,
        layer = layui.layer,
        table = layui.table;
    //常规用法

    let i=1,j=1,k=1;
    $('.add-btntai').click(function () {
        i++;
        addstrs1(i);
        form.render();
    });

  
 

    $('body').on("click",".btn-del",function () {
         var pre = $(this);
        layer.confirm('确定要删除么？',{
                btn:['确定','取消']
        },function () {
            $(pre).parent().parent().remove();
            layer.closeAll('dialog');
        })

        //
    });


    function getRandomNum() {
        return parseInt(Math.random()*50);
    }
    function addstrs1(i) {
        let  iNums = getRandomNum();
        let strs1;
             strs1 = '<tr>\n' +
                 '                            <td style="display: none">\n' +
                 '                            <input type="text" name="number1" value="'+i+'">\n' +
                 '                            </td>\n' +
                 '                           <td>\n' +
                 '                                <input type="text" name="element" class="layui-input">\n' +
                 '                            </td>\n' +
                 '                            <td>\n' +
                 '                                <input type="text" name="content" class="layui-input">\n' +
                 '                            </td>\n' +
                 '                            <td style="text-align: center"><button type="button" class="layui-btn layui-btn-danger btn-del">删除</button></td>\n' +
                 '                        </tr>';
        $('.addlists2').append(strs1);
        //重新渲染


    }

})


$(function () {
    let form = layui.form
        ,laydate = layui.laydate,
        laypage = layui.laypage,
        layer = layui.layer,
        table = layui.table;
    //常规用法

    let i=1,j=1,k=1;
    $('.add-btnchang').click(function () {
        i++;
        addstrs1(i);
        form.render();
    });

  
 

    $('body').on("click",".btn-del",function () {
         var pre = $(this);
        layer.confirm('确定要删除么？',{
                btn:['确定','取消']
        },function () {
            $(pre).parent().parent().remove();
            layer.closeAll('dialog');
        })

        //
    });


    function getRandomNum() {
        return parseInt(Math.random()*50);
    }
    function addstrs1(i) {
        let  iNums = getRandomNum();
        let strs1;
             strs1 = '<tr>\n' +
                 '                            <td style="display: none">\n' +
                 '                            <input type="text" name="number1" value="'+i+'">\n' +
                 '                            </td>\n' +
                 '                           <td>\n' +
                 '                                <input type="text" name="element" class="layui-input">\n' +
                 '                            </td>\n' +
                 '                            <td>\n' +
                 '                                <input type="text" name="content" class="layui-input">\n' +
                 '                            </td>\n' +
                 '                            <td style="text-align: center"><button type="button" class="layui-btn layui-btn-danger btn-del">删除</button></td>\n' +
                 '                        </tr>';
        $('.addlists3').append(strs1);
        //重新渲染


    }

})




$(function () {
    let form = layui.form
        ,laydate = layui.laydate,
        laypage = layui.laypage,
        layer = layui.layer,
        table = layui.table;
    //常规用法

    let i=1,j=1,k=1;
    $('.add-btnyou').click(function () {
        i++;
        addstrs1(i);
        form.render();
    });

  
 

    $('body').on("click",".btn-del",function () {
         var pre = $(this);
        layer.confirm('确定要删除么？',{
                btn:['确定','取消']
        },function () {
            $(pre).parent().parent().remove();
            layer.closeAll('dialog');
        })

        //
    });


    function getRandomNum() {
        return parseInt(Math.random()*50);
    }
    function addstrs1(i) {
        let  iNums = getRandomNum();
        let strs1;
             strs1 = '<tr>\n' +
                 '                            <td style="display: none">\n' +
                 '                            <input type="text" name="number1" value="'+i+'">\n' +
                 '                            </td>\n' +
                 '                           <td>\n' +
                 '                                <input type="text" name="element" class="layui-input">\n' +
                 '                            </td>\n' +
                 '                            <td>\n' +
                 '                                <input type="text" name="content" class="layui-input">\n' +
                 '                            </td>\n' +
                 '                            <td style="text-align: center"><button type="button" class="layui-btn layui-btn-danger btn-del">删除</button></td>\n' +
                 '                        </tr>';
        $('.addlists4').append(strs1);
        //重新渲染


    }

})

