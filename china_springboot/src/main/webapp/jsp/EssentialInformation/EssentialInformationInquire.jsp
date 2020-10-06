<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>基本信息查询</title>

</head>
<body>
<form action="inquireEssentialInformation" method="post">
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
    <input type="submit" value="提交">
</form>
</body>
</html>