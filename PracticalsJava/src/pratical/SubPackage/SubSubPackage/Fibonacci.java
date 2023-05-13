package pratical.SubPackage.SubSubPackage;

	public class Fibonacci {
		public static void FibonaciGenerator(int n) {
			int arr[]=new int[n];
			arr[0]=0;
			arr[1]=1;
			for(int i=2;i<arr.length;i++) {
				arr[i]=arr[i-1]+arr[i-2];
			}
			System.out.println("First "+n+" fibonacci numberes are :");
			for(int i:arr) {
				System.out.print(i+" ");
			}
			
		}
	}


