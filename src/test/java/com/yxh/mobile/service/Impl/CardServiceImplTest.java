package com.yxh.mobile.service.Impl;

import com.yxh.mobile.entity.cardInfo;
import com.yxh.mobile.service.CardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CardServiceImplTest {
    @Resource
    private CardService cardService;

    @Test
    public void exists() {
        cardInfo cardInfo = new cardInfo();
        cardInfo.setId(1l);
        cardInfo.setNumber("13790556210");
        System.out.println(cardService.loginCheck(cardInfo));

    }
}