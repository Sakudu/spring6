package com.sysy.customDate;

import lombok.Data;

import java.util.Date;

/**
 * @author saku
 * @date 2023/10/9 15:34
 */
@Data
public class Man {

    private Date birth;

    public Man(Date birth) {
        this.birth = birth;
        System.out.println("man 有参构造");
    }

    public Man() {
        System.out.println("man 无参构造");
    }
}
