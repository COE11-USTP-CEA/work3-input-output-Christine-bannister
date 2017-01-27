import java.io.*;

class project3ioBonus{
	public static void main(String[]args){
		System.out.println("Hello Everyone!");
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader (c);
		System.out.println("Enter Height of the Triangle:");
		double height =0.0
		try{
			height=Integer.valueof(b.readLine());
		}
		catch(Exception p){
			System.out.println("Invalid number!")
			
		}
		for(int k=1; k<=height; k++){
			for(int i=1; i<height -(k-1); i++){
				System.out.print(" ");
			}
			for(int j=1; j<=k; j++){
				System.out.print("*");
				for(int c1=1; c1<j; c1+=j){
				System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}