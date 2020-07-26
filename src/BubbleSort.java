
public class BubbleSort {
	
	public static void Bubblesort( int [] a) {
		
		boolean swaped = true ;
		int n = a.length ;
		
		 while( swaped) {
			
		swaped = false ;
		
		for ( int i = 0 ; i < n - 1 ; i ++) {
			
			if( a[ i ] > a[ i + 1] ) {
				
				int temp = a[ i ];
				a[ i ] = a[ i + 1] ;
				a[ i + 1]  = temp ;
				
				swaped = true ;
			}
			
			
		}
	 }
}
	

	public static void main(String[] args) {
		int[] a = { 4,3,5,6,7 } ;
		Bubblesort(a) ;
		
		for( int i = 0 ; i < a.length ; i++ ) {
			System.out.println( a[i] );
		}
		
	}

}
