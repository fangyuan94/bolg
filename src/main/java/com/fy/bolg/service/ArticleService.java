package com.fy.bolg.service;

import com.fy.bolg.api.reps.PageReps;
import com.fy.bolg.api.req.ArticleReq;
import com.fy.bolg.api.req.PageReq;
import com.fy.bolg.dto.TArticle;

public interface ArticleService {

    PageReps<TArticle> getAllArticle(PageReq<ArticleReq> pageReq) throws Exception;
}
