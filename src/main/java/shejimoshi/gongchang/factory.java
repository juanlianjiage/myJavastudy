package shejimoshi.gongchang;


import static Thread.Collections.Concurrent.a;

/*
* 工厂模式：就是对实现相同接口的类进行实力的创建
* */
public class factory {


    public peosonA createPeosonA() {
        return new peosonA();
    }
    public personB createPersonB() {
        return new personB();
    }
}
