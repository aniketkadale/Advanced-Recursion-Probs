import java.util.HashSet;
import java.util.Set;

public class AdvancedRecursion {
	// static Set<String> set = new HashSet<>();	
    public static void main(String[] args) {

    //  QUE 1
//    int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
         //        {1, 1, 1, 1, 1, 1, 0, 0},
         //        {1, 0, 0, 1, 1, 0, 1, 1},
         //        {1, 2, 2, 2, 2, 0, 1, 0},
         //        {1, 1, 1, 2, 2, 0, 1, 0},
         //        {1, 1, 1, 2, 2, 2, 2, 0},
         //        {1, 1, 1, 1, 1, 2, 1, 1},
         //        {1, 1, 1, 1, 1, 2, 2, 1},
         //           };

        //floodFill(a, 0 , 0 , 3 , 1);
        //printMatrix(a);
	
    // QUE 2
        //permutations("abcc" , 0 , 3); 

    // QUE 3
        // int a[] = { 1, 5 , 700, 2};
        // System.out.println(coinMax(a, 0 , a.length-1));
        // }

    	// QUE 1 -> MATRIX: FLOOD FILL
        //	static void floodFill(int a[][] , int r , int c , int toFill, int prevFill) {
        //          int rows = a.length;
        //          int cols = a[0].length;
        //          
        //          if(r < 0 || r >= rows || c < 0 || c>= cols) {
        //        	  return;
        //          }
        //          
        //          if(a[r][c] != prevFill) {
        //        	  return;
        //          }
        //          
        //          a[r][c] = toFill;
        //          
        //          floodFill(a, c, r-1, toFill , prevFill);
        //          floodFill(a, c-1, r, toFill , prevFill);
        //          floodFill(a, c+1, r, toFill , prevFill);
        //          floodFill(a, c, r+1, toFill , prevFill);
        //  	}
        //
        //	     static void printMatrix(int a[][]) {
        //		    for(int [] array: a) {
        //			   for(int ele: array) {
        //				 System.out.print(ele + " ");
        //			 }
        //			   System.out.println();
        //		 }
        // }
        	
	      //QUE 2 -> PRINT ALL PERMUTATIONS OF A GIVEN STRING 
        //	static void permutations(String s , int l , int r) {
        //		if(l == r) {
        //			if(set.contains(s)) return;
        //			set.add(s);
        //			System.out.println(s);
        //			return;
        //		}
        //		
        //		for(int i = l; i<= r; i++) {
        //			s = interchangeChar(s, l , i);
        //			permutations(s, l+1,r);
        //			
        //		}
        //	}
        //		static String interchangeChar(String s , int a, int b) {
        //			char array[] = s.toCharArray();
        //			char temp = array[a];
        //			array[a] = array[b];
        //			array[b] = temp;;
        //			return String.valueOf(array);
        //			}
		// 
        //  QUE 3 -> GAME THEORY: OPTIMAL STATEGY TO WIN IN A COIN GAME
              static int coinMax(int a[], int l, int r) {
                if(l+1 == r) {
                return Math.max(a[l], a[r]);
                }
                
                return Math.max(a[l] + Math.min(coinMax(a, l+2, r), coinMax(a, l+1,  r-1)),
                                            (a[r] + Math.min(coinMax(a, l+1 , r-1), coinMax(a, l , r-2))));
            }
        }
	


