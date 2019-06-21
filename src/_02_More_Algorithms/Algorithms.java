package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

import _01_Searching_Algorithms._00_LinearSearch;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return _00_LinearSearch.linearSearch((String[]) eggs.toArray(), "cracked");

	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				count += 1;
			}
		}
		// TODO Auto-generated method stub
		return count;

	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		int greatest = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > greatest) {
				greatest = words.get(i).length();
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static Object containsSOS(List<String> message) {
		boolean containsSOS = false;
		for (int i = 0; i < message.size(); i++) {

			if (message.get(i).contains("... --- ...")) {
				containsSOS = true;
			}
		}
		return containsSOS;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		double x = 0.0;
		for (int j = 0; j < results.size(); j++) {

			for (int i = j + 1; i < results.size(); i++) {
				if (results.get(j) > results.get(i)) {
					x = results.get(j);
					results.set(j, results.get(i));
					results.set(i, x);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		String x;
		for (int j = 0; j < unsortedSequences.size(); j++) {

			for (int i = j + 1; i < unsortedSequences.size(); i++) {
				if (unsortedSequences.get(j).length() > unsortedSequences.get(i).length()) {
					x = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(i));
					unsortedSequences.set(i, x);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		String x;
		for (int j = 0; j < words.size(); j++) {

			for (int i = j + 1; i < words.size(); i++) {
				if (words.get(j).charAt(0) > words.get(i).charAt(0)) {
					x = words.get(j);
					words.set(j, words.get(i));
					words.set(i, x);
				}
				else if(words.get(j).charAt(0) == words.get(i).charAt(0)) {
					if (words.get(j).charAt(1) > words.get(i).charAt(1)) {
						x = words.get(j);
						words.set(j, words.get(i));
						words.set(i, x);
					}
					else if(words.get(j).charAt(1) == words.get(i).charAt(1)) {
						if (words.get(j).charAt(2) > words.get(i).charAt(2)) {
							x = words.get(j);
							words.set(j, words.get(i));
							words.set(i, x);
						}
					}
				}
				
			}
		}
		return words;
	}
}
