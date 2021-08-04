package automation.pageobject;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Stream;


import automation.utils.Get;

import java.nio.file.Files;


public class ReadSpecFile {
	
	private static String page_name;
	public ReadSpecFile(String page_name) {
		ReadSpecFile.page_name = page_name;
	}

	public static String[] toGetLocator(String elementName) {
	try (Stream<String> lines = Files.lines(Paths.get(Get.SPEC_FILE_PATH + page_name + ".spec"))) {
		for(String line : lines.toArray(String[]::new)) {
			if(line.split("          ")[0].equalsIgnoreCase(elementName)) {
				return line.split("          ");
			}
		}
        return null; 
     } catch (IOException ex) {
    	 new Exception("Please enter the locator name, type and value in the spec file.");
    	 return null;
     }
	}
}
