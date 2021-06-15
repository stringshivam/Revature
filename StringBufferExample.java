public class StringBufferExample{
	public static void main(String []args){
		StringBuffer str = new StringBuffer("World");
		System.out.println(str);
		str.append(" is");
		System.out.println(str);
	}
}