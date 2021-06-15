import java.lang.Math;
public class ArrayExercise2{
//create a two dimesional array of 3x3 initialize it with random numbers and display;
	public static void main(String args[]){
		double[][] arr= new double[3][3];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=Math.random();
			
			}
			}
		
	for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr.length;j++){
	System.out.print(arr[i][j]+" ");
	}
	System.out.println();
	}
}
}