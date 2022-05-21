package string.problems;

import org.junit.Assert;
import org.junit.Test;


import java.util.*;

public class UnitTestingStringProblem {

    //Apply Unit Test into all the methods in this package.
    @Test
    public void testanagram() {
        boolean actualResult = Anagram.isAnagram("cat", "tac");
        Assert.assertNotEquals( false, actualResult);
        System.out.println("test passed");
    }

    @Test
    public void testLargestWord() {
        String str = "Human brain is a biological learning machine";
        Map<Integer, String> map = new HashMap<>();
        map = DetermineLargestWord.findTheLargestWord(str);
        String expectedResult = "biological";
        String actualResult = "";
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            actualResult = entry.getValue();
        }
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }


    // Test Duplicate Words
    // Test Palindrome
    @Test
    public void testPermutation() {
        Set<String> expectedResult = new HashSet<>(Arrays.asList("bob", "obb", "bbo"));
        Set<String> actualResult = Permutation.getPermutation("bob");
        Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }

    // Test Permutation
    @Test
    public void testPalindrome() {
        boolean actualResult = Palindrome.checkPalindrome("MADAM");
        Assert.assertNotEquals("Test Fail", false, actualResult);
    }
}
