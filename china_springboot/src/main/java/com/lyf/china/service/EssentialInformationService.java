package com.lyf.china.service;

import com.lyf.china.bean.EssentialInformation;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface EssentialInformationService{
    // 插入单个
    void oneSave(EssentialInformation essentialInformation);
    // 根据某个确定的值查询
    List<EssentialInformation> query(EssentialInformation essentialInformation);

}