import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println("Task 1");
        int[] inputArray1 = {10, 20, 30, 40, 50};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int i = 0; i < inputArray1.length; i++) {
        }
        System.out.println(Arrays.toString(inputArray1));
        for (int money : inputArray1) {
            sum += money;
        }
        for (int money : inputArray1) {
            if (money > max) {
                max = money;
            }
        }
        for (int money : inputArray1) {
            if (money < min) {
                min = money;
            }
        }
        float average = sum / inputArray1.length;
        float[] outPutArray1 = {sum, max, min, average};
        System.out.println(Arrays.toString(outPutArray1));

        System.out.println("Task 2");
        int[] inputArray2 = {50000, 60000, 70000, 80000, 90000};
        double[] outPutArray2 = new double[5];
        for (int i = 0; i < inputArray2.length; i++) {
            System.out.println(inputArray2[i]);
            double tax = inputArray2[i] * 0.13;
            outPutArray2[i] = tax;
            System.out.println(outPutArray2[i]);
            System.out.println();
        }
        System.out.println("Task 3");
        int[] inputArray3 = {0, 1000, 5000, 10000, 15000};
        boolean[] outPutArray3 = new boolean[5];
        int index = 0;
        for (int prize : inputArray3) {
            if (prize > 5000) {
                outPutArray3[index] = true;
                index++;
            } else {
                outPutArray3[index] = false;
                index++;
            }
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outPutArray3));
        System.out.println("Task 4");
        int[] inputArray4 = {10000, 10000, 10000, -10000, 10000};
        boolean[] outPutArray4 = new boolean[5];
        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] > 0) {
                outPutArray4[i] = true;
            } else {
                outPutArray4[i] = false;
            }
            System.out.println(inputArray4[i]);
            System.out.println(outPutArray4[i]);
        }
        System.out.println("Task 5");
        int[] inputArray5 = {500000, 600000, 700000, 800000, 900000};
        int profitableMonthsCount = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonthsCount++;
            }
        }
        int[] outPutArray5 = {profitableMonthsCount};
        System.out.println("Входной массив (inputArray5): " + Arrays.toString(inputArray5));
        System.out.println("Результат (outputArray5 - количество рентабельных месяцев): " + Arrays.toString(outPutArray5));


    }
}