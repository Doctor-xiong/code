package com.lyf.china.service;

import com.lyf.china.bean.ChemicalComposition;
import com.lyf.china.bean.EssentialInformation;

import java.util.ArrayList;
import java.util.Optional;

public interface ChemicalCompositionService {
    void oneSave(ChemicalComposition chemicalComposition);
    ChemicalComposition queryById(String id);
    ArrayList<ChemicalComposition> queryByContent(String classType, String elemType, String element, String condition, String content);
//    void queryByTestUnit(String testUnit);
    ArrayList<ChemicalComposition> queryByEssentialInformation(EssentialInformation essentialInformation);
}
