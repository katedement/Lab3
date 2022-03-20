package com.company;
import java.util.regex.*;
import java.util.Scanner;
public class lab3 {
    //Пользователь вводит с клавиатуры строчку, являющуюся паролем.
    //Проверить, надежно ли составлен пароль. Пароль считается надежным,
    //если он состоит из 8 или более символов. Символом может быть цифра,
    //английская буква, знак подчеркивания. Пароль должен содержать хотя бы
    //одну заглавную букву, одну маленькую букву и одну цифру.
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пароль: ");

        String pw = in.nextLine();
        int len = pw.length();
        if (len > 7) {
                System.out.println(pw.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*"));
            } else {
                System.out.println("Слишком короткий пароль");
            }
        in.close();
    }
}