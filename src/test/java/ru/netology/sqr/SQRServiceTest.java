package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void checkCountInsideRange() {
        SQRService service = new SQRService();

        int actual = service.sgrCount(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMinLimitValue() {
        SQRService service = new SQRService();

        int actual = service.sgrCount(100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMaxLimitValue() {
        SQRService service = new SQRService();

        int actual = service.sgrCount(9801, 9801);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkCountOutsideMaxRange() {
        SQRService service = new SQRService();

        int actual = service.sgrCount(9802, Integer.MAX_VALUE);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkCountOutsideMinRange() {
        SQRService service = new SQRService();

        int actual = service.sgrCount(0, 9);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
