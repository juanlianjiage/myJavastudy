package exception;

public class test {

    public void checkMoney(int money) throws userDefineException {
        if (money<=0){
            throw new userDefineException("����");
        }
    }
    public static void main(String[] args) {
        test test = new test();
        try {
            test.checkMoney(-1);
        } catch (userDefineException e) {
            System.out.println("��׽�쳣"+e.getMessage());
        }

    }

}

