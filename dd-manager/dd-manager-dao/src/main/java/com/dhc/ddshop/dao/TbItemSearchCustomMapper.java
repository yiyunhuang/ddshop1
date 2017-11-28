package com.dhc.ddshop.dao;

import com.dhc.ddshop.pojo.vo.TbItemSearchCustom;

import java.util.List;

/**
 * User: DHC
 * Date: 2017/11/22
 * Time: 14:20
 * Version:V1.0
 */
public interface TbItemSearchCustomMapper {
    /**
     * 查询所有商品封装到指定BEAN中
     * @return
     */
    List<TbItemSearchCustom> listSearchItems();
    /**
     * 按主键查询指定商品封装到指定BEAN中
     * @return
     */
    TbItemSearchCustom getById(Long itemId);
}
