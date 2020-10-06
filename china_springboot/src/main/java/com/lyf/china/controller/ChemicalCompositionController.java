package com.lyf.china.controller;

import com.lyf.china.bean.ChemicalComposition;
import com.lyf.china.service.ChemicalCompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


@Controller
public class ChemicalCompositionController {

    @Autowired
    private ChemicalCompositionService chemicalCompositionService;

    // 跳转到化学组成添加页面
    @RequestMapping("/ChemicalComposition/ChemicalCompositionAdd")
    public String ChemicalCompositionAdd(){
        return "/jsp/ChemicalComposition/ChemicalCompositionAdd.jsp";
    }
    // 跳转到化学元素查询页面
    @RequestMapping("/ChemicalComposition/inquireById")
    public String ChemicalCompositionInquire(){
        return "/jsp/ChemicalComposition/inquireById.jsp";
    }
    // 跳转到化学组成全部显示页面
    @RequestMapping("/ChemicalComposition/ChemicalCompositionDisplay")
    public String ChemicalCompositionDisplay(){
        return "/jsp/ChemicalComposition/ChemicalCompositionDisplay.jsp";
    }

    // 单个文物化学元素录入
    @RequestMapping("/ChemicalComposition/addChemicalComposition")
    public void ChemicalCompositionAddOption(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String Id = request.getParameter("Id");
        String id = "0101000005";
        HashMap<String, Double> Fetus_Constant_Element = new HashMap<>();
        HashMap<String, Double> Fetus_Trace_Element = new HashMap<>();
        HashMap<String, Double> Glaze_Constant_Element = new HashMap<>();
        HashMap<String, Double> Glaze_Trace_Element = new HashMap<>();
        Fetus_Constant_Element.put("Na",80.25);
        Fetus_Constant_Element.put("Cu",80.25);
        Fetus_Constant_Element.put("MnO",80.25);
        Fetus_Constant_Element.put("SiO2",80.25);

        Fetus_Trace_Element.put("Na",80.25);
        Fetus_Trace_Element.put("Cu",80.25);
        Fetus_Trace_Element.put("MnO",80.25);
        Fetus_Trace_Element.put("SiO2",80.25);

        Glaze_Constant_Element.put("Na",80.25);
        Glaze_Constant_Element.put("Cu",80.25);
        Glaze_Constant_Element.put("MnO",80.25);
        Glaze_Constant_Element.put("SiO2",80.25);

        Glaze_Trace_Element.put("Na",80.25);
        Glaze_Trace_Element.put("Cu",80.25);
        Glaze_Trace_Element.put("MnO",80.25);
        Glaze_Trace_Element.put("SiO2",80.25);

        ArrayList<String> methodList= new ArrayList<>();
        methodList.add(request.getParameter("Fetus_Constant_method"));
        methodList.add(request.getParameter("Fetus_Trace_method"));
        methodList.add(request.getParameter("Glaze_Constant_method"));
        methodList.add(request.getParameter("Glaze_Trace_method"));
        ArrayList<String> unitList = new ArrayList<>();
        unitList.add(request.getParameter("Fetus_Constant_method"));
        unitList.add(request.getParameter("Fetus_Trace_method"));
        unitList.add(request.getParameter("Glaze_Constant_method"));
        unitList.add(request.getParameter("Glaze_Trace_method"));
        ChemicalComposition chemicalComposition = new ChemicalComposition(id, Fetus_Constant_Element, Fetus_Trace_Element, Glaze_Constant_Element, Glaze_Trace_Element, methodList, unitList);
        chemicalCompositionService.oneSave(chemicalComposition);
    }
   // 根据文物id查询文物信息
    @RequestMapping("/ChemicalComposition/inquireByIdChemicalComposition")
     public void ChemicalCompositionInquireById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String id = request.getParameter("ID");
        //String id = "0101000002";
        System.out.println(id);
        ChemicalComposition result =  chemicalCompositionService.queryById(id);
        if (!(result == null))
            System.out.println(result); // 查询成功打印查询结果
        else
            response.sendRedirect("/jsp/sign_in/error.html"); // 查询结果为空，查询失败，跳转到error页面
    }
    // 根据文物化学元素含量查询
    @RequestMapping("/ChemicalComposition/inquireByContentChemicalComposition")
    public ArrayList<ChemicalComposition> /*void*/ ChemicalCompositionInquireByContent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       String classType = request.getParameter("classType");
       String elemType = request.getParameter("elemType");
       String element = request.getParameter("element");
       String condition = request.getParameter("condition");
       String content = request.getParameter("content");
       /*String classType = "Fetus";
       String elemType = "Constant";
       String element = "Na";
       String condition = ">=";
       String content = "50";
       ArrayList<ChemicalComposition> a = chemicalCompositionService.queryByContent(classType, elemType, element, condition, content);
       System.out.println(a.size());*/
       return chemicalCompositionService.queryByContent(classType, elemType, element, condition, content);
    }

}
