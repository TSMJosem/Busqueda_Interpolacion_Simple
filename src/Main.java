public class Main {
    public static void main(String[] args) {
        int low, high, pos, datos_repetidos;
        double key;
        int[] arr = {10, 20, 30, 35, 40, 50};

        low = 0;
        high = arr.length-1;
        pos = 0;
        key = 30;

        while (pos>=low && pos<=high) {
            pos = (int) (low + ((key - arr[low])/(arr[high] - arr[low])) * (high - low));

            if (arr[pos] == key) {
                System.out.println("Se ha encontrado un valor a esta posición");
                break;
            } else if (arr[pos] < key) {
                low = pos + 1;
            }
            else if (arr[pos] > key) {
                high = pos - 1;
            }
        }
    }
}