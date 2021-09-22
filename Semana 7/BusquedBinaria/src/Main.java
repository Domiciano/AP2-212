import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0 ; i < 100000000 ; i++)
		{
			int random = (int) (Math.random()*100000001);
			arr.add(random);
		}
		
		int goal = (int) (Math.random()*100000001);
		
		
		long tic1 = System.currentTimeMillis();

		int indiceA = binarySearch(arr, goal);
		System.out.println("Encontrado " + goal + " en: " + indiceA);
		
		long toc1 = System.currentTimeMillis() - tic1;
		
		///////////////////////////////////////////////////////////////
		
		long tic2 = System.currentTimeMillis();
		
		int indiceB = sequentialSearch(arr, goal);
		System.out.println("Encontrado " + goal + " en: " + indiceB);
		
		long toc2 = System.currentTimeMillis() - tic2;
		
		System.out.println(toc1);
		System.out.println(toc2);
	}

	public static int binarySearch(ArrayList<Integer> arr, int goal) {
		Collections.sort(arr);
		int start = 0;
		int end = arr.size() - 1;
		while (start <= end) {
			int half = (start + end) / 2;
			System.out.println(">>>" + half);
			if (arr.get(half) == goal) {
				return half;
			} else if (arr.get(half) > goal) {
				end = half - 1;
			} else {
				start = half + 1;
			}
		}
		return -1;
	}

	public static int sequentialSearch(ArrayList<Integer> arr, int goal) {
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == goal) {
				return i;
			}
		}
		return -1;
	}

}
