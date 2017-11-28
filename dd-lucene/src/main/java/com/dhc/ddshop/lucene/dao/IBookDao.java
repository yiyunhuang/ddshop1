package com.dhc.ddshop.lucene.dao;

import com.dhc.ddshop.lucene.po.Book;

import java.util.List;

/**
 * 数据访问层接口
 * User: DHC
 * Date: 2017/11/21
 * Time: 14:12
 * Version:V1.0
 */
public interface IBookDao {
    /**
     * 采集数据：查询所有图书
     * @return
     */
    List<Book> listBooks();
}
