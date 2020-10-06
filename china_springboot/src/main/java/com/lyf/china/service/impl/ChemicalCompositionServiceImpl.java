package com.lyf.china.service.impl;

import com.lyf.china.bean.ChemicalComposition;
import com.lyf.china.bean.EssentialInformation;
import com.lyf.china.dao.ChemicalCompositionRepository;
import com.lyf.china.service.ChemicalCompositionService;
import com.lyf.china.service.EssentialInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Function;

@Service
public class ChemicalCompositionServiceImpl implements ChemicalCompositionService {

    @Autowired
    private ChemicalCompositionRepository chemicalCompositionRepository;
    @Autowired
    private EssentialInformationService essentialInformationService;

    private static Map<String, Function<ChemicalComposition, HashMap<String, Double>>> getMethodMap = new HashMap<>();
    static{
        getMethodMap.put("getFetus_Constant_Element", ChemicalComposition::getFetus_Constant_Element);
        getMethodMap.put("getFetus_Trace_Element", ChemicalComposition::getFetus_Trace_Element);
        getMethodMap.put("getGlaze_Constant_Element", ChemicalComposition::getGlaze_Constant_Element);
        getMethodMap.put("getGlaze_Trace_Element", ChemicalComposition::getGlaze_Trace_Element);
    }

    // 单个文物信息录入
    public void oneSave(ChemicalComposition chemicalComposition){
        chemicalCompositionRepository.save(chemicalComposition);
    }
    // 全部文物信息查询
    public ArrayList<ChemicalComposition> findAllInformation(){
        return (ArrayList<ChemicalComposition>) chemicalCompositionRepository.findAll();
    }
    // 按照文物编号查询
    public ChemicalComposition queryById(String id){
        Optional<ChemicalComposition> tmp = chemicalCompositionRepository.findById(id);
        if(!tmp.isEmpty())
            return tmp.get();
        return null;
    }
    // 根据元素含量查询
    public ArrayList<ChemicalComposition> queryByContent(String classType, String elemType, String element, String condition, String content){
        //String name = "get" + classType + "_" + elemType + "_Element";
        String name = "getFetus_Constant_Element";
        Function<ChemicalComposition, HashMap<String, Double>> getMethod = getMethodMap.get(name);
        Double d = Double.parseDouble(content);
        // 查找到所有的文物化学元素组成信息
        List<ChemicalComposition> list = chemicalCompositionRepository.findAll();
        // result存储含有element的文物信息
        ArrayList<ChemicalComposition> result = new ArrayList<>();
        int i;
        if(">=".equals(condition))
            for(i = 0; i < list.size(); i++) {
                // HashMap<String, Double> hp = getMethod.apply(list.get(i));
                if (getMethod.apply(list.get(i)).containsKey(element)
                        && getMethod.apply(list.get(i)).get(element) >= Double.parseDouble(content))
                    result.add(list.get(i));
            }
        else if("<=".equals(condition))
            for(i = 0; i < list.size(); i++) {
                if (getMethod.apply(list.get(i)).containsKey(element)
                        && getMethod.apply(list.get(i)).get(element) <= Double.parseDouble(content))
                    result.add(list.get(i));
            }
        else
            for(i = 0; i < list.size(); i++) {
                if (getMethod.apply(list.get(i)).containsKey(element)
                        && getMethod.apply(list.get(i)).get(element) == Double.parseDouble(content))
                    result.add(list.get(i));
            }
        return result;
    }
    // 根据基本信息查找
    public ArrayList<ChemicalComposition> queryByEssentialInformation(EssentialInformation essentialInformation){
        // 判断查询条件
        String culturalClassification = essentialInformation.getCultural_Classification();
        String kiln = essentialInformation.getKiln();
        EssentialInformation es = new EssentialInformation();
        if(!"".equals(culturalClassification))
            es.setCultural_Classification(culturalClassification);
        if(!"".equals(kiln))
            es.setKiln(kiln);
        // 查询满足条件的所有文物的基本信息，从中提取出id进行化学元素查询
        List<EssentialInformation> list = essentialInformationService.query(es);
        ArrayList<ChemicalComposition> llst = new ArrayList<>();
        Optional<ChemicalComposition> tmp ;
        for(int i = 0; i < list.size(); i++) {
            tmp = chemicalCompositionRepository.findById(list.get(i).getSample_id());
            if(!tmp.isEmpty())
                llst.add(tmp.get());
        }
        return llst;
    }
    /* // 根据测试单位查找
    public void queryByTestUnit(String testUnit){
    }*/
}
