<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>基本信息增加</title>
    <script>
        function display() {
            document.getElementById('Excavated').style.display='';
            document.getElementById('Collection').style.display='none';
        }

        function nodisplay()
        {
            document.getElementById('Collection').style.display='';
            document.getElementById('Excavated').style.display='none';
        }
    </script>
</head>
<body>
     <form action="addEssentialInformation" method="post" autocomplete="on">
         样品编号: <input type="text" name="Sample_id" placeholder="样品编号"><br>
         样品原编号: <input type="text" name="Original_Number" placeholder="样品原编号"><br>
         文物名称:<input type="text" name="Name" placeholder="文物名称"><br>
         文物分类:<input list="relicstype" name="Cultural_Classification" placeholder="文物分类">
         <datalist id="relicstype">
             <option value="白陶">
             <option value="彩陶">
             <option value="其他">
         </datalist><br>
         烧造时代: <input list="Agetype" name="Burning_Age" placeholder="烧造时代">
         <datalist id="Agetype">
             <option value="元朝">
             <option value="清朝">
             <option value="其他">
         </datalist><br>
         窑口: <input list="kilntype" name="Kiln" placeholder="窑口">
         <datalist id="kilntype">
             <option value="哥窑">
             <option value="定窑">
             <option value="其他">
         </datalist><br>
         样品提供者: <input type="text" name="Sample_Provider" placeholder="样品提供者"><br>
         存放单位: <input type="text" name="Storage_Place" placeholder="存放单位"><br>
         存放位置: <input type="text" name="Storage_Location" placeholder="存放位置"><br>
         照片:<input type="text" name="Photo_Address" placeholder="照片路径"><br>
         <input type="radio" name="select" onclick="display()" value="出土">出土:
         <input type="radio" name="select" onclick="nodisplay()" value="采集">采集:<br>
         <div id="Excavated" style="display:none">
             出土地点:<input type="text" name="Excavated_Area" placeholder="出土地点"><br>
             出土地层:<input type="text" name="Excavated_Layer" placeholder="出土地层"><br>
             出土时间:<input type="text" name="Excavated_Time" placeholder="出土时间"><br>
         </div>
         <div id="Collection" style="display:none">
             采集地点:<input type="text" name="Collection_Location" placeholder="采集地点"><br>
         </div>
         <input type="submit" value="提交">
     </form>
</body>
</html>