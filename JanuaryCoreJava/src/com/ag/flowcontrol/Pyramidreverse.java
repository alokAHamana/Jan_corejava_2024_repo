package com.ag.flowcontrol;

public class Pyramidreverse {
	
		public static void main(String[] args) {
			
			for(int i=5; i>=1; i--) {
				
				for(int j=1; j<=i; j++) {
					
					System.out.print(i);
				}
				System.out.println();
			}
		}
}
// output:              55555
//                      4444
//                      333
//                      22
//                      1
