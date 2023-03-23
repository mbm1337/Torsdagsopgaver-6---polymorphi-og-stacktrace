package Task1;

public class TaskOne {

    public void methodA(String input) {

        if (!input.equals("start")) {
            System.out.println("J");
            System.out.println("a");
            methodB("start");
            System.out.println("a");
        } else {
            System.out.println("e");
            System.out.println(methodC(input));

        }

    }

    public void methodB(String start) {

        System.out.println("v");
    }

    public String methodC(String input) {
        System.out.println("r");
        methodD(input.length());
        return "o";
    }

    public void methodD(int number) {
        System.out.println("s");
        if (number > 5) {
            System.out.println("g");
        }
        System.out.println("j");

    }

    public  void methodE(String input){
        System.out.println("v");
        System.out.println("t");
    }

}
