package com.lyf.china.controller;

import com.lyf.china.bean.EssentialInformation;
import com.lyf.china.service.EssentialInformationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
public class EssentialInformationController {

    @Autowired
    private EssentialInformationService essentialInformationService;

    // 跳转文物基本信息增加页面
    @RequestMapping("/EssentialInformation/EssentialInformationAdd")
    public String EssentialInformationAdd(){
        return "/jsp/EssentialInformation/EssentialInformationAdd.jsp";
    }
    // 跳转文物基本信息查询页面
    @RequestMapping("/EssentialInformation/EssentialInformationInquire")
    public String EssentialInformationInquire() {
        return "/jsp/EssentialInformation/EssentialInformationInquire.jsp";
    }
    // 跳转文物基本信息显示页面
    @RequestMapping("/EssentialInformation/EssentialInformationDisplay")
    public String EssentialInformationDisplay(){
        return "/jsp/EssentialInformation/EssentialInformationDisplay.jsp";
    }
    // 跳转单个文物基本信息详细显示页面
    @RequestMapping("/EssentialInformation/EssentialInformationDetailedDisplay")
    public String EssentialInformationDetailedDisplay(){
        return "/jsp/EssentialInformation/EssentialInformationDetailedDisplay.jsp";
    }

    // 单个文物基本信息保存
    @RequestMapping("/EssentialInformation/addEssentialInformation")
    public void EssentialInformationAddOption(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Sample_id = request.getParameter("Sample_id");
        String Original_Number = request.getParameter("Original_Number");
        String Name = request.getParameter("Name");
        String Cultural_Classification = request.getParameter("Cultural_Classification");
        String Burning_Age = request.getParameter("Burning_Age");
        String Kiln = request.getParameter("Kiln");
        String Sample_Provider = request.getParameter("Sample_Provider");
        String Storage_Place = request.getParameter("Storage_Place");
        String Storage_Location = request.getParameter("Storage_Location");
        String Photo = request.getParameter("Photo_Address");
        EssentialInformation essentialInformation;
        if ("出土".equals(request.getParameter("select") )){
            String date = request.getParameter("Time");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date Excavated_Time = null;
            /*try {
                Excavated_Time = sdf.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }*/
            String Excavated_Area = request.getParameter("Excavated_Area");
            String Excavated_Layer = request.getParameter("Excavated_Layer");
            essentialInformation = new EssentialInformation(Sample_id, Original_Number, Name, Cultural_Classification, Excavated_Time, Excavated_Area, Excavated_Layer, Burning_Age, Kiln, Sample_Provider, Storage_Place, Storage_Location, Photo);
        }else{
            String Collection_Location = request.getParameter("Collection_Location");//采集地点
            essentialInformation = new EssentialInformation(Sample_id, Original_Number, Name, Cultural_Classification, Collection_Location, Burning_Age, Kiln, Sample_Provider, Storage_Place, Storage_Location, Photo);
        }
        essentialInformationService.oneSave(essentialInformation);
//        response.sendRedirect("/jsp/sign_in/success.html");
    }
    // 文物基本信息条件查询
    @RequestMapping("/EssentialInformation/inquireEssentialInformation")
    public void EssentialInformationInquireOption(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Sample_id = request.getParameter("Sample_id");
        String Original_Number = request.getParameter("Original_Number");
        String Name = request.getParameter("Name");
        String Cultural_Classification = request.getParameter("Cultural_Classification");
        String Burning_Age = request.getParameter("Burning_Age");
        String Kiln = request.getParameter("Kiln");
        EssentialInformation essentialInformation = new EssentialInformation(Sample_id, Original_Number, Name, Cultural_Classification, Burning_Age, Kiln);
        List<EssentialInformation> essentialInformations = essentialInformationService.query(essentialInformation);
        System.out.println(essentialInformations);
    }

}
