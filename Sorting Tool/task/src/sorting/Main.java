package sorting;

import java.security.InvalidParameterException;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        if (args.length != 0 && args.length != 2) {
            throw new InvalidParameterException("Params error");
        }
        if (args.length == 2) {
            switch (args[1]) {
                case "long":
                    ArrayList<Long> arrayOfLongs = new ArrayList<>();
                    acquireLong(arrayOfLongs);
                    break;
                case "line":
                    ArrayList<String> arrayOfLines = new ArrayList<>();
                    acquireLine(arrayOfLines);
                    break;
                case "word":
                default:
                    ArrayList<String> arrayOfWords = new ArrayList<>();
                    acquireWord(arrayOfWords);
            }
        }


        int totalNumber = arrayOfLong.size();
        System.out.printf("Total numbers: %d.", totalNumber);
        Collections.sort(arrayOfLong);
        long maxNumber = arrayOfLong.get(totalNumber - 1);
        int totalOccurrences = countOccurrences(arrayOfLong, maxNumber);
        System.out.printf("\nThe greatest number: %d (%d time(s)).", maxNumber, totalOccurrences);
    }

    private static void acquireLong(ArrayList<Long> arrayOfLongs) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            arrayOfLongs.add(number);
        }
    }

    private static void acquireLine(ArrayList<String> arrayOfLines) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            arrayOfLines.add(number);
        }
    }

    private static void acquireWord(ArrayList<String> arrayOfWords) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            arrayOfWords.add(number);
        }
    }

    private static int countOccurrences(ArrayList<Long> arrayOfLong, long maxNumber) {
        int counter = 0;
        for (long i : arrayOfLong) {
            if (maxNumber == i) {
                counter++;
            }
        }
        return counter;
    }
}
