package com.yxh.mobile.service;

import com.yxh.mobile.entity.cardInfo;

public interface CardService {
    cardInfo loginCheck(cardInfo cardInfo);

    cardInfo createCard(cardInfo cardInfo);
}
