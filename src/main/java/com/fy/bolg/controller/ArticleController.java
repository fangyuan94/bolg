package com.fy.bolg.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fy.bolg.annotation.JSONR;
import com.fy.bolg.api.reps.PageReps;
import com.fy.bolg.api.req.ArticleReq;
import com.fy.bolg.api.req.PageReq;
import com.fy.bolg.dto.TArticle;
import com.fy.bolg.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @JSONR
    @GetMapping("/getAll")
    public String  getAllArticle(PageReq<ArticleReq> pageReq, Model model) throws Exception{

        PageReps<TArticle> pageReps = articleService.getAllArticle(pageReq);

        model.addAttribute("pageReps",pageReps);
        return "client/index";
    }

    @GetMapping("/test")
    public String  test() throws Exception{


        return "test";
    }

}
