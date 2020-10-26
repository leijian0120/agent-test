package com.ken;


import com.sun.tools.attach.VirtualMachine;

/**
 * Created by kaminari on 2020/10/23.
 */
public class AttachMain {
    public static void main(String[] args) {
        try {
            VirtualMachine vm = VirtualMachine.attach("4852");
            vm.loadAgent("D:\\workspace_idea\\maven-agent-after\\target\\maven-agent-after-1.0-SNAPSHOT.jar");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
