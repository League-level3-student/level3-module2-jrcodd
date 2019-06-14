package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

import _01_Searching_Algorithms._00_LinearSearch;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return _00_LinearSearch.linearSearch((String[])eggs.toArray(), "cracked");
		
	}
 
	
public	static int countPearls(List<Boolean> oysters) {
int count = 0;
	for (int i = 0; i < oysters.size(); i++) {
		if(oysters.get(i) == true) {
			count+=1;
		}
	}
		// TODO Auto-generated method stub
	return count;
		
	}


public static double findTallest(List<Double> peeps) {
	// TODO Auto-generated method stub
	double tallest = 0;
	for (int i = 0; i < peeps.size()-1; i++) {
		if(peeps.get(i)>tallest) {
			tallest = peeps.get(i);
		}
	}
	return tallest;
}
	}

