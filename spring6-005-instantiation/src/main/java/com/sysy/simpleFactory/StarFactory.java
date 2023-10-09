package com.sysy.simpleFactory;

/**
 * @author saku
 * @date 2023/10/9 14:24
 */
public class StarFactory {

    public static Star get(){
        return new Star();
    }
}
