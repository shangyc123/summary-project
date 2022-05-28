package com.shangyc.service;

import com.shangyc.error.BusinessException;
import com.shangyc.model.ItemModel;

import java.util.List;

/**
 * @author: shangyc
 * @date: 2022/5/29
 */
public interface ItemService {

    /**
     * 创建商品
     * @param itemModel
     * @return
     * @throws BusinessException
     */
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    /***
     * 商品列表浏览
     * @return
     */
    List<ItemModel> listItem();

    /***
     * 商品详情浏览
     * @param id
     * @return
     */
    ItemModel getItemById(Integer id);

    /***
     * item及promo model缓存模型
     * @param id
     * @return
     */
    ItemModel getItemByIdInCache(Integer id);

    /***
     * 库存扣减
     * @param itemId
     * @param amount
     * @return
     * @throws BusinessException
     */
    boolean decreaseStock(Integer itemId, Integer amount)throws BusinessException;

    /***
     * 库存回补
     * @param itemId
     * @param amount
     * @return
     * @throws BusinessException
     */
    boolean increaseStock(Integer itemId, Integer amount)throws BusinessException;

    /***
     * 异步更新库存
     * @param itemId
     * @param amount
     * @return
     */
    boolean asyncDecreaseStock(Integer itemId, Integer amount);

    /***
     * 商品销量增加
     * @param itemId
     * @param amount
     * @throws BusinessException
     */
    void increaseSales(Integer itemId, Integer amount)throws BusinessException;

    /***
     * 初始化库存流水
     * @param itemId
     * @param amount
     * @return
     */
    String initStockLog(Integer itemId, Integer amount);

}
