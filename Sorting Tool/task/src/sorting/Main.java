package sorting;

import java.security.InvalidParameterException;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Long> longArrayList = new ArrayList<>();

        if (args.length == 0) {
            acquireWords(stringArrayList);
            processWords(stringArrayList);
        } else if (args.length == 2) {
            switch (args[1]) {
                case "long":
                    acquireLongs(longArrayList);
                    processLongs(longArrayList);
                    break;
                case "line":
                    acquireLines(stringArrayList);
                    processLines(stringArrayList);
                    break;
                case "word":
                    acquireWords(stringArrayList);
                    processWords(stringArrayList);
                    break;
            }
        } else {
            throw new InvalidParameterException("Invalid Parameter Exception");
        }
    }

    private static void acquireLongs(ArrayList<Long> arrayOfLongs) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            arrayOfLongs.add(number);
        }
    }

    private static void processLongs(ArrayList<Long> longArrayList) {
        Collections.sort(longArrayList);

        int totalNumber = longArrayList.size();

        long maxNumber = longArrayList.get(longArrayList.size() - 1);

        int totalOccurrences = countOccurrences(longArrayList, maxNumber);

        System.out.printf("\nTotal numbers: %d.", totalNumber);
        System.out.printf("\nThe greatest number: %d (%d time(s), %d%%).", maxNumber, totalOccurrences, 100 / totalOccurrences);
    }

    private static void acquireLines(ArrayList<String> arrayOfLines) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String aLine = scanner.nextLine();
            arrayOfLines.add(aLine);
        }
    }

    private static void processLines(ArrayList<String> stringArrayList) {
        stringArrayList.sort(Comparator.comparing(String::length));

        int totalNumber = stringArrayList.size();
        String maxString = stringArrayList.get(stringArrayList.size() - 1);

        System.out.printf("\nTotal numbers: %d.", totalNumber);
        System.out.printf("\nThe longest line:\n%s\n(%d time(s), %d%%).", maxString, totalNumber, 100 / totalNumber);
    }

    private static void acquireWords(ArrayList<String> arrayOfWords) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String aLine = scanner.nextLine();
            String[] words = aLine.split("\\s+");
            Collections.addAll(arrayOfWords, words);
        }
    }

    private static void processWords(ArrayList<String> stringArrayList) {
        stringArrayList.sort(Comparator.comparing(String::length));

        int totalNumber = stringArrayList.size();
        String maxString = stringArrayList.get(stringArrayList.size() - 1);

        System.out.printf("\nTotal words: %d.", totalNumber);
        System.out.printf("\nThe longest word:\n%s\n(%d time(s), %d%%).", maxString, totalNumber, 100 / totalNumber);
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