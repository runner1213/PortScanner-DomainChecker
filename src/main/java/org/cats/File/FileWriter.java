package org.cats.File;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileWriter {
    public static void FileWrite() throws IOException {
        try {
            // Чтение ресурса
            InputStream inputStream = FileWriter.class.getClassLoader().getResourceAsStream("domains.yml");
            if (inputStream == null) {
                throw new IllegalArgumentException("Файл config.yml не найден в resources!");
            }

            // Определение директории, где находится jar
            Path jarPath = new File(FileWriter.class.getProtectionDomain().getCodeSource().getLocation().toURI()).toPath();
            Path outputDir = jarPath.getParent(); // Директория с jar файлом
            Path outputFile = outputDir.resolve("domains.yml");

            // Копирование файла
            Files.copy(inputStream, outputFile, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Файл успешно записан: " + outputFile.toAbsolutePath());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
