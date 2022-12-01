import java.util.Scanner;
import java.util.regex.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату: ");
        String date = in.nextLine();
        String pattern = "^[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]";
        String pattern1 = "(29|[3-9][0-9])/02/[0-2][0-9][0-9][0-9]";
        Pattern p1 = Pattern.compile(pattern1);
        Matcher match1 = p1.matcher(date);
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(date);
        if (!(match.matches())) {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            System.exit(0);
        }
        String pattern2 = "^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])";
        Pattern p2 = Pattern.compile(pattern2);
        Matcher match2 = p2.matcher(date);
        if (match2.matches()) {
            if(match1.matches() == false) {
                System.out.println("Данные корректны");
            }
            else {
                System.out.println("Данные некорректны");
            }

        } else {
            System.out.println("Данные некорректны");
        }

    }
}