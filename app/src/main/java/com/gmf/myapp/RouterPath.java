package com.gmf.myapp;

import com.gmf.myapp.bean.TestBean;

import java.util.ArrayList;
import java.util.List;

/**
 * author: gmf
 * created on: 2020/1/15 17:30
 * description:
 */
public class RouterPath {
    public static final String PATH_COORDINATORACTIVITY = "/activity/path_coordinatoractivity";
    public static List<TestBean> testBeans = new ArrayList<>();

    public static void init() {
        testBeans.add(new TestBean("Coordinator特性", PATH_COORDINATORACTIVITY));
    }
}
