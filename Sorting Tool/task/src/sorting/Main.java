package sorting;

import java.security.InvalidParameterException;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Long> longArrayList = new ArrayList<>();

        if (args.length == 0) {
            acquireWords(stringArrayList);
            sortWords(stringArrayList);
            printSummaryWords(stringArrayList);
        } else if (args.length == 2) {
            switch (args[1]) {
                case "long":
                    acquireLongs(longArrayList);
                    sortLongs(longArrayList);
                    printSummaryLongs(longArrayList);
                    break;
                case "line":
                    acquireLine(stringArrayList);
                    sortLines(stringArrayList);
                    printSummaryLines(stringArrayList);
                    break;
            }
        } else {
            throw new InvalidParameterException("Invalid Parameter Exception");
        }


//        Collections.sort(arrayOfLong);
//        long maxNumber = arrayOfLong.get(totalNumber - 1);
//        int totalOccurrences = countOccurrences(arrayOfLong, maxNumber);
//        System.out.printf("\nThe greatest number: %d (%d time(s)).", maxNumber, totalOccurrences);
    }

    private static void printSummaryWords(ArrayList<String> stringArrayList) {
    }

    private static void printSummaryLines(ArrayList<String> stringArrayList) {
    }

    private static void printSummaryLongs(ArrayList<Long> longArrayList) {
    }

    private static void sortLongs(ArrayList<Long> longArrayList) {

    }

    private static void sortLines(ArrayList<String> stringArrayList) {

    }

    private static void sortWords(ArrayList<String> stringArrayList) {

    }

    private static void acquireLongs(ArrayList<Long> arrayOfLongs) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            arrayOfLongs.add(number);
        }
    }

    private static void acquireLine(ArrayList<String> arrayOfLines) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String aLine = scanner.nextLine();
            arrayOfLines.add(aLine);
        }
    }

    private static void acquireWords(ArrayList<String> arrayOfWords) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String aLine = scanner.nextLine();
            String[] words = aLine.split("\\s+");
            for (String word : words) {
                arrayOfWords.add(word);
            }
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
