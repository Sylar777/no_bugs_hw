import hw.first.FirstHomeWork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstHomeWorkTest {
    private FirstHomeWork firstHomeWork;

    @BeforeEach
    void setUp() {
        firstHomeWork = new FirstHomeWork();
    }

    @ParameterizedTest
    @CsvSource({
            "5, false",
            "77, false",
            "-35, true",
            "0, true",
            "175, true"
    })
    public void isMultiplicityMultipleOfFiveAndSevenTest(int value, boolean expected) {
        var result = firstHomeWork.isMultiplicityMultipleOfFiveAndSeven(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-15, false",
            "9, false",
            "10, true",
            "11, true",
            "20, true",
            "21, false"
    })
    public void isBetweenTenAndTwentyTest(int value, boolean expected) {
        var result = firstHomeWork.isBetweenTenAndTwenty(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-2, 4, true",
            "0, 0, true",
            "4, 16, true",
            "5, 50, false",
            "-6, -36, false"
    })
    public void isExponentiationTest(int a, int b, boolean expected) {
        var result = firstHomeWork.isExponentiation(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
                "-5, true",
                "0, false",
                "15, true",
                "20, false"
        })
    public void isTheLastDigitalMultipleOfFiveTest(int value, boolean expected) {
        var result = firstHomeWork.isTheLastDigitalMultipleOfFive(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-11, true",
            "0, true",
            "15, true",
            "21, false"
    })
    public void isSumEvenTest(int value, boolean expected) {
        var result = firstHomeWork.isSumEven(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-5, 5, true",
            "0, 0, true",
            "15, 17, false"
    })
    public void isAbsValueEqualsTest(int a, int b, boolean expected) {
        var result = firstHomeWork.isAbsValueEquals(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-5, Negative",
            "0, Zero",
            "15, Positive"
    })
    public void getDefinitionOfNumberTest(int value, String expected) {
        var result = firstHomeWork.getDefinitionOfNumber(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-33, true",
            "0, true",
            "6, true"
    })
    public void isMultiplicityMultipleOfTwoOrTreeTest(int value, boolean expected) {
        var result = firstHomeWork.isMultiplicityMultipleOfTwoOrTree(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-5, 5, Even",
            "0, 0, Even",
            "1, 13, Even",
            "2, 13, Odd"
    })
    public void getSumIsEvenOrOddTest(int a, int b, String expected) {
        var result = firstHomeWork.getSumIsEvenOrOdd(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-24, true",
            "0, true",
            "6, false",
            "96, true"
    })
    public void isMultiplicityMultipleOfFourAndSixTest(int value, boolean expected) {
        var result = firstHomeWork.isMultiplicityMultipleOfFourAndSix(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-5, 5, Even and Divisible by 10",
            "0, 0, Even and Divisible by 10",
            "-1, 13, Even but not Divisible by 10",
            "0, 13, Odd"
    })
    public void getDefinitionOfSumTest(int a, int b, String expected) {
        var result = firstHomeWork.getDefinitionOfSum(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-5, 0, 5, 5",
            "0, 0, 0, 0",
            "-1, -1, -3, -1"
    })
    public void getMaxValue(int a, int b, int c, int expected) {
        var result = firstHomeWork.getMaxValue(a, b, c);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-242, false",
            "0, true",
            "66, true",
            "1457541, true",
            "123421, false"
    })
    public void isPalindromeTest(int value, boolean expected) {
        var result = firstHomeWork.isPalindrome(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-3, 33, 30",
            "0, 2, 4",
            "-1, 3, 9",
            "7, 8, "
    })
    public void multiplicityOfNumbersAndTheirSumTest(int a, int b, Integer expected) {
        var result = firstHomeWork.multiplicityOfNumbersAndTheirSum(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-1, Incorrect value",
            "0, Child",
            "12, Child",
            "13, Teenager",
            "17, Teenager",
            "18, Adult",
            "64, Adult",
            "65, Senior"
    })
    public void getAgeCategoryTest(int age, String expected) {
        var result = firstHomeWork.getAgeCategory(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "-5, 3, false",
            "0, 2, false",
            "11, 9, true"
    })
    public void isDivisibleWithRemainderTwoTest(int a, int b, boolean expected) {
        var result = firstHomeWork.isDivisibleWithRemainderTwo(a, b);
        assertEquals(expected, result);
    }
}
