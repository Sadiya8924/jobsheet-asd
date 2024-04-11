public class MergeShorting24 {
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public void merge(int[] data, int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(int[] data, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public List<Integer> sequentialSearchAll(int[] data, int key) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                results.add(i);
            }
        }
        return results;
    }
    
    public int binarySearch(int[] data, int key) {
        int left = 0;
        int right = data.length - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            if (data[mid] == key) {
                return mid;
            }
    
            if (data[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } return -1;
    }
}