import java.io.*;
import java.util.Date;

public class FileOperations {

    // Method to display file properties
    public static void showFileDetails(File file) {
        if (file.exists()) {
            System.out.println("\n--- File Details ---");
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        } else {
            System.out.println("File does not exist.");
        }
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Copy:   java FileOperations copy source.txt dest.txt");
            System.out.println("Delete: java FileOperations delete file.txt");
            System.out.println("Rename: java FileOperations rename old.txt new.txt");
            return;
        }

        String command = args[0];

        try {
            switch (command.toLowerCase()) {

                case "copy":
                    if (args.length != 3) {
                        System.out.println("Invalid arguments for copy.");
                        return;
                    }

                    File source = new File(args[1]);
                    File dest = new File(args[2]);

                    if (!source.exists()) {
                        throw new FileNotFoundException("Source file not found.");
                    }

                    FileInputStream fis = new FileInputStream(source);
                    FileOutputStream fos = new FileOutputStream(dest);

                    int ch;
                    while ((ch = fis.read()) != -1) {
                        fos.write(ch);
                    }

                    fis.close();
                    fos.close();

                    System.out.println("File copied successfully.");
                    showFileDetails(dest);
                    break;

                case "delete":
                    File fileToDelete = new File(args[1]);

                    if (!fileToDelete.exists()) {
                        throw new FileNotFoundException("File not found.");
                    }

                    if (fileToDelete.delete()) {
                        System.out.println("File deleted successfully.");
                    } else {
                        System.out.println("Failed to delete file.");
                    }

                    showFileDetails(fileToDelete);
                    break;

                case "rename":
                    if (args.length != 3) {
                        System.out.println("Invalid arguments for rename.");
                        return;
                    }

                    File oldFile = new File(args[1]);
                    File newFile = new File(args[2]);

                    if (!oldFile.exists()) {
                        throw new FileNotFoundException("File not found.");
                    }

                    if (oldFile.renameTo(newFile)) {
                        System.out.println("File renamed successfully.");
                    } else {
                        System.out.println("Rename failed.");
                    }

                    showFileDetails(newFile);
                    break;

                default:
                    System.out.println("Invalid command.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
