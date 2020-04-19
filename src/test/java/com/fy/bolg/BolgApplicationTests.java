package com.fy.bolg;

import com.fy.bolg.api.reps.PageReps;
import com.fy.bolg.api.req.ArticleReq;
import com.fy.bolg.api.req.PageReq;
import com.fy.bolg.controller.ArticleController;
import com.fy.bolg.dto.TArticle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class BolgApplicationTests {

    @Autowired
    private ArticleController articleController;

    @Test
    void contextLoads() throws Exception {

//        PageReq<ArticleReq> pageReq = new PageReq<>();
//
//        pageReq.setCurrent(1);
//        pageReq.setSize(3);
//        PageReps<TArticle> allArticle = articleController.getAllArticle(pageReq);
//
//        System.out.println(allArticle);
    }



}
