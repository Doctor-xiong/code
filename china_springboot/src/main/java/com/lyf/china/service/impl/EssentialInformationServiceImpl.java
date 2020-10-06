package com.lyf.china.service.impl;

import com.lyf.china.bean.EssentialInformation;
import com.lyf.china.dao.EssentialInformationRepository;
import com.lyf.china.service.EssentialInformationService;

import org.springframework.data.domain.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EssentialInformationServiceImpl implements EssentialInformationService {

    @Autowired
    private EssentialInformationRepository essentialInformationRepository;

    // 插入单个
    public void oneSave(EssentialInformation essentialInformation){
        //essentialInformationRepository.save(essentialInformation);
        essentialInformationRepository.insert(essentialInformation);
    }
    // 根据某几个确定的值查询
    public List<EssentialInformation> query(EssentialInformation essentialInformation){
        // 如果什么都不输入则显示全部数据
        String sampleId = essentialInformation.getSample_id();
        String originalNumber = essentialInformation.getOriginal_Number();
        String name = essentialInformation.getName();
        String culturalClassification = essentialInformation.getCultural_Classification();
        String burningAge = essentialInformation.getBurning_Age();
        String kiln = essentialInformation.getKiln();
        if("".equals(sampleId) && "".equals(originalNumber) && "".equals(name) && "".equals(culturalClassification) && "".equals(burningAge) && "".equals(kiln))
            return essentialInformationRepository.findAll();
        else{
            EssentialInformation es = new EssentialInformation();

            if(!"".equals(sampleId))
                es.setSample_id(sampleId);
            if(!"".equals(originalNumber))
                es.setOriginal_Number(originalNumber);
            if(!"".equals(name))
                es.setName(name);
            if(!"".equals(culturalClassification))
                es.setCultural_Classification(culturalClassification);
            if(!"".equals(burningAge))
                es.setBurning_Age(burningAge);
            if(!"".equals(kiln))
                es.setKiln(kiln);
            Example<EssentialInformation> example = Example.of(es);
            return essentialInformationRepository.findAll(example);
        }
    }


}