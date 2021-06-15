public class StringBuilderExample{
	public static void main(String []args){
		StringBuilder str = new StringBuilder("Hello");
		System.out.println(str);
		System.out.println(str.capacity()); //current capacity
		str.append(" World");
		System.out.println(str);
		str.reverse();	
		System.out.println(str);
		str.reverse();
		str.replace(5,5," Universe");
		System.out.println(str);
		System.out.println(str.charAt(8));
		
	}
}