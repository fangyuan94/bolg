package com.fy.bolg.factory;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fy.bolg.api.reps.PageReps;

/**
 * 构建返回结果集
 */
public class RespPageFactory {

    public static <T> PageReps<T> createInstance(){
        return  new PageReps<T>();
    }

    public static <T> PageReps<T>   createInstance(Page<T>  page){
        PageReps<T> pager= new PageReps<T>();
        pager.setCurrent(page.getCurrent());
        pager.setSize(page.getSize());
        pager.setTotal(page.getTotal());
        pager.setDatas(page.getRecords());
        return pager;
    }
}
