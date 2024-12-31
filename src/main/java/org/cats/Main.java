package org.cats;

import org.cats.File.FileReader;
import org.cats.File.FileWriter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static org.cats.PortScanner.PortScan;

public class Main {

    static String host;

    public static void main(String[] args) throws IOException {
        System.out.println("Выберите один из режимов: 1, 2");
        System.out.println("1 - Определение айпи от домена, также айпи, принадлежащий ноде.");
        System.out.println("2 - Определение айпи от домена, также проверка портов на айпи.");
        String mode = new Scanner(System.in).nextLine();

        if (mode.equals("1")) {
            System.out.println("Введите домен:");
             host = new Scanner(System.in).nextLine();
            System.out.println("Ваш домен: " + host);
            System.out.println("Это верно? Введите y (Да) или n (Нет): ");
            String yesOrNo = new Scanner(System.in).nextLine();
            if (!yesOrNo.equals("y")) {
                main(args);
                return;
            }
           /* System.out.println("Вы уверены, что хотите начать? y (Да) или n (Нет):");
            yesOrNo = new Scanner(System.in).nextLine();
            if (!yesOrNo.equals("y")) {
                System.exit(0);
            } */
            File domains = new File("domains.yml");
            if (!domains.exists()) {
                try {
                    FileWriter.FileWrite();
                } catch (Exception e) {
                    System.out.println("Не удалось создать файл!");
                    System.out.println("Комментарий к ошибке: " + e.getMessage());
                }
            } else {
                try {
                    FileReader.FileRead();
                } catch (Exception e) {
                    System.out.println("Файл не найден или повреждён!");
                    System.out.println("Комментарий к ошибке: " + e.getMessage());
                }
            }
            DomainChecker.DomainCheck();
        } else if (mode.equals("2")) {
            PortScan();
        } else {
            System.out.println("Неверный режим. Попробуйте снова.");
            main(args);
        }
    }
}