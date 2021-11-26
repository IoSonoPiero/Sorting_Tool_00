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


//        int totalNumber = arrayOfLong.size();
//        System.out.printf("Total numbers: %d.", totalNumber);
//        Collections.sort(arrayOfLong);
//        long maxNumber = arrayOfLong.get(totalNumber - 1);
//        int totalOccurrences = countOccurrences(arrayOfLong, maxNumber);
//        System.out.printf("\nThe greatest number: %d (%d time(s)).", maxNumber, totalOccurrences);
    }

    private static void acquireLong(ArrayList<Long> arrayOfLongs) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            arrayOfLongs.add(number);
        }

        for(long aLong: arrayOfLongs) {
            System.out.println(aLong);
        }
    }

    private static void acquireLine(ArrayList<String> arrayOfLines) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String aLine = scanner.nextLine();
            arrayOfLines.add(aLine);
        }
        for(String aLine: arrayOfLines) {
            System.out.println(aLine);
        }
    }

    private static void acquireWord(ArrayList<String> arrayOfWords) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String aLine = scanner.nextLine();
            String[] words = aLine.split("\\s+");
            for (String word :words) {
                arrayOfWords.add(word);
            }
            for(String aWord: arrayOfWords) {
                System.out.println(aWord);
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
