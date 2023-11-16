package apcs;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class AdvancedPlacementComputerScience {

    public boolean scoresIncreasing(int[] scores) {
        boolean arescoresIncreasing = true;
        for(int i = 0; i < scores.length-1; i++) {
            if(scores[i] > scores[i + 1]) {
                arescoresIncreasing = false;
                break;
            }
        }
        return arescoresIncreasing;
    }

    public boolean scores100(int[] scores) {
        boolean scoresHasAdjacent100s = false;
        for(int i = 0; i < scores.length-1; i++) {
            if(scores[i] == 100 && scores[i + 1] == 100) {
                scoresHasAdjacent100s = true;
                break;
            }
        }
        return scoresHasAdjacent100s;
    }

    public boolean scoresClump(int[] scores) {
        boolean gotClump = false;
        for(int i = 0; i <= scores.length-3; i++) {
            if( (scores[i + 2] - scores[i + 1] <= 2) && (scores[i + 2] - scores[i] <= 2)  ) {
                gotClump = true;
                break;
            }
        }
        return gotClump;
    }

    public int scoresAverage(int[] scores) {
        ToIntFunction<int[]> findOutAnAverageInGivenArray = (arr) -> {
            int average = 0;
            for(int n : arr) {
                average += n;
            }
            return average / arr.length;
        };
        int[] leftPartOfScores = Arrays.copyOfRange(scores, 0, scores.length / 2);
        int[] rightPartOfScores = Arrays.copyOfRange(scores, scores.length / 2, scores.length);
        return Math.max(findOutAnAverageInGivenArray.applyAsInt(leftPartOfScores), findOutAnAverageInGivenArray.applyAsInt(rightPartOfScores));
    }

    public int wordsCount(String[] words, int len) {
        int countOfLenLongWords = 0;
        for(String s : words) {
            if(s.length() == len) {
                countOfLenLongWords++;
            }
        }
        return countOfLenLongWords;
    }

    public String[] wordsFront(String[] words, int n) {
        return Arrays.copyOfRange(words, 0, n);
    }

    public List wordsWithoutList(String[] words, int len) {
        return Arrays.stream(words).filter(word -> word.length() != len).collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean hasOne(int n) {
        return String.valueOf(n).contains("1");
    }

    public boolean dividesSelf(int n) {
        boolean divideable = true;
        for(String str : String.valueOf(n).split("")) {
            if(Integer.valueOf(str) == 0 || n % Integer.valueOf(str) != 0) {
                divideable = false;
                break;
            }
        }
        return divideable;
    }

    public int[] copyEvens(int[] nums, int count) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.stream(nums).forEach( n -> { if(n % 2 == 0) {result.add(n);}});
        return result.stream().limit(count).mapToInt(Integer::intValue).toArray();
    }

    public int[] copyEndy(int[] nums, int count) {
        IntPredicate isEndy = (n) -> (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
        ArrayList<Integer> result = Arrays.stream(nums).filter(isEndy).collect(Collectors.toCollection(ArrayList::new));

        return nums;
    }



    public static void main(String[] args) {

        int[] scores = {3, 4, 5, 1, 2, 3};
        AdvancedPlacementComputerScience apcs = new AdvancedPlacementComputerScience();
        System.out.println(apcs.copyEvens(scores, 2));
        
    }
}