package SingleNumber;

public class BestSolution {
	public static int singleNumber(int a[]){
		int result = 0;
		for(int i = 0; i < a.length; i ++){
			result ^= a[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,4,3,2,1,5,5,6,7,7};
		System.out.println(singleNumber(a));
	}

}
