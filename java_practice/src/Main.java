//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ternaryOperator(35);
        nestedTernay(10);
    }

    public static void ternaryOperator(int marks){
        String result = (marks > 35) ? "pass" : "fail";
        System.out.println(result);
    }

    public static void nestedTernay(int temperature) {
        String message = (temperature < 0) ? "It's freezing!" : (temperature < 20) ? "It's cool." : "It's warm.";
        System.out.println(message);
        //this is messege

    }
}