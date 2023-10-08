package com.sysy;

import com.sysy.project.controller.UserController;

/**
 * @author saku
 * @date ${DATE} ${TIME}
 */
public class Main {

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.delete();
    }
}
