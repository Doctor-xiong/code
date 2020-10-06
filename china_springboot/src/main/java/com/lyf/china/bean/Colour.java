package com.lyf.china.bean;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Colour")
public class Colour {
	@Field("_id")
	private String Sample_id;//样品编号
	@Field("Whitness")
	private Double Whitness;//白度
	@Field("Chroma")
	private List<Double> Chroma; //色度(0-L,1-a,2-b,3-detailE)
	@Field("Tristimulus_value")
	private List<Double> Tristimulus_Value;//三刺激值（0-x,1-y,2-z）
	@Field("Spectral_Curve")
	private List<String> Spectral_Curve;  //光谱曲线
	@Field("Test_Method")
	private List<String> Test_Method; //测试方法（0-白度，1-色度或者三刺激值，2光谱曲线）
	@Field("Test_Unit")
	private List<String> Test_Unit; //测试单位

	// 无参构造函数
	public Colour() {}
	// 全参构造函数
	public Colour(String sample_id, Double whitness, List<Double> t, List<String> spectral_Curve, List<String> method, List<String> unit, boolean b) {
		Sample_id = sample_id;
		Whitness = whitness;
		if(b) {
			Chroma = t;
		}else {
			Tristimulus_Value = t;
		}
		Spectral_Curve = spectral_Curve;
		Test_Method = method;
		Test_Unit = unit;
	}
	// Getter and Setter
	public String getSample_id() {
		return Sample_id;
	}
	public void setSample_id(String sample_id) {
		Sample_id = sample_id;
	}
	public Double getWhitness() {
		return Whitness;
	}
	public void setWhitness(Double whitness) {
		Whitness = whitness;
	}
	public List<Double> getChroma() {
		return Chroma;
	}
	public void setChroma(List<Double> chroma) {
		Chroma = chroma;
	}
	public List<Double> getTristimulus_Value() {
		return Tristimulus_Value;
	}
	public void setTristimulus_Value(List<Double> tristimulus_Value) {
		Tristimulus_Value = tristimulus_Value;
	}
	public List<String> getSpectral_Curve() {
		return Spectral_Curve;
	}
	public void setSpectral_Curve(List<String> spectral_Curve) {
		Spectral_Curve = spectral_Curve;
	}
	public List<String> getTest_Method() {
		return Test_Method;
	}
	public void setTest_Method(List<String> test_Method) {
		Test_Method = test_Method;
	}
	public List<String> getTest_Unit() {
		return Test_Unit;
	}
	public void setTest_Unit(List<String> test_Unit) {
		Test_Unit = test_Unit;
	}
}
