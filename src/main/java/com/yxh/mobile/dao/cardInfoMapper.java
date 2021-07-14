package com.yxh.mobile.dao;

import com.yxh.mobile.entity.cardInfo;
import com.yxh.mobile.entity.cardInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cardInfoMapper {
    long countByExample(cardInfoExample example);

    int deleteByExample(cardInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(cardInfo record);

    int insertSelective(cardInfo record);

    List<cardInfo> selectByExample(cardInfoExample example);

    cardInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") cardInfo record, @Param("example") cardInfoExample example);

    int updateByExample(@Param("record") cardInfo record, @Param("example") cardInfoExample example);

    int updateByPrimaryKeySelective(cardInfo record);

    int updateByPrimaryKey(cardInfo record);
}