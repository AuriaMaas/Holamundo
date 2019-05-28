public class Main {
    public int  num ;
    public  String name;

    public Main() {

    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Main objeto = new  Main();
        objeto.setNum(15);
        objeto.setName("Auria");

    }
}
