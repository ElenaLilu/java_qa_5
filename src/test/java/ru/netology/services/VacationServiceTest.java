package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
    @ParameterizedTest
//   @CsvSource({
//           "3,10000,3000,20000",
//           "2,100000,60000,150000"
//   })
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testCalculate1(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, threshold);
        // int expected = 3;

        Assertions.assertEquals(actual, expected);


    }

    // @Test
    //  public void testCalculate2() {
    //      VacationService service = new VacationService();
    //    int actual = service.calculate(100_000, 60_000, 150_000);
    //      int expected = 2;

    //      Assertions.assertEquals(actual, expected);


}
