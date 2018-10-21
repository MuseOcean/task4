import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassWork {

    private BufferedReader reader;

    public void bufferMax(){
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите значение А");
            int numberA = Integer.parseInt(reader.readLine());
            System.out.println("Введите значение B");
            int numberB = Integer.parseInt(reader.readLine());
            System.out.println("Введите значение C");
            int numberC = Integer.parseInt(reader.readLine());
            System.out.println("Введите значение D");
            int numberD = Integer.parseInt(reader.readLine());
            System.out.println(max(numberA, numberB, numberC, numberD));

        } catch(NumberFormatException n) {
            System.out.println("Введите число");
            bufferMax();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private int max(int numberA, int numberB,int numberC, int numberD) {
        return checkValue(checkValue(numberA,numberB),checkValue(numberC,numberD));
    }

    private int checkValue(int numberA, int numberB){
        return numberA > numberB ? numberA : numberB;
    }

    public  void exampleCycle() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i = 'А'; i <= 'Я'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i = 'я'; i >= 'б'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 90; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 90; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = -10; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int index = 0;
        while (index < 20) {
            index++;
            System.out.print(index);
        }
        System.out.println();

        int index1 = 0;
        do {

            index1++;
            System.out.print(index1);
        }
        while (index1 < 20);

        System.out.println();

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                if(i == 1 && (j > 0 && j < 4 )){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}