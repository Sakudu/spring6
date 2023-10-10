package com.sysy.circularDependency;

import lombok.Data;

/**
 * @author saku
 * @date 2023/10/10 10:08
 */
@Data
public class Wife {

    private Husband husband;

    private String name;

    public Wife(Husband husband, String name) {
        this.husband = husband;
        this.name = name;
    }

    // 需要重写toString方法：不能直接输出husband，输出husband.getName()。不然会出现递归导致的栈内存溢出错误。
    @Override
    public String toString() {
        return "Wife{" +
                "husband=" + husband.getName() +
                ", name='" + name + '\'' +
                '}';
    }
}
