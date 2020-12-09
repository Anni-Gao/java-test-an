package com.experiment08;

import java.io.*;

import java.nio.file.*;

public class IOTest {


    public static void main(String[] args) throws IOException {
        String fileName = "C:/example/from.txt";

        System.out.println("----- 创建文件 ------");
        createFile(fileName);

        System.out.println("-----  将字符串写入文件 -------");
        // \r\n在txt文本中换行
        String str =
                "白日依山尽\r\n" +
                        "黄河入海流\r\n" +
                        "欲穷千里目\r\n" +
                        "更上一层楼\r\n";
        writeToFile(fileName, str);
        System.out.println("--------- 基于基本IO流实现文件的复制 ----------");
        String toFile = "C:/example/to.txt";
        copyByIO(fileName, toFile);
/*
        System.out.println("--------- 基于NIO实现文件的复制 ----------");
        String toFile2 = "C:/example/nio/to.txt";
        copyByNIO(fileName, toFile2);
*/
        System.out.println("---------- 删除指定文件 -------------");
        deleteFile(toFile);
        System.out.println("---------- 遍历指定目录文件 -------------");
        String dir = "C:/example";
        walkDirectories(dir);
    }

    /**
     * 基于指定文件名称创建目录及文件
     * 如果文件已经存在，则忽略
     *
     * @param fileName
     */
    private static void createFile(String fileName){
        File file = new File(fileName);
        if (!file.exists()) {
            Path path = Path.of(fileName);
            try {
                Files.createDirectories(path.getParent());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 提示：文件以字节操作，因此可以
     * 字符串，转字节数组，直接基于Files写入文件
     *
     * @param fileName
     * @param content
     */
    private static void writeToFile(String fileName, String content) {
        Path path = Paths.get(fileName);
        byte[] strToBytes = content.getBytes();
        try {
            Files.write(path, strToBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 基于基本IO，以及字节数组缓冲区，复制文件
     * 打印显示循环读写循环次数
     *
     * @param sourceFile
     * @param targetFile
     */
    private static void copyByIO(String sourceFile, String targetFile){
        createFile(targetFile);
        int t = 0;
        try(FileInputStream in = new FileInputStream(sourceFile);
            FileOutputStream out = new FileOutputStream(targetFile)) {
            byte[] buffer = new byte[8];
            int len = 0;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
                t++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(t);
    }


    /**
     * 基于NIO，实现文件的复制
     *
     * @param sourceFile
     * @param targetFile
     */
    private static void copyByNIO(String sourceFile, String targetFile)  {
        Path source = Path.of(sourceFile);
        Path target = Path.of(targetFile);
        createFile(targetFile);//创建文件目录及文件
        deleteFile(targetFile);//Files.copy目标文件存在抛出异常
        try {
            Files.copy(source,target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 删除文件
     *
     * @param fileName
     */
    private static void deleteFile(String fileName) {
        Path targetPath = Paths.get(fileName);
        try {
            Files.delete(targetPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 遍历打印指定目录下全部目录/文件名称
     *
     * @param dir
     */
    private static void walkDirectories(String dir) {
        Path path = Path.of(dir);
        try {
            Files.walk(path).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
