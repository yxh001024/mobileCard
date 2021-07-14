package com.yxh.mobile.service.Impl;

import com.yxh.mobile.dao.cardInfoMapper;
import com.yxh.mobile.entity.cardInfo;
import com.yxh.mobile.entity.cardInfoExample;
import com.yxh.mobile.exception.BusinessException;
import com.yxh.mobile.service.CardService;
import com.yxh.mobile.utils.MD5Utils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service("cardService")
public class CardServiceImpl implements CardService {
    @Resource
    private cardInfoMapper cardInfoMapper;

    //登录检查
    @Override
    public cardInfo loginCheck(String num,String password) {
        if (num.length() == 0 || num == null) {
            throw new BusinessException("L00", "号码为空");
        }
        if (password.length() == 0 || password == null) {
            throw new BusinessException("L03", "密码为空");
        }
        cardInfoExample cardInfoExample = new cardInfoExample();
        com.yxh.mobile.entity.cardInfoExample.Criteria criteria = cardInfoExample.createCriteria();
        criteria.andNumberEqualTo(num);
        List<cardInfo> list = cardInfoMapper.selectByExample(cardInfoExample);
        cardInfo card = list.get(0);
        if (list.size() == 1) {
            String md5 = MD5Utils.md5Encrypt(password,card.getSalt());
            if (!card.getPassword().equals(md5)) {
                throw new BusinessException("L02", "密码错误");
            }
        } else throw new BusinessException("L01", "用户不存在");
        return card;
    }

    //创建账户
    @Override
    @Transactional
    public cardInfo createCard(cardInfo cardInfo,String rePassWord) {
        cardInfoExample cardInfoExample = new cardInfoExample();
        com.yxh.mobile.entity.cardInfoExample.Criteria criteria = cardInfoExample.createCriteria();
        criteria.andNumberEqualTo(cardInfo.getNumber());
        List<cardInfo> list = cardInfoMapper.selectByExample(cardInfoExample);
        if(list.size()!=0){
            throw new BusinessException("R01", "用户已存在");
        }
        int salt = new Random().nextInt(1000) + 1000;
        cardInfo.setSalt(salt);
        cardInfo.setCreateTime(new Date());
        cardInfo.setState("normal");
        cardInfoMapper.insert(cardInfo);
        return cardInfo;
    }


}
