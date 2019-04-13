
public class nested_for_loop {

	
	public static void main(String[] args) {
		/*
		 * out put
		 * 	1 1 1 1 1 1 1 1 1 1  
			2 2 2 2 2 2 2 2 2 2  
			3 3 3 3 3 3 3 3 3 3  
			4 4 4 4 4 4 4 4 4 4  
			5 5 5 5 5 5 5 5 5 5  
			6 6 6 6 6 6 6 6 6 6  
			7 7 7 7 7 7 7 7 7 7  
			8 8 8 8 8 8 8 8 8 8  
			9 9 9 9 9 9 9 9 9 9  
			
		 */
		/*
		for(int i = 1 ; i <=9 ; i++)
		{
			for (int j=1 ; j<=9 ;j++)
			{
				System.out.print(i + " ");
				
			}
			System.out.println(" ");
			
		}
		*/
		///////next programe starts from here///////////////////////////////////////////////////
	
		
		/*out put
		 * 1 
		   2 2 
           3 3 3 
           4 4 4 4 
           5 5 5 5 5 
           6 6 6 6 6 6 
           7 7 7 7 7 7 7 
           8 8 8 8 8 8 8 8 
           9 9 9 9 9 9 9 9 9 
		 * */
		/*
		for(int i = 1 ; i<=9 ; i++)
		{
			for( int j = 1 ; j<=i ; j ++ )
			{
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		*/
	///////next programe starts from here///////////////////////////////////////////////////
		
		/*out put
		9 9 9 9 9 9 9 9 9  
		8 8 8 8 8 8 8 8  
		7 7 7 7 7 7 7  
		6 6 6 6 6 6  
		5 5 5 5 5  
		4 4 4 4  
		3 3 3  
		2 2  
		1  
		*/
		/*
		for(int i=9 ; i>0; i--){
			for(int j= 1 ; j<=i ;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		*/
		
	///////next programe starts from here///////////////////////////////////////////////////
		
		/* out put
		1  
		2 2  
		3 3 3  
		4 4 4 4  
		5 5 5 5 5  
		5 5 5 5 5  
		4 4 4 4  
		3 3 3  
		2 2  
		1  
		*/
		/*
		for(int i = 1 ; i<=5 ;i ++)
		{
			for(int j= 1 ; j<=i ;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		for(int i = 5 ;i>0 ;i--)
		{
			for(int j = 1 ;j <=i ;j++)
			{
				System.out.print( i + " ");
			}
			System.out.println(" ");
		}
		*/
		
	///////next programe starts from here///////////////////////////////////////////////////
		
		/*out put
		  
		 
		* * * *  
		*     *  
		*     *  
		* * * *
		
		 
		*/
		/*
		for(int i = 1 ; i <=4 ; i++)
		{
			for(int j = 1 ; j<=4 ; j++)
			{
				if( i == 1 || i == 4 || j==1 || j==4)
				{
				System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println(" ");
		}
		*/
		
	///////next programe starts from here///////////////////////////////////////////////////
		
		/* out put
		
	      * *      
	    * * * *    
	  * * * * * *  
	  * * * * * *  
	    * * * *    
	      * *    
	      
	    */  
		/*
		for(int i = 1 ; i<=3 ;i++)
		{
			for(int j= 1 ; j<=6 ; j++)
			{
				if( i == 3 || j == 3 || j == 4 || (i == 2 && (j == 2 || j == 5)))
				{
				System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println(" ");
		}
		for(int i = 3 ; i>0 ; i--)
		{
			for(int j = 1 ; j<=6 ; j++)
			{
				if( i == 3 || j == 3 || j == 4 || (i == 2 && (j == 2 || j == 5)))
				{
				System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println(" ");
		}
		*/
		
	///////next programe starts from here///////////////////////////////////////////////////
		
		/* out put
		 
		 		*   
              * *   
      	    * * *   
      	  * * * *   
  		* * * * *
  		   
  		*/
		/*
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int j = 1 ; j<=5 ; j++)
			{
				if( i == 5 || j == 5 || ( i == 4 && (j == 2 || j == 3 || j == 4)) || ( i == 3 && (j == 3 || j == 4)) 
						|| ( i == 2 && ( j == 4)))
				{
				System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
				
			}
			System.out.println(" " + " ");
		}
		*/
		
	///////next programe starts from here///////////////////////////////////////////////////
		
		/* out put
		 
		* * * * *   
		  * * * *   
		  	* * *   
		      * *
		  	   	* 
		  	   	
		*/
		/*
		for(int i = 5 ; i>0 ; i--)
		{
			for(int j = 1 ; j<=5 ; j++)
			{
				if( i == 5 || j == 5 || ( i == 4 && (j == 2 || j == 3 || j == 4)) || ( i == 3 && (j == 3 || j == 4)) 
						|| ( i == 2 && ( j == 4)))
				{
				System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
				
			}
			System.out.println(" " + " ");
		}
		*/
		
	///////next programe starts from here///////////////////////////////////////////////////
		/* out put
		  multiplication of numbers
		 
		  1   2   3   4   5   6   7   8   9  10  11  12  
		  2   4   6   8  10  12  14  16  18  20  22  24  
		  3   6   9  12  15  18  21  24  27  30  33  36  
		  4   8  12  16  20  24  28  32  36  40  44  48  
		  5  10  15  20  25  30  35  40  45  50  55  60  
		  6  12  18  24  30  36  42  48  54  60  66  72  
		  7  14  21  28  35  42  49  56  63  70  77  84  
		  8  16  24  32  40  48  56  64  72  80  88  96  
		  9  18  27  36  45  54  63  72  81  90  99 108  
		 10  20  30  40  50  60  70  80  90 100 110 120  
		 11  22  33  44  55  66  77  88  99 110 121 132  
		 12  24  36  48  60  72  84  96 108 120 132 144
		 
		 */  
		for(int i = 1 ; i<=12 ; i++)
		{
			for(int j=1 ; j <=12 ;j++)
			{
				int product  = i*j;
				if( product < 10)
				{
				System.out.print("  " + product + " ");
				}
				else if(product < 100)
				{
					System.out.print(" " + product + " ");
				}
				else
				{
					System.out.print(product + " ");
				}
			}
			System.out.println(" ");
		}
	}

}
