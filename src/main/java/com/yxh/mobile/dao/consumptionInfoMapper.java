package com.yxh.mobile.dao;

import com.yxh.mobile.entity.consumptionInfo;
import com.yxh.mobile.entity.consumptionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface consumptionInfoMapper {
    long countByExample(consumptionInfoExample example);

    int deleteByExample(consumptionInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(consumptionInfo record);

    int insertSelective(consumptionInfo record);

    List<consumptionInfo> selectByExample(consumptionInfoExample example);

    consumptionInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") consumptionInfo record, @Param("example") consumptionInfoExample example);

    int updateByExample(@Param("record") consumptionInfo record, @Param("example") consumptionInfoExample example);

    int updateByPrimaryKeySelective(consumptionInfo record);

    int updateByPrimaryKey(consumptionInfo record);
}