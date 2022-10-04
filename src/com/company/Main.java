package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Part1();
        System.out.println();
        Part2();
    }

    static void Part1()
    {
        int i = 5;
        for (int k = 1; k <= 5; k++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j==i)
                    System.out.print(j);
                else
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Part2()
    {
        for (int i = 1; i<=5; i++)
        {
            for (int k = i; k<i+5; k++)
            {
                if (k==i+4)
                    System.out.print(k);
                else
                    System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
