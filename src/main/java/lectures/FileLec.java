package lectures;

import playtime.Fighter;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileLec {
    public static void main(String[] args) {

        // explain relative vs. absolute paths
            // use the terminal below to show this using cat or ls

        // Path objects
            // use Paths.get to get a path ref to dir and a file
                // relative
                // then absolute

        Path aDir = Paths.get("adir");
        Path aFile = Paths.get("adir", "afile.txt");

        System.out.println(Files.exists(aDir));
        if(!Files.exists(aDir)) {
            try {
                Files.createDirectory(aDir);
                System.out.println("dir created");
            } catch (IOException e) {
                System.out.println("createDirectory exception: " + e.getMessage());
            }
        } else {
            System.out.println("the directory exists already");
        }

        // an alternative to using an if/else to first check if file exists
        // try to create it and ignore an already exists exception
        try {
            Files.createFile(aFile);
            System.out.println("the file has been created");
        } catch(FileAlreadyExistsException e) {
            System.out.println("the file exists!");
        } catch (IOException e) {
            System.out.println("createFile exception: " + e.getMessage());
            e.printStackTrace();
        }

            // do we have to specify all the dirs as separate args???

        // Files class
            // .exists() to see dirs and files that exist and don't exist
            // point at notExists()

        // now try .createDirectory() and .createFile()
            // feel the IOException

        // write to a file using Files.write
            // default for StandardOpenOption is create/overwrite
                // look at other options
//        List<String> fruits = Arrays.asList("apple", "pear", "banana");

        Fighter bob = new Fighter("bob");
//        System.out.println(bob.toFileString());
        Fighter sue = new Fighter("sue");
        sue.setStrength(1000);
        sue.setHealth(5000);
        List<String> fighterStrings = Arrays.asList(bob.toFileString(), sue.toFileString());

        try {
            // , StandardOpenOption.APPEND
            Files.write(aFile, fighterStrings);
        } catch (IOException e) {
            System.out.println("file write exception: " + e.getMessage());
        }

        // what are we trying to write to a file?
                // how should we write an object to a text file???

        // read from a file
            // Files.readAllLines
                // Strings are easy... but how do we get other OBJECTS from a file???
        try {
            List<String> fileStrings = Files.readAllLines(aFile);
            Fighter cloneOfBob = Fighter.fromFileString(fileStrings.get(0));
            System.out.println("cloneOfBob = " + cloneOfBob);

//            System.out.println(fileStrings.size());
//            System.out.println(fileStrings);
        } catch (IOException e) {
            System.out.println("file read exception: " + e.getMessage());
        }


    }
}
