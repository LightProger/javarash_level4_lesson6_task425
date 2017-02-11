package Alexandr_Nikitchenko;
/*
Цель установлена!
Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
*/

import java.io.*;

public class Solution {

    // Объявление переменных
    private static int X0 = 1, Y0 = 2, X01 = 3, Y02 = 4;

    public static void main(String[] args) throws Exception {
        // Ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 =  reader.readLine();

        // Преобразование строки в число
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        //Определение координа точки
        if(a > 0 && b > 0) System.out.println(X0);
        else if(a < 0 && b > 0) System.out.println(Y0);
        else if(a < 0 && b < 0) System.out.println(X01);
        else if(a > 0 && b < 0) System.out.println(Y02);
    }
}