package sorting;

import java.security.InvalidParameterException;
import java.util.*;

public class Main {
    static DataType dataType;

    public static void main(final String[] args) {
        if (args.length != 0 && args.length != 2) {
            throw new InvalidParameterException("Params error");
        }
        if (args.length == 0) {
            dataType = DataType.WORD;
        } else {
            switch (args[1]) {
                case "long":
                    dataType = DataType.LONG;
                    break;
                case "line":
                    dataType= DataType.LINE;
                    break;
                case "word":
                    dataType = DataType.WORD;
                default:
                    throw new InvalidParameterException("Params error");
            }
        }
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> arrayOfLong = new ArrayList<>();

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            arrayOfLong.add(number);
        }
        int totalNumber = arrayOfLong.size();
        System.out.printf("Total numbers: %d.", totalNumber);
        Collections.sort(arrayOfLong);
        long maxNumber = arrayOfLong.get(totalNumber - 1);
        int totalOccurrences = countOccurrences(arrayOfLong, maxNumber);
        System.out.printf("\nThe greatest number: %d (%d time(s)).", maxNumber, totalOccurrences);
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
