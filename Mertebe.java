//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mertebe {
    public static void main(String[] args) {
        int number = 63742;
        int mertebe = 0;
        while (number > 0) {
            number /= 10;
            mertebe++;
        }
        System.out.println(mertebe) ;
        }
    }
