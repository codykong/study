package com.xten.stream;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/10/18
 * Time: 上午11:54
 * To change this template use File | Settings | File Templates.
 */
public class Transaction {
    private int id;
    private int value;
    private int type;

    public Transaction(int id,int value,int type){
        this.id = id;
        this.value = value;
        this.type =type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
