package utils;

import java.io.File;
import java.nio.file.Paths;

public class CustomFile {

    public String getDriverFilePath(String driverFileName) {
        return getResourceFilePath(driverFileName);
    }

    private String getResourceFilePath(String fileName) {
        return
         Paths.get(
                    new File(getClass()
                            .getClassLoader()
                            .getResource(fileName)
                            .getFile())
                            .getAbsolutePath()).toString();

    }

    public static String getProjectPath() {
        return System.getProperty("user.dir");
    }

}
