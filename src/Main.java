public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] expensens = new int[]{5,4,3,2,1};
        int expensensSumm = 0;
        for (int i = 0; i < expensens.length; i++) {
            expensensSumm += expensens[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.\n", expensensSumm);

        //Задача 2
        int expensensMin = expensens[0];
        int expensensMax = expensens[0];
        for (int i = 0; i < expensens.length; i++) {
            if (expensens[i] < expensensMin) {
                expensensMin = expensens[i];
            }
            if (expensens[i] > expensensMax) {
                expensensMax = expensens[i];
            }
        }
        System.out.printf("Минимальная трата за неделю составила %d рублей.\n", expensensMin);
        System.out.printf("Максимальная трата за неделю составила %d рублей.\n", expensensMax);

        //Задача 3
        float expensensAverage = (float)expensensSumm / expensens.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", expensensAverage);

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char buffer;
        for (int i = 0; i < (reverseFullName.length/2); i++) {
            buffer = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = buffer;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}