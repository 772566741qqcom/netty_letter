package com.zakl.decorator;

/**
 * @program: netty_lecture
 * @description:
 * @author: ZakL
 * @create: 2019-04-05 09:54
 **/

//具体装饰器实现
public class ConcratorDecorator2 extends Decorator {
    ConcratorDecorator2(Component component) {
        super(component);
    }

    @Override
    public void doSomeThing() {
        super.doSomeThing();
        this.doAnotherThing();

    }

    public void doAnotherThing() {
        System.out.println("功能C");
    }
}
