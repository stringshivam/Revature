class Cal{

		int add(int a,int b){
		return (a+b);
		}
		int sub(int a,int b){
		return (a-b);
			}
		int mul(int a,int b){
		return a*b;	
			}
		int div(int a,int b){
		return a/b;
		}


}

public class Assignment1a{
	public static void main(String [] args){
	//Program for addition,substraction,multiplication and division using method
	
	Cal obj = new Cal();
	System.out.println(obj.add(10,5));
	System.out.println(obj.sub(10,5));
	System.out.println(obj.mul(10,5));
	System.out.println(obj.div(10,5));

	}
}