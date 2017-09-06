package com.example.ashraf.listview;

/**
 * Created by ASHRAF on 9/6/2017.
 */

public class ViewClass {

    private String stu_name;
    private String stu_id;

    public ViewClass(String stu_name, String stu_id) {
        this.stu_name = stu_name;
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public String getStu_id() {
        return stu_id;
    }
}
