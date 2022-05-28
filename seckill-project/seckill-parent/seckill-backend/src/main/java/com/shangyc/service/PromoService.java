package com.shangyc.service;

import com.shangyc.model.PromoModel;

/**
 * @author: shangyc
 * @date: 2022/5/29
 */
public interface PromoService {

    /***
     * 根据itemid获取即将进行的或正在进行的秒杀活动
     * @param itemId
     * @return
     */
    PromoModel getPromoByItemId(Integer itemId);

    /***
     * 活动发布
     * @param promoId
     */
    void publishPromo(Integer promoId);

    /***
     * 生成秒杀用的令牌
     * @param promoId
     * @param itemId
     * @param userId
     * @return
     */
    String generateSecondKillToken(Integer promoId, Integer itemId, Integer userId);
}
