package ExtraCredit;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        final String INPUT_FILE_NAME = "DonQuixote.txt";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Remove all punctuation and convert to lower case
                String[] words = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Find the most common word
        String mostCommonWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most common word: " + mostCommonWord + " (Count: " + maxCount + ")");

        // Count the uses of specific words if needed
        // Example: count the word "quixote"
        int quixoteCount = wordCountMap.getOrDefault("quixote", 0);
        System.out.println("Count of the word 'quixote': " + quixoteCount);
    }
}
