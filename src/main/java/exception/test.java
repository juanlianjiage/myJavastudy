package exception;

public class test {

    public void checkMoney(int money) throws userDefineException {
        if (money<=0){
            throw new userDefineException("Óà¶î²»×ã");
        }
    }
    public static void main(String[] args) {
        test test = new test();
        try {
            test.checkMoney(-1);
        } catch (userDefineException e) {
            System.out.println("²¶×½Òì³£"+e.getMessage());
        }

    }

}

