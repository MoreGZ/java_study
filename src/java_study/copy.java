package java_study;

import java.io.*;

public class copy {
    public static void main(String[] args) throws IOException {
        if(args.length != 2){
            System.out.println("Usage: java Copy sourceFile targetFile");
            System.exit(0);
        }

        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.out.println("sourceFile " + args[0] + " not exit!");
            System.exit(0);
        }

        File targetFile = new File(args[1]);
        if(targetFile.exists()){
            System.out.println("targetFile " + args[1] + " has already exited");
            System.exit(0);
        }

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(targetFile));

        int r;
        int numberOfBytesCopied = 0;

        while ((r = inputStream.read()) != -1){
            outputStream.write((byte)r);
            numberOfBytesCopied++;
        }

        inputStream.close();
        outputStream.close();

        System.out.println(numberOfBytesCopied + " bytes copied");
    }
}
