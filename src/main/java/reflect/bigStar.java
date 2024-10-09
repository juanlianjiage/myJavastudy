package reflect;

public class bigStar implements star{
    private String name;

    public bigStar(String name) {
        this.name = name;
    }

    public bigStar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sing(String sing) {
        System.out.println(this.name+"在唱"+sing);
        return "谢谢！";
    }
}
