class Cal1{

		int add(){
		return 2+2;
		}
		int sub(){
		return 2-2;
			}
		int mul(){
		return 2*2;	
			}
		int div(){
		return 2/2;
		}


}

public class Assignment2a{
	public static void main(String [] args){
	//Program for addition,substraction,multiplication and division using method and hard coded values
	Cal1 obj = new Cal1();
	System.out.println(obj.add());
	System.out.println(obj.sub());
	System.out.println(obj.mul());
	System.out.println(obj.div());

	}
}