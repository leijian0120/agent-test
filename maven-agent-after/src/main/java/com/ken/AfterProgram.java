package com.ken;

import java.lang.instrument.Instrumentation;

/**
 * Created by kaminari on 2020/10/23.
 */
public class AfterProgram {

    public static void agentmain(String args, Instrumentation ins) {
        System.out.println("load agent after main run.args=" + args);

        Class[] classes = ins.getAllLoadedClasses();

        for (Class aClass : classes) {
            System.out.println(aClass.getName());
        }
        System.out.println("agent run completely.");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 方法一：启动前指定
        // https://www.jianshu.com/p/63c328ca208d

    }
}
