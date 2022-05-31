package com.shangyc.behavioral_pattern_11.chain_of_responsibility_pattern;

public class Client {
    public static void main(String args[]){
        PurchaseRequest request = new PurchaseRequest(20000,121,"study");

        Approver director,vicePresident;

        director = new Director("wang director");
        vicePresident = new VicePresident("li vicePresident");

        director.setSuccessor(vicePresident);
        director.processRequest(request);
    }
}
