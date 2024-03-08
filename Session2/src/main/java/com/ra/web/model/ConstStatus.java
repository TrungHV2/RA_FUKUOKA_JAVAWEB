package com.ra.web.model;

public interface ConstStatus {
    interface Product {
        boolean ACTIVE = true;
        boolean INACTION = false;
    }
    interface Bill {
        byte CREATE = 0;
        byte CANCEL = 1;
        byte APPROVE = 2;
    }
    interface Account {
        boolean ACTIVE = true;
        boolean BLOCK = false;
    }
    interface Employee {
        byte ACTIVE = 0;
        byte SLEEP = 1;
        byte QUIT = 2;
    }
}
