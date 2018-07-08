package daruen.kcomplementary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main 
{
    public static void main( String[] args )
    {
    	Integer k = null;
    	List<Integer> A=new ArrayList<Integer>();
    	
    	for(int i=0;i<args.length-1;i++){
    		if(args[i].equals("-k")){
    			i++;
    			k=new Integer(args[i]);
    		}
    		
    		if(args[i].equals("-A")){
    			i++;
    			for(String number:args[i].split(",")){
    				A.add(new Integer(number));
    			}
    		}
    		
    	}
    	
    	if(k==null||A.size()==0){
    		System.out.println("The usage is: command -k 'anInteger' -A 'aCommaSeparatedListOfNumbers'");
    		return;
    	}
    	Integer[] aux=new Integer[A.size()];
    	System.out.println("Checking if exists k complementaries.\n");
    	try{
        Set<Pair> pairs = KComplementary.kComplementaryPairs(k, A.toArray(aux));
        if(pairs.size()>0){
        	System.out.println("Found:");
        	for(Pair p:pairs){
        		System.out.println(p);
        		
        	}
        }
        else
        	System.out.println("No pairs found");
        
    	}catch(RuntimeException re){
    		System.out.println(re.getMessage());
    	}
       
    	
    }
}
