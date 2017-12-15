package com.infomover.training.java8.scratchpad;

import static java.lang.Math.sqrt;
import static java.util.concurrent.TimeUnit.SECONDS;
import static java.util.stream.LongStream.range;
import static java.util.stream.LongStream.rangeClosed;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeoutException;



public class PrimesPrint {
	
	
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
    	
        ForkJoinPool forkJoinPool = new ForkJoinPool(2);
        
//		List<Long> l = new ArrayList<>();
//		System.out.println(l.hashCode());
//
//		l.add(2L);
//
//		System.out.println(l.hashCode());
//		List<Long> l2 = new ArrayList<>();
//
//		l2.add(3L);
        
        
        //System.out.println(l2.hashCode());
        
//        List<Long> finalList  =    
//        		forkJoinPool.submit(() ->
//        		
//        				range(1, 10)
//        				  .parallel()
//        				  .filter(PrimesPrint::isPrime)
//        				  .collect(MyList::new, PrimesPrint::addToList, PrimesPrint::combine)
//        				
//        			).get(60, SECONDS);

        
        List<Long> finalList  =    
        		
        				range(1, 10)
        				  .parallel()
        				  .filter(PrimesPrint::isPrime)
        				  .collect(MyList::new, PrimesPrint::addToList, PrimesPrint::combine);
        
        System.out.println(finalList);


        forkJoinPool.awaitTermination(5, SECONDS);
    }

    private static void addToList(List<Long> list, Long n) {
    	
        System.out.println("					Adding " + n + " to " + list + " > " + list.hashCode()  + " In thread : " + Thread.currentThread().getName());
        
        list.add(n);
    }

    private static void combine(List<Long> list1, List<Long> list2) {
    	
        System.out.println("Combining " +  list1 + " -- " + list2 + " hashcode : " +   list1.hashCode() + " and " + list2.hashCode() +  " In thread : " + Thread.currentThread().getName());
        list1.addAll(list2);
        
    }


    
    public static boolean isPrime(long n) {
    	
      //  System.out.println("Checking " + n);
        
        boolean isPrime = n > 1 && rangeClosed(2, (long) sqrt(n)).noneMatch(divisor -> n % divisor == 0);
        
        if (isPrime) {
        		//System.out.println("Prime found " + n);
        }
        return isPrime;
    }
}

class MyList extends ArrayList {
	
	
	public MyList() {
		super();
	
		System.out.println( this.hashCode() + " *************************************** MyList Created *** By Thread :" + Thread.currentThread().getName());
		
		
	}
	
}


