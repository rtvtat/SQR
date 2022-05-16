package ru.netology.sqr;

public class SQRService {
    public int sgrCount(int limitMin, int limitMax) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= limitMin & i * i <= limitMax) {
                count++;
            }
        }
        return count;
    }
}
