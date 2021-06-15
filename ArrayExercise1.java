import java.lang.Math;
public class ArrayExercise1{
	public static void main(String args[]){
	//write a program to create a one dimensional array of int having 10 elements initialize the array in the multiples of five and display them.
	int[] arr = new int[10];
	for(int i=0;i<arr.length;i++){
		arr[i]=5*i;
		}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+", ");
		}
}}