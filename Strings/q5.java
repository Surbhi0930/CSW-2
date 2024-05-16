import java.util.Scanner;

public class PerformanceTest {
	private static StringBuilder BuilderConcatenation(String baseString, int numConcatenations) {
        StringBuilder sb = new StringBuilder(baseString.length() * numConcatenations);
        for (int i = 0; i < numConcatenations; i++) {
            sb.append(baseString);
        }
        return sb;
    }

    private static StringBuffer BufferConcatenation(String baseString, int numConcatenations) {
        StringBuffer stringBuffer = new StringBuffer(baseString.length() * numConcatenations);
        for (int i = 0; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        return stringBuffer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base string: ");
        System.out.print(">"+" ");
        String baseString = scanner.nextLine();
        System.out.println("Enter the number of concatenations: ");
        System.out.print(">"+" ");
        int numConcatenations = scanner.nextInt();
        scanner.close();

        long startTime, endTime, duration1,duration2;

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilderResult = BuilderConcatenation(baseString, numConcatenations);
        endTime = System.currentTimeMillis();
        duration1 = endTime - startTime;
        System.out.println("\nUsing StringBuilder...");
        System.out.println("Time taken: " + duration1 + " milliseconds");
        System.out.println("Final string length: " + stringBuilderResult.length());

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBufferResult = BufferConcatenation(baseString, numConcatenations);
        endTime = System.currentTimeMillis();
        duration2 = endTime - startTime;
        System.out.println("\nUsing StringBuffer...");
        System.out.println("Time taken: " + duration2 + " milliseconds");
        System.out.println("Final string length: " + stringBufferResult.length());
        if(duration1>duration2)
        {
        	System.out.println("Comparison: StringBuffer was slower than StringBuilder by " +(duration2-duration1)+ " millisecond.");
        }
        else if(duration1<duration2)
        {
        	System.out.println("Comparison: StringBuilder was faster than StringBuffer by " +(duration2-duration1)+ " millisecond.");
        }
        else
        	System.err.println("Both are same time!!!!");
    }

    
}
