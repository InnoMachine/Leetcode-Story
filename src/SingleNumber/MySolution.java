package SingleNumber;
public class MySolution {
	public static int singleNumber(int a[]){
		
		for(int i = 1; i < a.length; i ++){//make the first integer be the test number
			if(a[0] == a[i]){
				break;
			}else if(i == a.length - 1){
				return a[0];
			}else{
				 
			}
		}
		
		for(int i = 1; i < a.length; i ++){//test from the second number
			if(a[i] != a[0]){
				for(int j = i +1; j < a.length; j ++){
					if(a[i] == a[j]){
						a[i] = a[0];
						a[j] = a[0];
						break;
					}else if(j == a.length - 1){
						return a[i];
					}else{
						
					}
				}
			}else if(i == a.length - 1){
				return a[i];
			}else{
				
			}
		}
		return a[a.length - 1];
	}
	public static int singleNumber1(int a[]){
		int result = 0;
		for(int i = 0; i < a.length; i ++){
			result ^= a[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int a[] = {2,0,13,9,2,8,13,8,7,7,0};
		int b[] = {2,2,3};
		int c[] = {2};
		int d[] = {1,2,2};
		System.out.println(singleNumber1(a));
		System.out.println(singleNumber1(b));
		System.out.println(singleNumber1(c));
		System.out.println(singleNumber1(d));
	}

}