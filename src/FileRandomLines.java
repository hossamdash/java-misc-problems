import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class FileRandomLines {
    public static void main(String[] args) throws Exception {
        List<String> lines;
        int lineNumbers;
        if (args.length > 2) {
            System.out.println("Please enter two paramater only");
            System.exit(1);
        } else if (args.length == 2) {
            Path filePath = Paths.get(args[0]);
            lineNumbers = Integer.parseInt(args[1]);
            if (Files.exists(filePath) && lineNumbers >= 1) {
                lines = Files.lines(filePath).collect(Collectors.toList());
                printLines(lines, lineNumbers);
            } else {
                System.out.println("please enter valid parameters");
                System.exit(2);
            }
        } else if (args.length == 0) {
            // TODO : not required in specification
        }
    }

    public static void printLines(List<String> lines, int lineNumbers) {
        
        Random r = new Random();
        int numOfLines = lines.size();

        for (int i = 0; i < lineNumbers; i++) {
            int lineIndex = r.nextInt(numOfLines);
            if (lineIndex <= numOfLines) {
                String line = lines.get(lineIndex);
                System.out.println("[" + (i + 1) + "] Line " + lineIndex + ":\t" + line);
            }
        }
    }
}
