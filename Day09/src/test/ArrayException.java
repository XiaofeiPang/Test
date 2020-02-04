package test;

import java.util.Scanner;

public class ArrayException {
    public static void fun() {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] m = new int[10];
        m[s] = 10;
        System.out.println("yuan");
    }

    private static void go() {
        fun();
    }

    private static void h() {
        go();
    }

    private static void k() {
        try {
            h();
            System.out.println("in k()");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fei");
            throw e;
        }finally {
            System.out.println("秦大坏蛋");
        }
    }

    public static void main(String[] args) {


        try {
            k();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("qing");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("庞洋洋");

    }


}
