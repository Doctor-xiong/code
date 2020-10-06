package com.lyf.china.bean;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/*@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder*/
@Document("Essential_Information")
public class EssentialInformation {
    @Field("_id")
    private String Sample_id;//样品编号
    @Field("Original_Number")
    private String Original_Number;//原编号
    @Field("Name")
    private String Name;//名称
    @Field("Cultural_Classification")
    private String Cultural_Classification;//文物分类
    @Field("Excavated_Time")
    private Date Excavated_Time;//出土时间
    @Field("Excavated_Area")
    private String Excavated_Area;//出土地点
    @Field("Excavated_Layer")
    private String Excavated_Layer;//出土地层
    @Field("Collection_Location")
    private String Collection_Location;//采集地点
    @Field("Burning_Age")
    private String Burning_Age;//烧造时代
    @Field("Kiln")
    private String Kiln;//窑口
    @Field("Sample_Provider")
    private String Sample_Provider;//样品提供者
    @Field("Storage_Place")
    private String Storage_Place;//存放单位
    @Field("Storage_Location")
    private String Storage_Location;//样品存放位置
    @Field("Photo")
    private String Photo;//图片的地址

    // 含有出土信息的构造函数
    public EssentialInformation(String Sample_id, String Original_Number, String Name, String Cultural_Classification, Date Excavated_Time, String Excavated_Area, String Excavated_Layer, String Burning_Age, String Kiln, String Sample_Provider, String Storage_Place, String Storage_Location, String Photo) {

        this.Sample_id = Sample_id;
        this.Original_Number = Original_Number;
        this.Name = Name;
        this.Cultural_Classification = Cultural_Classification;
        this.Excavated_Time = Excavated_Time;
        this.Excavated_Area = Excavated_Area;
        this.Excavated_Layer = Excavated_Layer;
        this.Burning_Age = Burning_Age;
        this.Kiln = Kiln;
        this.Sample_Provider = Sample_Provider;
        this.Storage_Place = Storage_Place;
        this.Storage_Location = Storage_Location;
        this.Photo = Photo;
    }

    // 空构造函数
    public EssentialInformation() {
    }

    // 含有采集地点的构造函数
    public EssentialInformation(String Sample_id, String Original_Number, String Name, String Cultural_Classification, String Collection_Location, String Burning_Age, String Kiln, String Sample_Provider, String Storage_Place, String Storage_Location, String Photo) {
        this.Sample_id = Sample_id;
        this.Original_Number = Original_Number;
        this.Name = Name;
        this.Cultural_Classification = Cultural_Classification;
        this.Burning_Age = Burning_Age;
        this.Kiln = Kiln;
        this.Sample_Provider = Sample_Provider;
        this.Storage_Place = Storage_Place;
        this.Storage_Location = Storage_Location;
        this.Photo = Photo;
        this.Collection_Location = Collection_Location;
    }

    // 基本信息查询
    public EssentialInformation(String Sample_id, String Original_Number, String Name, String Cultural_Classification, String Burning_Age, String Kiln) {
        this.Sample_id = Sample_id;
        this.Original_Number = Original_Number;
        this.Name = Name;
        this.Cultural_Classification = Cultural_Classification;
        this.Burning_Age = Burning_Age;
        this.Kiln = Kiln;
    }


    public String getSample_id() {
        return Sample_id;
    }
    public void setSample_id(String sample_id) {
        Sample_id = sample_id;
    }
    public String getOriginal_Number() {
        return Original_Number;
    }
    public void setOriginal_Number(String original_Number) {
        Original_Number = original_Number;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCultural_Classification() {
        return Cultural_Classification;
    }
    public void setCultural_Classification(String cultural_Classification) {
        Cultural_Classification = cultural_Classification;
    }
    public Date getExcavated_Time() {
        return Excavated_Time;
    }
    public void setExcavated_Time(Date excavated_Time) {
        Excavated_Time = excavated_Time;
    }
    public String getExcavated_Area() {
        return Excavated_Area;
    }
    public void setExcavated_Area(String excavated_Area) {
        Excavated_Area = excavated_Area;
    }
    public String getExcavated_Layer() {
        return Excavated_Layer;
    }
    public void setExcavated_Layer(String excavated_Layer) {
        Excavated_Layer = excavated_Layer;
    }
    public String getCollection_Location() {
        return Collection_Location;
    }
    public void setCollection_Location(String collection_Location) {
        Collection_Location = collection_Location;
    }
    public String getBurning_Age() {
        return Burning_Age;
    }
    public void setBurning_Age(String burning_Age) {
        Burning_Age = burning_Age;
    }
    public String getKiln() {
        return Kiln;
    }
    public void setKiln(String kiln) {
        Kiln = kiln;
    }
    public String getSample_Provider() {
        return Sample_Provider;
    }
    public void setSample_Provider(String sample_Provider) {
        Sample_Provider = sample_Provider;
    }
    public String getStorage_Place() {
        return Storage_Place;
    }
    public void setStorage_Place(String storage_Place) {
        Storage_Place = storage_Place;
    }
    public String getStorage_Location() {
        return Storage_Location;
    }
    public void setStorage_Location(String storage_Location) {
        Storage_Location = storage_Location;
    }
    public String getPhoto() {
        return Photo;
    }
    public void setPhoto(String photo) {
        Photo = photo;
    }
    @Override
    public String toString() {
        if (Excavated_Area == null || Excavated_Layer == null) {
            return "样品编号：" + Sample_id + "；"
                    + "样品原编号：" + Original_Number + "；"
                    + "名称：" + Name + "；"
                    + "分类：" + Cultural_Classification + "；"
                    + "采集地点：" + Collection_Location + ";"
                    + "烧造时代：" + Burning_Age + "；"
                    + "窑口：" + Kiln + "；"
                    + "样品提供者：" + Sample_Provider + "；"
                    + "存放单位：" + Storage_Place + "；"
                    + "存放位置：" + Storage_Location + "；"
                    + "照片：" + Photo + "；"
                    + "存放位置：" + Collection_Location + "；";
        } else {
            return "样品编号：" + Sample_id + "；"
                    + "样品原编号：" + Original_Number + "；"
                    + "名称：" + Name + "；"
                    + "分类：" + Cultural_Classification + "；"
                    + "出土时间：" + Excavated_Time + "；"
                    + "出土地点：" + Excavated_Area + "；"
                    + "出土地层：" + Excavated_Layer + "；"
                    + "烧造时代：" + Burning_Age + "；"
                    + "窑口：" + Kiln + "；"
                    + "样品提供者：" + Sample_Provider + "；"
                    + "存放单位：" + Storage_Place + "；"
                    + "存放位置：" + Storage_Location + "；"
                    + "照片：" + Photo;
        }
    }

}
