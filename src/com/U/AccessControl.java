package com.U;

import com.L.HelloWorld;

public class AccessControl {
    HelloWorld hello;
    AccessControl() {
        hello = new HelloWorld();
    }

    void AccessCtrl() {
        //int i1 = hello.protected_mem;
        //int i2 = hello.private_mem;
        //int i3 = hello.public_mem;
    }
    void Say(){
        System.out.println("hello 1");
    }
}
