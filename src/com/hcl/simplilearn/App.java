package com.hcl.simplilearn;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestSubSequence();

	}
	public static void longestSubSequence() {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

        Integer[] result = longestIncreasingSubsequence.getLongestIncreasingSubsequence();

        System.out.println("Winning sequence is");
        for (Integer i : result) {
            System.out.println("number: " + i);
        }
        System.out.println("End of sequence");
    }
}
