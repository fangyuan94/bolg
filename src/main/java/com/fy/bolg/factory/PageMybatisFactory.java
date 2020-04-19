package com.fy.bolg.factory;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fy.bolg.api.req.ArticleReq;
import com.fy.bolg.api.req.PageReq;

/**
 * 获取mybatis plus插件
 */
public class PageMybatisFactory {

    public static <T> Page<T>   createInstance(){
        return  new Page<>();
    }

    public static <T> Page<T>   createInstance(PageReq pageReq){
        Page<T> page = new Page<>();
        if(pageReq.getCurrent() == null){
            return createInstance();
        }
        page.setCurrent(pageReq.getCurrent() );
        page.setSize(pageReq.getSize());
        page.setTotal(pageReq.getTotal());
        return page;
    }

}
