package com.yxh.mobile.dao;

import com.yxh.mobile.entity.packageInfo;
import com.yxh.mobile.entity.packageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface packageInfoMapper {
    long countByExample(packageInfoExample example);

    int deleteByExample(packageInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(packageInfo record);

    int insertSelective(packageInfo record);

    List<packageInfo> selectByExample(packageInfoExample example);

    packageInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") packageInfo record, @Param("example") packageInfoExample example);

    int updateByExample(@Param("record") packageInfo record, @Param("example") packageInfoExample example);

    int updateByPrimaryKeySelective(packageInfo record);

    int updateByPrimaryKey(packageInfo record);
}