package org.cats;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PortScanner extends Main {
    public static void PortScan() {
        System.out.println("Введите домен:");
        String host = new Scanner(System.in).nextLine();
        System.out.println("Ваш домен: " + host);
        System.out.println("Это верно? Введите y (Да) или n (Нет): ");
        String yesOrNo = new Scanner(System.in).nextLine();
        if (!yesOrNo.equals("y")) {
            System.exit(0);
            return;
        }
        try {
            InetAddress inetAddress = InetAddress.getByName(host);
            String ip = inetAddress.getHostAddress();
            System.out.println("Айпи домена " + host + ": " + ip);
        } catch (UnknownHostException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.exit(0);
            return;
        }
        System.out.println("Введите диапазон портов. Начальный порт:");
        int startPort = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Введите диапазон портов. Конечный порт:");
        int endPort = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Введите количество потоков (больше 0!):");
        int threads = Integer.parseInt(new Scanner(System.in).nextLine());

        ExecutorService executor = Executors.newFixedThreadPool(threads);
        for (int port = startPort; port <= endPort; port++) {
            final int currentPort = port;
            executor.submit(() -> {
                try {
                    new java.net.Socket(host, currentPort).close();
                    System.out.println("Порт " + currentPort + " открыт");
                } catch (Exception e) {
                    System.out.println("Порт " + currentPort + " закрыт");
                }
            });
        }
        executor.shutdown();
    }
}
