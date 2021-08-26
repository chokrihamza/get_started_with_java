package firstproject;

public class java_tricks {
  public static void main(String[] args) {
     System.out.println("yesss");
     String[] cars ={"Volvo", "BMW", "Ford", "Mazda"};
     String[] tracks ={"Volvo", "Man", "Scania", "GMC"};
     int[] numbers ={1,2,3,4,5};
     for (int i=0,j=0,k=0;i<cars.length && j<tracks.length&&k<numbers.length;i++,j++,k++) {
    	  System.out.println(cars[i]);
    	  System.out.println(tracks[j]);
    	  System.out.println(numbers[k]);
    	}
	  
     for (int i=0;i<cars.length && i<tracks.length&&i<numbers.length;i++) {
   	  System.out.println(cars[i]);
   	  System.out.println(tracks[i]);
   	  System.out.println(numbers[i]);
   	}
 	 System.out.println("from for each loop");
     for (String i: cars) {
   
    	  System.out.println(i);
    	}
     
     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
     // using for each loop
     for(int[] i:myNumbers) {
    	 for(int j:i)
    	 System.out.println(j);
     }
     // using the double for loop
     for(int i=0;i<myNumbers.length;i++) {
    	 for(int j=0;j<myNumbers[i].length;j++) {
    		 System.out.println(myNumbers[i][j]);
         }
     }

     int i=0;
     int j=++i;
     System.out.println(j);
     System.out.println(i);
     int time = 22;
     if (time < 10) {
       System.out.println("Good morning.");
     } else if (time < 20) {
       System.out.println("Good day.");
     } else {
       System.out.println("Good evening.");
     }
     
    boolean x=time==22?true:false;
     
    System.out.println(x);
    int l=0;
    do {
    	System.out.println(l);
    	l++;
    }while(l<22);
    int k=0;
    while(k<20) {
    	System.out.println(k);
    	k++;
    }
}
  

}

