package com.gmf.myapp.utils;

import java.util.List;

/**
 * author: gmf
 * created on: 2020/1/10 10:15
 * description:
 */
public class B {

    /**
     * name : tom
     * age : 0
     * money : 2999
     * hobbies : ["basket","tennis"]
     * collections : {"2":"paint","3":"mouse"}
     */

    private String name;
    private int age;
    private int money;
    private CollectionsBean collections;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public CollectionsBean getCollections() {
        return collections;
    }

    public void setCollections(CollectionsBean collections) {
        this.collections = collections;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public static class CollectionsBean {
        /**
         * 2 : paint
         * 3 : mouse
         */

        @com.google.gson.annotations.SerializedName("2")
        private String _$2;
        @com.google.gson.annotations.SerializedName("3")
        private String _$3;

        public String get_$2() {
            return _$2;
        }

        public void set_$2(String _$2) {
            this._$2 = _$2;
        }

        public String get_$3() {
            return _$3;
        }

        public void set_$3(String _$3) {
            this._$3 = _$3;
        }
    }
}
