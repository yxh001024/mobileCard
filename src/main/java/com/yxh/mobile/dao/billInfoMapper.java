package com.yxh.mobile.dao;

import com.yxh.mobile.entity.billInfo;
import com.yxh.mobile.entity.billInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface billInfoMapper {
    long countByExample(billInfoExample example);

    int deleteByExample(billInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(billInfo record);

    int insertSelective(billInfo record);

    List<billInfo> selectByExample(billInfoExample example);

    billInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") billInfo record, @Param("example") billInfoExample example);

    int updateByExample(@Param("record") billInfo record, @Param("example") billInfoExample example);

    int updateByPrimaryKeySelective(billInfo record);

    int updateByPrimaryKey(billInfo record);
}