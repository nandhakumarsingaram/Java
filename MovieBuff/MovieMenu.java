package Org.Creators.MovieBuff;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieMenu {
	public void menu(){
		String name;
		float code;
		HashMap<String, MovieBuff> hm = new HashMap<String, MovieBuff>();
		Scanner Sc = new Scanner(System.in);
		while(true){
		System.out.println("welcome to the Reviewers worlD\n1.Enter Review\n2.View\n3.Exit\nEnter your Choice......");
		int ch;
		ch = Sc.nextInt();
		switch(ch){
		case 1:	System.out.println("Enter Movie Nmae:");
		name=Sc.next();
		System.out.println("Enter the rewiev");
        code = Sc.nextFloat();
	          if(hm.containsKey(name))
	          {
	        	 
	        	  MovieBuff m = hm.get(name);
					m.setReviewer(m.getReviewer() + 1);
					m.setReview(m.getReview() + code);
				}
	          else {
						hm.put(name, new MovieBuff(code, 1));
	          
	        }
	          	System.out.println("Thankyou for your reviews......\n");
				break;
		case 2: System.out.println("Rewievers WorlD\nMovie\tReviews\tReviewers");	
			for(Map.Entry<String,MovieBuff> each:hm.entrySet()) {
			System.out.println(each.getKey()+"\t"+each.getValue().getReview()+"\t"+each.getValue().getReviewer());
			
		}
				break;
		default: break;
		}
		if(ch==3){
			System.out.println("You pressed the Exit key....\nBye....Bye....\nThankyou......");
			break;
		}
			
	 }
	}
}
