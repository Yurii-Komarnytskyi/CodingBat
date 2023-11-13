package functional2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class FunctionalTwo {

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toCollection(ArrayList::new));
    }


    public static void main(String[] args) {

        int[] dummyArray = {6, 8, 6, 8, -1};
		List<Integer> copyOfdummyArray = Arrays.stream(dummyArray).boxed().collect(Collectors.toCollection(ArrayList::new));
		FunctionalTwo ft = new FunctionalTwo();
		System.out.println(ft.noNeg(copyOfdummyArray));
    }
}