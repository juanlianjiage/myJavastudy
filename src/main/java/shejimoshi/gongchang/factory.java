package shejimoshi.gongchang;


import static Thread.Collections.Concurrent.a;

/*
* ����ģʽ�����Ƕ�ʵ����ͬ�ӿڵ������ʵ���Ĵ���
* */
public class factory {


    public peosonA createPeosonA() {
        return new peosonA();
    }
    public personB createPersonB() {
        return new personB();
    }
}
