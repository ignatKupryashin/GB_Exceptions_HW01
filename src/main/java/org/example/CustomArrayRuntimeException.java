package org.example;
public class CustomArrayRuntimeException extends RuntimeException{
    int length1;
    int length2;

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    public CustomArrayRuntimeException(String message, int length1, int length2) {
        super(message);
        this.length1 = length1;
        this.length2 = length2;
    }
}
