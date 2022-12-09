class Test270
{
	public static void main(String[]args)
	{
		int arr[2];
		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}
}
































// // // Java program for implementation of Heap Sort
// // public class Test270 {
// // 	public void sort(int arr[])
// // 	{
// // 		int n = arr.length;

// // 		// Build heap (rearrange array)
// // 		for (int i = n / 2 - 1; i >= 0; i--)
// // 			heapify(arr, n, i);

// // 		// One by one extract an element from heap
// // 		for (int i = n - 1; i > 0; i--) {
// // 			// Move current root to end
// // 			int temp = arr[0];
// // 			arr[0] = arr[i];
// // 			arr[i] = temp;

// // 			// call max heapify on the reduced heap
// // 			heapify(arr, i, 0);
// // 		}
// // 	}

// // 	// To heapify a subtree rooted with node i which is
// // 	// an index in arr[]. n is size of heap
// // 	void heapify(int arr[], int n, int i)
// // 	{
// // 		int largest = i; // Initialize largest as root
// // 		int l = 2 * i + 1; // left = 2*i + 1
// // 		int r = 2 * i + 2; // right = 2*i + 2

// // 		// If left child is larger than root
// // 		if (l < n && arr[l] > arr[largest])
// // 			largest = l;

// // 		// If right child is larger than largest so far
// // 		if (r < n && arr[r] > arr[largest])
// // 			largest = r;

// // 		// If largest is not root
// // 		if (largest != i) {
// // 			int swap = arr[i];
// // 			arr[i] = arr[largest];
// // 			arr[largest] = swap;

// // 			// Recursively heapify the affected sub-tree
// // 			heapify(arr, n, largest);
// // 		}
// // 	}

// // 	/* A utility function to print array of size n */
// // 	static void printArray(int arr[])
// // 	{
// // 		int n = arr.length;
// // 		for (int i = 0; i < n; ++i)
// // 			System.out.print(arr[i] + " ");
// // 		System.out.println();
// // 	}

// // 	// Driver code
// // 	public static void main(String args[])
// // 	{
// // 		int arr[] = { 12, 11, 13, 5, 6, 7 };
// // 		int n = arr.length;

// // 		Test270 ob = new Test270();
// // 		ob.sort(arr);

// // 		System.out.println("Sorted array is");
// // 		printArray(arr);
// // 	}
// // }


// /* Java program for Merge Sort */
// class Test270
// {
// 	// Merges two subarrays of arr[].
// 	// First subarray is arr[l..m]
// 	// Second subarray is arr[m+1..r]
// 	void merge(int arr[], int l, int m, int r)
// 	{
// 		// Find sizes of two subarrays to be merged
// 		int n1 = m - l + 1;
// 		int n2 = r - m;

// 		/* Create temp arrays */
// 		int L[] = new int[n1];
// 		int R[] = new int[n2];

// 		/*Copy data to temp arrays*/
// 		for (int i = 0; i < n1; ++i)
// 			L[i] = arr[l + i];
// 		for (int j = 0; j < n2; ++j)
// 			R[j] = arr[m + 1 + j];

// 		/* Merge the temp arrays */

// 		// Initial indexes of first and second subarrays
// 		int i = 0, j = 0;

// 		// Initial index of merged subarray array
// 		int k = l;
// 		while (i < n1 && j < n2) {
// 			if (L[i] <= R[j]) {
// 				arr[k] = L[i];
// 				i++;
// 			}
// 			else {
// 				arr[k] = R[j];
// 				j++;
// 			}
// 			k++;
// 		}

// 		/* Copy remaining elements of L[] if any */
// 		while (i < n1) {
// 			arr[k] = L[i];
// 			i++;
// 			k++;
// 		}

// 		/* Copy remaining elements of R[] if any */
// 		while (j < n2) {
// 			arr[k] = R[j];
// 			j++;
// 			k++;
// 		}
// 	}

// 	// Main function that sorts arr[l..r] using
// 	// merge()
// 	void sort(int arr[], int l, int r)
// 	{
// 		if (l < r) {
// 			// Find the middle point
// 			int m =l+ (r-l)/2;

// 			// Sort first and second halves
// 			sort(arr, l, m);
// 			sort(arr, m + 1, r);

// 			// Merge the sorted halves
// 			merge(arr, l, m, r);
// 		}
// 	}

// 	/* A utility function to print array of size n */
// 	static void printArray(int arr[])
// 	{
// 		int n = arr.length;
// 		for (int i = 0; i < n; ++i)
// 			System.out.print(arr[i] + " ");
// 		System.out.println();
// 	}

// 	// Driver code
// 	public static void main(String args[])
// 	{
// 		int arr[] = { 12, 11, 13, 5, 6, 7 };

// 		System.out.println("Given Array");
// 		printArray(arr);

// 		Test270 ob = new Test270();
// 		ob.sort(arr, 0, arr.length - 1);

// 		System.out.println("\nSorted array");
// 		printArray(arr);
// 	}
// }
// /* This code is contributed byclera
//  Rajat Mishra */
