package com.lyf.china.dao;


import com.lyf.china.bean.ChemicalComposition;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface ChemicalCompositionRepository extends MongoRepository<ChemicalComposition, String> {
    // MongoRepository<T,TD>接口，其中T为仓库保存的bean类，TD为该bean的唯一标识的类型，一般为ObjectId
//    MongoRepository 方法
//    count（）统计总数
//    count（Example< S > example）条件统计总数
//    delete（T entities）通过对象信息删除某条数据
//    deleteById（ID id）通过id删除某条数据
//    deleteALL（Iterable<? extends T> entities）批量删除某条数据
//    deleteAll（) 清空表中所有的数据
//    existsById（ID id) 判断数据是否存在
//    exists（Example< T > example) 判断某特定数据是否存在
//    findAll（) 获取表中所有的数据   ---> List
//    findAll（Sort sort) 获取表中所有的数据，按照某特定字段排序
//    findAll（Pageable pageAble) 获取表中所有的数据,分页查询
//    findAll（Example< T > example) 条件查询
//    findAll（Iterable ids) 条件查询
//    findAll（Example< T > example,Pageable pageable) 条件分页查询
//    findAll（Example< T > example,Sort sort) 条件查询排序
//    findOneById（ID id) 通过id查询一条数据
//    findOne（Example example) 通过条件查询一条数据
//    insert(S entities) 插入一条数据
//    insert(Iterable< T > entities) 插入多条数据
//    save(S entities) 保存一条数据
//    saveAll(Iterable< T > entities)
//    save(Iterable< T > iterable) 加入多条数据
}
