package net.codejava.io;
import java.io.File;
import javax.swing.filechooser.FileSystemView;
import java.lang.*;
public class SystemInfo{
    private static final String nameOfOs = System.getProperty("os.name");
    private static final String versionOfOS = System.getProperty("sun.arch.data.model");
    public static void main(String args[]) throws Exception {
        System.out.println("User name : " +System.getProperty("user.name") );
        String userHomeDir = System.getProperty("user.home");
        System.out.printf("The User Home Directory is %s", userHomeDir);
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println();
        System.out.println("Total no of cores: " + cores);
       Runtime ran = Runtime.getRuntime();
        System.out.println("Total memory is: " + ran.totalMemory());
        System.out.println("Name of the operating system is " + nameOfOs);
        System.out.println("Version of the operating system is " + versionOfOS);
        Runtime runtime = Runtime.getRuntime();
        int numberOfProcessors = runtime.availableProcessors();
        System.out.println("Number of processors available to this JVM: " + numberOfProcessors);
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File[] drives = File.listRoots();
        if (drives != null && drives.length > 0) {
            for (File aDrive : drives) {
                System.out.println("Drive Letter: " + aDrive);
                System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive));
                System.out.println("\tTotal space: " + aDrive.getTotalSpace());
                System.out.println("\tFree space: " + aDrive.getFreeSpace());
                System.out.println();
            }
        }
    }
}
//this is comment
