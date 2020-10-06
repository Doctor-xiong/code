package com.lyf.china;

import com.lyf.china.bean.ChemicalComposition;
import com.lyf.china.dao.ChemicalCompositionRepository;
import com.lyf.china.service.ChemicalCompositionService;
import com.lyf.china.service.impl.ChemicalCompositionServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class TestChemicalComposition {

    @Test
    public void Test(){
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Na",80.25);
        hashMap.put("Cu",80.25);
        hashMap.put("MnO",80.25);
        hashMap.put("SiO2",80.25);
        ChemicalComposition chemicalComposition = new ChemicalComposition();
        chemicalComposition.setSamples_id("0101000002");
        chemicalComposition.setFetus_Constant_Element(hashMap);
        chemicalComposition.setFetus_Trace_Element(hashMap);
        chemicalComposition.setGlaze_Constant_Element(hashMap);
        chemicalComposition.setGlaze_Trace_Element(hashMap);
        ChemicalCompositionService chemicalCompositionService = new ChemicalCompositionServiceImpl();
        chemicalCompositionService.oneSave(chemicalComposition);
    }
}
