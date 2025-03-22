
public class b65SortArray {
	static void Sort(int[] arr) {
		int arrlength = arr.length;
		boolean swapyet= true;
		//System.out.println(arrlength);
		for(int i=0;i<arrlength-1;i++) {
			if(swapyet) {
				swapyet = false;
				for(int j=0;j<arrlength-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						swapyet=true;
						/*for(int u=0;u<arrlength;u++) {
							System.out.print(arr[u]+"  ");
						}
						System.out.println(i+" -"+j+ arr[j]+ arr[j+1]);
						System.out.println();*/
					}
				}
			}
		}
		
	}
	public static void main(String args[]) {
		int arr[] = {5, 4, 6, 3,7,4,3,4,5,6,7,5,5,4,3,44,5,55,4,4,3};
		int arrlength = arr.length;
		System.out.print("before: ");
		for(int i=0;i<arrlength;i++) {
			System.out.print(arr[i]+"  ");
		}
		Sort(arr);
		System.out.print("\nafter: ");
		for(int i=0;i<arrlength;i++) {
			System.out.print(arr[i]+"  ");
		}
		
	}
}
