package com.fy.bolg.dto;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Data
@ToString
@EqualsAndHashCode()
public class TArticle implements Serializable {

    //主键id
    @Id
    private Long id;

    private String title;

    private String content;

    private Date created;

    private Date modified;

    private String categories;

    private String tags;

    private Boolean allowComment;

    private String thumbnail;

}
