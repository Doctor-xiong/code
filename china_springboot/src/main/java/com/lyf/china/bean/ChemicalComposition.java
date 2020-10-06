package com.lyf.china.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.lyf.china.dao.ChemicalCompositionRepository;
import com.lyf.china.service.ChemicalCompositionService;
import com.lyf.china.service.impl.ChemicalCompositionServiceImpl;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/*@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder*/
@Document("Chemical_Composition")
public class ChemicalComposition {

	@Field("_id")
	private String Samples_id;
	@Field("Fetus_Constant_Element")
	private HashMap<String, Double> Fetus_Constant_Element;
	@Field("Fetus_Trace_Element")
	private HashMap<String, Double> Fetus_Trace_Element;
	@Field("Glaze_Constant_Element")
	private HashMap<String, Double> Glaze_Constant_Element;
	@Field("Glaze_Trace_Element")
	private HashMap<String, Double> Glaze_Trace_Element;
	@Field("Test_name")
	private ArrayList<String> Method; //测试方法（0-胎常，1-胎微，2釉-常，3釉-微）
    @Field("Test_Unit")
    private ArrayList<String> Unit; // 测试单位（0-胎常，1-胎微，2釉-常，3釉-微）

	// 空构造函数
	public ChemicalComposition() {
	}
	// 全构造函数
	public ChemicalComposition(String samples_id, HashMap<String, Double> fetus_Constant_Element, HashMap<String, Double> fetus_Trace_Element, HashMap<String, Double> glaze_Constant_Element, HashMap<String, Double> glaze_Trace_Element, ArrayList<String> method, ArrayList<String> unit) {
		Samples_id = samples_id;
		Fetus_Constant_Element = fetus_Constant_Element;
		Fetus_Trace_Element = fetus_Trace_Element;
		Glaze_Constant_Element = glaze_Constant_Element;
		Glaze_Trace_Element = glaze_Trace_Element;
		Method = method;
		Unit = unit;
	}

	// Getter And Setter
	public String getSamples_id() {
		return Samples_id;
	}
	public void setSamples_id(String samples_id) {
		Samples_id = samples_id;
	}
	public HashMap<String, Double> getFetus_Constant_Element() {
		return Fetus_Constant_Element;
	}
	public void setFetus_Constant_Element(HashMap<String, Double> fetus_Constant_Element) {
		Fetus_Constant_Element = fetus_Constant_Element;
	}
	public HashMap<String, Double> getFetus_Trace_Element() {
		return Fetus_Trace_Element;
	}
	public void setFetus_Trace_Element(HashMap<String, Double> fetus_Trace_Element) {
		Fetus_Trace_Element = fetus_Trace_Element;
	}
	public HashMap<String, Double> getGlaze_Constant_Element() {
		return Glaze_Constant_Element;
	}
	public void setGlaze_Constant_Element(HashMap<String, Double> glaze_Constant_Element) {
		Glaze_Constant_Element = glaze_Constant_Element;
	}
	public HashMap<String, Double> getGlaze_Trace_Element() {
		return Glaze_Trace_Element;
	}
	public void setGlaze_Trace_Element(HashMap<String, Double> glaze_Trace_Element) {
		Glaze_Trace_Element = glaze_Trace_Element;
	}
	public ArrayList<String> getMethod() {
		return Method;
	}
	public void setMethod(ArrayList<String> method) {
		Method = method;
	}
	public ArrayList<String> getUnit() {
		return Unit;
	}
	public void setUnit(ArrayList<String> unit) {
		Unit = unit;
	}

}
