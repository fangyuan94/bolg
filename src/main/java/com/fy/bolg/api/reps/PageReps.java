package com.fy.bolg.api.reps;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 结果
 * @param <T>
 */
@ToString
@NoArgsConstructor
public class PageReps<T> {

    private List<T> datas;

    //最大页数
    private Long max;

    private Long total;

    private Long size;

    private Long current;

    public List<T> getDatas() {
        return datas;
    }

    public Long getMax() {

        max = total/size;
        //默认计算
        return total%size==0?max:max+1;
    }

    public Long getTotal() {
        return total;
    }

    public Long getSize() {
        return size;
    }

    public Long getCurrent() {
        return current;
    }


    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }
}
