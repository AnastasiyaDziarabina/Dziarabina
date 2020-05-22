package com.stormnet.homework.homework7.Task5;

import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

public class FilesZip {
    public static void main(String[] args) throws IOException {

        File dir = new File("D://task5");
        boolean created = dir.mkdir();

        if (created) {
            System.out.println("Folder is created!");
        }

        String text = "File one for Task5";
        try (FileOutputStream fis = new FileOutputStream("D://task5//file1.txt")) {
            byte[] buffer = text.getBytes();

            fis.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

        }
        System.out.println("Your file 1 has been written!");

        String text1 = "File two for Task5";
        text = text1;
        try (FileOutputStream fos = new FileOutputStream("D://task5//file2.txt")) {
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex1) {

        }
        System.out.println("Your file 2 has been written!");

        String text2 = "File three for Task5";
        text = text2;
        try (FileOutputStream fos = new FileOutputStream("D://task5//file3.txt")) {
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex2) {

        }
        System.out.println("Your file 3 has been written!");

        String filename = "D://task5//file1.txt";
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("D://task5//output.zip"));
             FileInputStream fis = new FileInputStream(filename);) {
            ZipEntry entry1 = new ZipEntry("file1.txt");
            zout.putNextEntry(entry1);

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            zout.write(buffer);

            zout.closeEntry();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        String filename2 = "D://task5//file2.txt";
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("D://task5//output.zip"));
             FileInputStream fis = new FileInputStream(filename2);) {
            ZipEntry entry2 = new ZipEntry("file2.txt");
            zout.putNextEntry(entry2);

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            zout.write(buffer);

            zout.closeEntry();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        String filename3 = "D://task5//file3.txt";
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("D://task5//output.zip"));
             FileInputStream fis = new FileInputStream(filename3);) {
            ZipEntry entry3 = new ZipEntry("file3.txt");
            zout.putNextEntry(entry3);

            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            zout.write(buffer);

            zout.closeEntry();
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("Your files were successfully added in archive");

        File dir2 = new File("D://rename");
        boolean rename = dir2.renameTo(dir2);
        if (rename) {
            System.out.println("Folder has been renamed! Folder name: " + dir2.getName());
        }
        if (dir2.isDirectory()) {
            System.out.println("Folder consist:");
            for (File f : dir2.listFiles()) {
                System.out.println(f.getName() + " file");
            }
        }

        String[] entries = dir2.list();
        for (String s : entries) {
            File currentFile = new File(dir2.getPath(), s);
            currentFile.delete();
        }
        boolean delete = dir2.delete();
        if (delete) {
            System.out.println("Folder has been deleted!");
        }
    }
}