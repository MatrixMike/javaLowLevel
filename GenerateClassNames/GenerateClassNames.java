/**
 * GenerateClassNames.java
 *
 * This class generates a sorted list of all java class names.
 * This list is created by searching directories recursefly
 * for any .class or any .java file.
 *
 * Then the sorted list is stored in a textfile called results.txt
 *
 *
 * How to use this program:
 *
 * java GenerateClassNames <path>
 *
 * where <path> can be:
 *
 *  empty. Now the program will begin in the current directory
 *  apath. The program will start in the directory denoted by apath
 *  apath* The program will begin with the first path and after finishing
 *         that one it wil begin starting the second path. See examples below.
 *
 * Examples:
 *
 * java GenerateClassNames
 * java GenerateClassNames c:\foo
 * java GenerateClassNames c:\foo c:\foobar d:\foo
 */

import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;

public class GenerateClassNames {
    ArrayList classNames;

    public GenerateClassNames() {
        classNames = new ArrayList();
    }

    public static void main(String[] args) {
        int i = 0;
        GenerateClassNames gcn = new GenerateClassNames();

        if(args.length == 0) {
            System.out.println("");
            File f = new File("");
            gcn.start(new File(f.getAbsolutePath()));
        }

        while(i < args.length) {
            System.out.println("");
            gcn.start(new File(args[i++]));
        }

        gcn.printResults();
    }

    private void start(File aFile) {
        System.out.println("Entering: " + aFile.toString());

        try {
            File[] list = aFile.listFiles(new JavaFileFilter());
            processFiles(list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    private void processFiles(File[] list) {
        File file;

        for(int i = 0; i < list.length; i++) {
            file = list[i];

            if(file.isDirectory()) {
                start(file);
            } else {
                String name = list[i].getName();
                if(!classNames.contains(name)) {
                    // Skip inner classes...
                    if(name.indexOf("$") == -1)

                        // Check if Class is already is the list
                        if(!classNames.contains(name.substring(0,
                            name.lastIndexOf(".")))) {
                            classNames.add(name.substring(0,
                                name.lastIndexOf(".")));
                        }
                }
            }
        }
    }

    private void printResults() {
        FileOutputStream ostream;
        PrintWriter pw;

        // Sort
        Object[] sortedList = classNames.toArray();
        Arrays.sort(sortedList);

        try {
            ostream = new FileOutputStream("results.txt");
            pw = new PrintWriter(ostream);

            for(int i = 0; i < sortedList.length; i++) {
                pw.println((String) sortedList[i]);
            }
            pw.close();
            ostream.close();

            System.out.println("\nA list containing all the java class names");
            System.out.println("can be found in file results.txt");
        } catch (Exception e) {
        }
    }

    class JavaFileFilter implements FileFilter {
        public JavaFileFilter() {
        }

        public boolean accept(File pathName) {
            int length = pathName.toString().length();

            // Check if directory
            if(pathName.isDirectory()) return true;

            // Check file extension
            if(length > 5) {
                if(pathName.toString().substring(length - 5, length).compareTo(".java") == 0) return true;
            }

            // Check file extension
            if(length > 6) {
                if(pathName.toString().substring(length - 6, length).compareTo(".class") == 0) return true;
            }

            return false;
        }
    }
}