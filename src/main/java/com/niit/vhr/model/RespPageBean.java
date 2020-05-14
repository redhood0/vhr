package com.niit.vhr.model;

import java.util.List;

/**
 * @PackgeName: com.niit.vhr.model
 * @ClassName: RespPageBean
 * @Author: redhood
 * Date: 2020/5/12 12:43
 * project name: vhr
 * @Version:
 * @Description:
 */
public class RespPageBean {
    private Long total;
    private List<?> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
