package org.cats;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DomainChecker extends Main {
    public static void DomainCheck() {
        try {
            InetAddress inetAddress = InetAddress.getByName(Main.host);
            String ip = inetAddress.getHostAddress();
            System.out.println("Айпи домена " + host + ": " + ip);
            switch (ip) {
                case "65.108.100.119" -> System.out.println("Ваш айпи совпадает с donator1.gamely.pro!");
                case "65.108.206.102" -> System.out.println("Ваш айпи совпадает с donator2.gamely.pro!");
                case "65.108.225.15" -> System.out.println("Ваш айпи совпадает с donator3.gamely.pro!");
                case "65.108.226.229" -> System.out.println("Ваш айпи совпадает с donator4.gamely.pro!");
                case "65.108.228.137" -> System.out.println("Ваш айпи совпадает с donator5.gamely.pro!");
                case "65.108.227.231" -> System.out.println("Ваш айпи совпадает с donator6.gamely.pro!");
                case "65.108.234.37" -> System.out.println("Ваш айпи совпадает с donator7.gamely.pro!");
                case "65.108.75.109" -> System.out.println("Ваш айпи совпадает с donator8.gamely.pro!");
                case "65.109.23.34" -> System.out.println("Ваш айпи совпадает с donator9.gamely.pro!");
                case "65.109.38.94" -> System.out.println("Ваш айпи совпадает с donator10.gamely.pro!");
                case "95.217.107.186" -> System.out.println("Ваш айпи совпадает с donator11.gamely.pro!");
                case "95.217.63.62" -> System.out.println("Ваш айпи совпадает с donator12.gamely.pro!");
                case "95.217.106.163" -> System.out.println("Ваш айпи совпадает с donator13.gamely.pro!");
                case "135.181.178.58" -> System.out.println("Ваш айпи совпадает с donator14.gamely.pro!");
                case "95.217.43.185" -> System.out.println("Ваш айпи совпадает с donator15.gamely.pro!");
                case "65.109.114.208" -> System.out.println("Ваш айпи совпадает с donator16.gamely.pro!");
                case "65.21.88.156" -> System.out.println("Ваш айпи совпадает с donator20.gamely.pro!");
                case "167.235.181.103" -> System.out.println("Ваш айпи совпадает с donator21.gamely.pro!");
                case "144.76.113.152" -> System.out.println("Ваш айпи совпадает с donator22.gamely.pro!");
                case "136.243.55.236" -> System.out.println("Ваш айпи совпадает с donator23.gamely.pro!");
                case "65.21.220.210" -> System.out.println("Ваш айпи совпадает с donator24.gamely.pro!");
                case "65.109.95.247" -> System.out.println("Ваш айпи совпадает с donator25.gamely.pro!");
                case "5.9.97.124" -> System.out.println("Ваш айпи совпадает с donator26.gamely.pro!");
                case "65.108.237.51" -> System.out.println("Ваш айпи совпадает с donator27.gamely.pro!");
                case "65.108.239.236" -> System.out.println("Ваш айпи совпадает с donator28.gamely.pro!");
                case "65.109.123.25" -> System.out.println("Ваш айпи совпадает с donator29.gamely.pro!");
                case "65.109.58.46" -> System.out.println("Ваш айпи совпадает с donator30.gamely.pro!");
                case "65.109.69.99" -> System.out.println("Ваш айпи совпадает с donator31.gamely.pro!");
                case "185.9.145.192" -> System.out.println("Ваш айпи совпадает с donator32.gamely.pro!"); // (Ryzen 9 7950x) (RU)
                case "135.181.229.166" -> System.out.println("Ваш айпи совпадает с donator33.gamely.pro!"); // (Ryzen 9 7950x3D)
                case "144.76.61.107" -> System.out.println("Ваш айпи совпадает с donator34.gamely.pro!"); // (Ryzen 9 7950x3D)
                case "185.219.84.38" -> System.out.println("Ваш айпи совпадает с game4.gamely.pro!");
                case "185.219.84.39" -> System.out.println("Ваш айпи совпадает с game5.gamely.pro!"); // (Ryzen 9 5950X)
                case "185.219.84.43" -> System.out.println("Ваш айпи совпадает с game6.gamely.pro!");
                case "185.254.98.185" -> System.out.println("Ваш айпи совпадает с game8.gamely.pro!");
                case "45.145.42.42" -> System.out.println("Ваш айпи совпадает с game9.gamely.pro!");
                case "45.157.235.2" -> System.out.println("Ваш айпи совпадает с game10.gamely.pro!");
                case "85.219.84.148" -> System.out.println("Ваш айпи совпадает с game11.gamely.pro!");
                case "95.216.114.205" -> System.out.println("Ваш айпи совпадает с free6.gamely.pro!");
                case "195.201.202.184" -> System.out.println("Ваш айпи совпадает с free7.gamely.pro!");
                case "65.108.74.334" -> System.out.println("Ваш айпи совпадает с free8.gamely.pro!");
                case "142.132.250.32" -> System.out.println("Ваш айпи совпадает с free9.gamely.pro!");
                case "65.109.66.96" -> System.out.println("Ваш айпи совпадает с neptune.spaceroute.net!");
                case "45.157.235.10" -> System.out.println("Ваш айпи совпадает с saturn.spaceroute.net!");
                case "45.157.235.6" -> System.out.println("Ваш айпи совпадает с venus.spaceroute.net!");
                case "185.9.145.210" -> System.out.println("Ваш айпи совпадает с jupiter.spaceroute.net!"); // (RU)
            }
            new Scanner(System.in).nextLine();
        } catch (UnknownHostException e) {
            System.out.println("§cОшибка: " + e.getMessage());
            System.exit(0);
        }
    }
}
