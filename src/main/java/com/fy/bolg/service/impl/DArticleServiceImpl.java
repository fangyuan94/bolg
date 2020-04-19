package com.fy.bolg.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fy.bolg.api.reps.PageReps;
import com.fy.bolg.api.req.ArticleReq;
import com.fy.bolg.api.req.PageReq;
import com.fy.bolg.dto.TArticle;
import com.fy.bolg.factory.PageMybatisFactory;
import com.fy.bolg.factory.RespPageFactory;
import com.fy.bolg.mapper.ArticleMapper;
import com.fy.bolg.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class DArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public PageReps<TArticle> getAllArticle(PageReq<ArticleReq> pageReq) throws Exception {

        Page<TArticle>  quertyPage = PageMybatisFactory.createInstance(pageReq);

        quertyPage = articleMapper.selectPage(quertyPage, Wrappers.<TArticle> lambdaQuery());

        return RespPageFactory.createInstance(quertyPage);
    }



}
