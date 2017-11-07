package com.dhc.ddshop.service.impl;

import com.dhc.ddshop.dao.TbItemMapper;
import com.dhc.ddshop.pojo.po.TbItem;
import com.dhc.ddshop.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: DHC
 * Date: 2017/11/6
 * Time: 9:48
 * Version:V1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbItemMapper itemDao;

    @Override
    public TbItem getById(Long itemId) {
        TbItem tbItem = itemDao.selectByPrimaryKey(itemId);
        return tbItem;
    }

    @Override
    public List<TbItem> listItems() {
        List<TbItem> list = null;
        try {
            list = itemDao.selectByExample(null);
        }catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }
}
