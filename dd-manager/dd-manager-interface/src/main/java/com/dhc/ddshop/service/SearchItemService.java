package com.dhc.ddshop.service;

import com.dhc.ddshop.pojo.vo.TbSearchItemResult;

/**
 * User: DHC
 * Date: 2017/11/22
 * Time: 14:10
 * Version:V1.0
 */
public interface SearchItemService {
    /**
     * 将采集到的数据导入到索引库
     * @return
     */
    boolean importAllItems();

    /**
     * 带条件分页查询索引库的内容
     * @param keyword
     * @param page
     * @param i
     * @return
     */
    TbSearchItemResult search(String keyword, Integer page, int i);
}
