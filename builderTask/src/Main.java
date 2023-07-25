import java.io.Console;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Director szef = new Director();
        Scanner scanner = new Scanner(System.in);


        System.out.println("First opponent: ");
        System.out.println("1. Ogień");
        System.out.println("2. Woda");
        System.out.println("3. Piorun");
        System.out.println("4. Ziemia");
        System.out.println("5. Wiatr");
        System.out.println("Wybieram: ");
        String firstChoice = scanner.nextLine();
        szef.getBuilder(firstChoice);

        System.out.println("Second opponent: ");
        System.out.println(szef.getBuilder(firstChoice).getClass().getName() + " vs: ");
        System.out.println("1. Ogień");
        System.out.println("2. Woda");
        System.out.println("3. Piorun");
        System.out.println("4. Ziemia");
        System.out.println("5. Wiatr");
        String secondChoice = scanner.nextLine();
        szef.getBuilder(secondChoice);


        try {
            System.out.println(szef.getBuilder(firstChoice).getClass().getName() + " VS " + szef.getBuilder(secondChoice).getClass().getName());

            Builder builder = szef.getBuilder(firstChoice);
            Builder builder2 = szef.getBuilder(secondChoice);

            szef.setBuilder(builder);
            szef.get();
            Elements first = szef.getElement();
            szef.setBuilder(builder2);
            szef.get();
            Elements second = szef.getElement();

            first.show();
            System.out.println("--------------------------");
            second.show();
            System.out.println("--------------------------");

            TimeUnit.SECONDS.sleep(1);
            System.out.println("3");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("2");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("1");
            System.out.println("FIGHT");
            TimeUnit.SECONDS.sleep(1);

            if (first.getName() == second.getWeakAgainst()) {
                System.out.println(first.getName() + " WINS!!!");
            } else if (first.getWeakAgainst() == second.getName()) {
                System.out.println(second.getName() + " WINS!!!");
            } else {
                System.out.println("Its a draw! time to rematch;)");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}