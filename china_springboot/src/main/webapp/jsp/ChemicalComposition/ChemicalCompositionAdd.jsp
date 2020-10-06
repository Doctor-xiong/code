<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../../static/css/ChemicalCompositionCSS/layui.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/ChemicalCompositionCSS/button.css" />
    <title>化学组成元素增加</title>
</head>
<body>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-form" lay-filter="freshform">
            <table class="layui-table" lay-filter="test">
                <colgroup> <!-- 用于对表格中的列进行组合，以便于对其进行格式化 -->
                    <col width="150">
                    <col width="200">
                    <col width="200">
                    <%--<col width="200">
                    <col width="200">
                    <col width="200">
                    <col width="150">--%>
                </colgroup>
                <thead><!-- 定义表格的表头 -->
                <tr>
                    <th>胎：常量元素</th>
                    <th><input type="text" class="layui-input" placeholder="测试方法"  name="method"></th>
                    <th><input type="text" class="layui-input" placeholder="测试单位"  name="department"></th>
                </tr>
                <tr>
                    <th style="display: none">序号</th>
                    <th>元素</th>
                    <th>元素含量(%)</th>
                    <th style="text-align: center"><button type="button" class="layui-btn add-btn">添加</button></th>
                </tr>
                </thead>
                <tbody class="addlists">
                <tr>
                    <td><input type="text" name="element" class="layui-input" placeholder="请填写元素"></td>
                    <td><input type="text" name="content" class="layui-input"  placeholder="请填写元素含量"></td>
                    <td style="text-align: center"><button type="button" class="layui-btn layui-btn-danger btn-del" lay-event="del">删除</button></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<br><br>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-form" lay-filter="freshform">
            <table class="layui-table" lay-filter="test">
                <colgroup>
                    <col width="150">
                    <col width="200">
                    <col width="200">
                    <%--<col width="200">
                    <col width="200">
                    <col width="200">
                    <col width="150">--%>
                </colgroup>
                <thead>
                <tr>
                    <th >胎：微量元素</th>
                    <th><input type="text" class="layui-input" placeholder="测试方法"  name="method"></th>
                    <th><input type="text" class="layui-input" placeholder="测试单位"  name="department"></th>
                </tr>
                <tr>
                    <%--<th style="display: none">序号</th>--%>
                    <th>元素</th>
                    <th>元素含量(%)</th>
                    <th style="text-align: center"><button type="button" class="layui-btn add-btntai">添加</button></th>
                </tr>
                </thead>
                <tbody class="addlists2">
                <tr>
                    <td><input type="text" name="element" class="layui-input" placeholder="请填写元素"></td>
                    <td><input type="text" name="content" class="layui-input"  placeholder="请填写元素含量"></td>
                    <td style="text-align: center"><button type="button" class="layui-btn layui-btn-danger btn-del" lay-event="del">删除</button></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<br><br>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-form" lay-filter="freshform">
            <table class="layui-table" lay-filter="test">
                <colgroup>
                    <col width="150">
                    <col width="200">
                    <col width="200">
                    <col width="200">
                    <col width="200">
                    <col width="200">
                    <col width="150">
                </colgroup>
                <thead>
                <tr>
                    <th >釉：常量元素</th>
                    <th><input type="text" class="layui-input" placeholder="测试方法"  name="method"></th>
                    <th><input type="text" class="layui-input" placeholder="测试单位"  name="department"></th>
                </tr>
                <tr>
                    <%--<th style="display: none">序号</th>--%>
                    <th>元素</th>
                    <th>元素含量(%)</th>
                    <th style="text-align: center"><button type="button" class="layui-btn add-btnchang">添加</button></th>
                </tr>
                </thead>
                <tbody class="addlists3">
                <tr>
                    <td><input type="text" name="element" class="layui-input" placeholder="请填写元素"></td>
                    <td><input type="text" name="content" class="layui-input"  placeholder="请填写元素含量"></td>
                    <td style="text-align: center"><button type="button" class="layui-btn layui-btn-danger btn-del" lay-event="del">删除</button></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<br><br>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-form" lay-filter="freshform">
            <table class="layui-table" lay-filter="test">
                <colgroup>
                    <col width="150">
                    <col width="200">
                    <col width="200">
                    <col width="200">
                    <col width="200">
                    <col width="200">
                    <col width="150">
                </colgroup>
                <thead>
                <tr>
                    <th >釉：微量元素</th>
                    <th><input type="text" class="layui-input" placeholder="测试方法"  name="method"></th>
                    <th><input type="text" class="layui-input" placeholder="测试单位"  name="department"></th>
                </tr>
                <tr>
                    <th style="display: none">序号</th>
                    <th>元素</th>
                    <th>元素含量(%)</th>
                    <th style="text-align: center"><button type="button" class="layui-btn add-btnyou">添加</button></th>
                </tr>
                </thead>
                <tbody class="addlists4">
                <tr>
                    <td><input type="text" name="element" class="layui-input" placeholder="请填写元素"></td>
                    <td><input type="text" name="content" class="layui-input"  placeholder="请填写元素含量"></td>
                    <td style="text-align: center"><button type="button" class="layui-btn layui-btn-danger btn-del" lay-event="del">删除</button></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<br><br>
<button class="primary-btn" value="提交" style=margin-left:600px >提&nbsp;&nbsp;&nbsp;交</button>
<script src="../../static/js/ChemicalCompositionJS/layui.all.js"></script>
<script src="../../static/js/ChemicalCompositionJS/jquery.min.js"></script>
<script src="../../static/js/ChemicalCompositionJS/bgfun.js"></script>
</body>
</html>