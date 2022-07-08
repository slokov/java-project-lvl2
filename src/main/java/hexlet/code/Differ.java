package hexlet.code;

import picocli.CommandLine;

@CommandLine.Command(name = "gendiff", mixinStandardHelpOptions = true, version = "differ 0.1",
        description = "Compares two configuration files and shows a difference.\n")

public class Differ {
    static String generate() {
        return "";
    }
}
