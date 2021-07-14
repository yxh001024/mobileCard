package com.yxh.mobile.service.Impl;

import com.yxh.mobile.dao.cardInfoMapper;
import com.yxh.mobile.entity.cardInfo;
import com.yxh.mobile.entity.cardInfoExample;
import com.yxh.mobile.exception.BusinessException;
import com.yxh.mobile.service.CardService;
import com.yxh.mobile.utils.MD5Utils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("cardService")
public class CardServiceImpl implements CardService {
    @Resource
    private cardInfoMapper cardInfoMapper;

    @Override
    public cardInfo loginCheck(cardInfo cardInfo) {
        cardInfoExample cardInfoExample = new cardInfoExample();
        com.yxh.mobile.entity.cardInfoExample.Criteria criteria = cardInfoExample.createCriteria();
        criteria.andNumberEqualTo(cardInfo.getNumber());
        List<cardInfo> list = cardInfoMapper.selectByExample(cardInfoExample);
        cardInfo card = list.get(0);
        if (list.size() == 1) {
            String md5 = MD5Utils.md5Encrypt(cardInfo.getPassword(), cardInfo.getSalt());
            if (!card.getPassword().equals(md5)) {
                throw new BusinessException("L02", "密码错误");
            }
        } else throw new BusinessException("L01", "用户不存在");
        return card;
    }

    @Override
    public cardInfo createCard(cardInfo cardInfo) {
        
        return null;
    }


}
