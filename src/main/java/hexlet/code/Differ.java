package hexlet.code;

import picocli.CommandLine;
import java.io.File;

@CommandLine.Command(name = "gendiff", mixinStandardHelpOptions = true, version = "differ 0.1",
        description = "Compares two configuration files and shows a difference.\n")

public class Differ {
    @CommandLine.Option(names = { "-f", "--format" }, paramLabel = "format", description = "output format [default: stylish]")
    File archive;

    @CommandLine.Parameters(paramLabel = "filepath1", description = "path to first file")
    File filepath1;

    @CommandLine.Parameters(paramLabel = "filepath2", description = "path to second file")
    File filepath2;

    static String generate(File filepath1, File filepath2) {
        return "";
    }
}
