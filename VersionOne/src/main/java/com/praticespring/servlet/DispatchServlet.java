package com.praticespring.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---------- 调用doPost ----------");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        //定位
        doLoadConfig();


        //加载
        doScanner();

        //注册
        doRegistry();

        //自动依赖注入
        doAutowired();

        initHandleMapping();

    }

    private void initHandleMapping() {

    }

    private void doAutowired() {

    }

    private void doRegistry() {

    }

    private void doScanner() {

    }

    private void doLoadConfig() {

    }

    private String lowerFirstCase(String str){
        char[] strArray = str.toCharArray();
        strArray[0]+= 32;
        return strArray.toString();
    }
}
