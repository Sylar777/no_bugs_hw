package hw.first;

import java.util.*;

public class FirstHomeWork {
    /**
     * Проверка делимости на 5 и 7 одновременно
     *
     * @param value - целое число
     * @return true - если делится на 5 и 7 одновременно, иначе false
     */
    public boolean isMultiplicityMultipleOfFiveAndSeven(int value) {
        return (value % 5 == 0) && (value % 7 == 0);
    }

    /**
     * Определение принадлежности числа интервалу
     *
     * @param value - целое число
     * @return true - если число принадлежит интервалу [10, 20], иначе false
     */
    public boolean isBetweenTenAndTwenty(int value) {
        return (value >= 10) && (value <= 20);
    }

    /**
     * Проверка на квадрат числа
     *
     * @param a - целое число
     * @param b - целое число
     * @return true - если одно из чисел является квадратом другого, иначе false
     */
    public boolean isExponentiation(int a, int b) {
        return Math.pow(a, 2) == b || Math.pow(b, 2) == a;
    }

    /**
     * Проверка последней цифры
     *
     * @param value - целое число
     * @return true - если последняя цифра числа 5, иначе false
     */
    public boolean isTheLastDigitalMultipleOfFive(int value) {
        return (value % 10 != 0) && (value % 5 == 0);
    }

    /**
     * Проверка, является ли сумма цифр четной
     *
     * @param value - целое число
     * @return true - если сумма цифр числа четная, иначе false
     */
    public boolean isSumEven(int value) {
        if (value < 0) {
            value = Math.abs(value);
        }

        var alphabeticValue = "" + value;
        List<String> stringList = Arrays.asList(alphabeticValue.split(""));

        var sum = stringList.stream()
                .mapToInt(Integer::parseInt)
                .sum();

        return sum % 2 == 0;
    }

    /**
     * Сравнение двух чисел по модулю
     *
     * @param a - целое число
     * @param b - целое число
     * @return true - если числа по модулю равны, иначе false
     */
    public boolean isAbsValueEquals(int a, int b) {
        return Math.abs(a) == Math.abs(b);
    }

    /**
     * Проверка знака числа
     *
     * @param value - целое число
     * @return "Zero" - если число равно 0, "Negative" - если число отрицательное,
     * "Positive" - если число положительное
     */
    public String getDefinitionOfNumber(int value) {
        if (value == 0) {
            return "Zero";
        } else if (value < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    /**
     * Проверка делимости на 2 или 3
     *
     * @param value - целое число
     * @return true - если число делится на 2 или 3, иначе false
     */
    public boolean isMultiplicityMultipleOfTwoOrTree(int value) {
        return (value % 2 == 0) || (value % 3 == 0);
    }

    /**
     * Четность суммы двух чисел
     *
     * @param a - целое число
     * @param b - целое число
     * @return "Even" - если сумма чисел четная, "Odd" - если сумма чисел нечетная
     */
    public String getSumIsEvenOrOdd(int a, int b) {
        return (a + b) % 2 == 0 ? "Even" : "Odd";
    }

    /**
     * Определение числа, кратного и 4, и 6
     *
     * @param value - целое число
     * @return true - если число кратно 4 и 6 одновременно, иначе false
     */
    public boolean isMultiplicityMultipleOfFourAndSix(int value) {
        return (value % 4 == 0) && (value % 6 == 0);
    }

    /**
     * Проверка суммы на четность и кратность 10
     *
     * @param a - целое число
     * @param b - целое число
     * @return "Even and Divisible by 10" - если сумма четная и делится на 10,
     * "Even but not Divisible by 10" - если сумма четная, но не делится на 10,
     * "Odd" - если сумма нечетная
     */
    public String getDefinitionOfSum(int a, int b) {
        var sum = a + b;
        if (sum % 10 == 0) {
            return "Even and Divisible by 10";
        } else if (sum % 2 == 0) {
            return "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }

    /**
     * Максимум трех чисел
     *
     * @param a - целое число
     * @param b - целое число
     * @param c - целое число
     * @return максимальное число
     */
    public int getMaxValue(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /**
     * Проверка на палиндромность числа
     *
     * @param value - целое число
     * @return true - если число палиндром, иначе false
     */
    public boolean isPalindrome(int value) {
        if(value < 0) {
            return false;
        }
        var alphabeticValue = "" + value;
        List<String> stringList = Arrays.asList(alphabeticValue.split(""));
        for (int i = 0; i < stringList.size() / 2; i++) {
            if (!stringList.get(i).equals(stringList.get(stringList.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Кратность чисел и их сумма
     *
     * @param a - целое число
     * @param b - целое число
     * @return сумма чисел, если оба числа кратны 3,
     * если одно из них кратно 3, вернется удвоенное значение второго числа,
     * иначе null
     */
    public Integer multiplicityOfNumbersAndTheirSum(int a, int b) {
        if (a % 3 == 0 && b % 3 == 0) {
            return a + b;
        } else if (a % 3 == 0 || b % 3 == 0) {
            return b * b;
        } else {
            return null;
        }
    }

    /**
     * Проверка возраста на категорию
     *
     * @param value - целое число
     * @return Child (до 12 лет), Teenager (от 13 до 17 лет), Adult (от 18 до 64 лет) или Senior (от 65 лет и старше)
     */
    public String getAgeCategory(int value) {
        if (value < 0) {
            return "Incorrect value";
        } else if (value >= 0 && value <= 12) {
            return "Child";
        } else if (value >= 13 && value <= 17) {
            return "Teenager";
        } else if (value >= 18 && value <= 64) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    /**
     * Проверка на делимость с остальным значением
     *
     * @param a - целое число
     * @param b - целое число
     * @return true - если число делится на остаток 2, иначе false
     */
    public boolean isDivisibleWithRemainderTwo(int a, int b) {
        return a % b == 2;
    }
}
