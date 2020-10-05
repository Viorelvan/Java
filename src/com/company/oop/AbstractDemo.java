package com.company.oop;

abstract class AbstractDemo {
    public void myMethod(){
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}
class Demo extends AbstractDemo implements InterDemo, InterfaceDemo{

    public void anotherMethod() {
        System.out.print("Abstract method");
    }
    public static void main(String args[])
    {
        AbstractDemo obj = new Demo();
        obj.anotherMethod();

        InterDemo id = new Demo();
        int b = InterDemo.a;
    }

    @Override
    public int sum(String a, String b) {
        return 0;
    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }

    //super() -> create constructor in abstract class and call from Demo()
}
