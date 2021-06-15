public class VarArgs{
	public static void main(String []args){
		System.out.println(add(5,3,7,2));
}
static int add(int ...x){
	int result=0;
	for(int i=0;i<x.length;i++){
		result+=x[i];
	}
return result;
}
}