package com.fy.bolg.api.req;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 分页有关
 */
@Data
@Getter
@Setter
@ToString
public class PageReq<T> implements Serializable {

    //查询条件对象
    private T t;

    private Long total;

    private Long size;

    private Long current;

}
