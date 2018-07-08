package daruen.kcomplementary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KComplementary {

	public static Set<Pair> kComplementaryPairs(Integer k, Integer[] A) {
		if(A.length<2){
			throw new RuntimeException("The numbers array should be at minimum of two numbers");
		}
		
		Set<Integer> nonDuplicatedNumbers= new HashSet<Integer>(Arrays.asList(A));
		Set<Pair> pairs=new HashSet<Pair>();
		
		for(Integer i:nonDuplicatedNumbers){
			if(nonDuplicatedNumbers.contains(k-i)){
				Pair pair2add=new Pair(i,k-i);
				pairs.add(pair2add);
			}
			
		}
		
		return pairs;

	}
}
