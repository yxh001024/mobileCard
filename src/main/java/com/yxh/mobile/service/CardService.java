package com.yxh.mobile.service;

import com.yxh.mobile.entity.cardInfo;

public interface CardService {
    cardInfo loginCheck(String num,String password);

    cardInfo createCard(cardInfo cardInfo,String rePW);
}
