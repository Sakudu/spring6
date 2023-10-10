package com.sysy.circularDependency;

import lombok.Data;

/**
 * @author saku
 * @date 2023/10/10 10:08
 */
@Data
public class Husband {

    private Wife wife;

    private String name;

    public Husband(Wife wife, String name) {
        this.wife = wife;
        this.name = name;
    }

    // 需要重写toString方法：不能直接输出wife，输出wife.getName()。不然会出现递归导致的栈内存溢出错误。
    @Override
    public String toString() {
        return "Husband{" +
                "wife=" + wife.getName() +
                ", name='" + name + '\'' +
                '}';
    }
}
