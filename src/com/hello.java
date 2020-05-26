package com;

import java.util.ArrayList;
import java.util.List;

public class hello {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            test(10 - i);
        }
        int i = 0;
        List<User> users = new ArrayList<User>(5);

        for (User user : users) {
            user.setUserId("?????");
            System.out.println(user.getUserId());
        }
    }

    public static void test(int i) {
        System.out.print(Integer.toString(i) + "ce");
        User a = new User("啊啊啊啊", "123456");
        System.out.println(a.getUsername() + " " + a.getUserId());
    }
}
