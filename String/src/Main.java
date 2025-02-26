import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Bharat");
        try {
            System.out.println(a / 0);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e1){
            System.out.println(e1);
        }

        finally
        {
            System.out.println("ram");
        }

    }
}