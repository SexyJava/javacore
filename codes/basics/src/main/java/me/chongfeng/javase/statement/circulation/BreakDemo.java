package me.chongfeng.javase.statement.circulation;

public class BreakDemo {
    // 完成一个四则运算的功能
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
};
