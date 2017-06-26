/*
 * Files1.java
 * 
 *  2017 mikeh <mikeh@mikeh-desktop>
 * 
 * 
 */
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
//import java.util.Files.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Files1 {
	
	public static void main (String[] args) {
		
		try (Stream<Path> stream = Files.list(Paths.get(""))) {
		String joined = stream
        .map(String::valueOf)
        .filter(path -> !path.startsWith("."))
        .filter(path -> !path.endsWith(".txt"))
        .filter(path -> !path.endsWith(".BAT"))
        .sorted()
        .collect(Collectors.joining("; "));
		System.out.println("List: " + joined);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

