public class Main {

    public static void main(String[] args) {

        //Задание 2
        byte var_1 = 125;
        short var_2 = -32766;
        int var_3 = 2147483600;
        long var_4 = -922337203685475808L;
        float var_5 = 543.4584f;
        double var_6 = -4900000000000000000000000000000000000000.0000000001;
        boolean var_7 = true;
        char var_8 = 'H';
        String var_9 = "Hello, i'm Helen. Nice to meet you :)";

        float result_test3 = MakeCalculation(3.14f, 5.45654f, 54.682f, 54654.55f); //Задание 3

        boolean result_test4 = CheckNumbers(5, 7); //Задание 4

        CheckPositivNumber(-56); //Задание 5

        boolean result_test6 = CheckPositivNumberBoolean(24); //Задание 6

        PrintName("Василий"); //Задание 7

        CheckYear(1600); //Задание 8
    }

    /** Задание 3. Производит вычисления с заданными значениями и возвращает результат */
    private static float MakeCalculation(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    /** Задание 4. Проверяет находится ли сумма двух заданных чисел в промежутке от 10 до 20 и возвращает результат */
    private static boolean CheckNumbers(int number_first, int number_second) {
        int sum = number_first + number_second;
        boolean check = sum >= 10 && sum <=20;
        return (check);
    }

    /** Задание 5. Проверяет положительное оно или отрицательное и выводит результат в консоль */
    private static void CheckPositivNumber(int number_to_check_test5) {
        if (number_to_check_test5 >= 0) {
            System.out.println(number_to_check_test5 + " - число положительное");
        } else {
            System.out.println(number_to_check_test5 + " - число отрицательное");
        }
    }

    /** Задание 6. Проверяет положительное оно или отрицательное и возвращает результат */
    private static boolean CheckPositivNumberBoolean(int number_to_check_test6) {
        return (number_to_check_test6 < 0);
    }

    /** Задание 7. Проверяет положительное оно или отрицательное и выводит результат в консоль */
    private static void PrintName(String name_input) {
        System.out.println("Привет, " + name_input + "!");
    }

    /** Задание 8. Проверяет високосный ли год и выводит результат в консоль */
    private static void CheckYear(int year_input) {
        if ((year_input % 4 == 0 && !(year_input % 100 == 0)) || year_input % 400 == 0) {
            System.out.println(year_input + " - високосный год");
        } else {
            System.out.println(year_input + " - не високосный год");
        }
    }
}
