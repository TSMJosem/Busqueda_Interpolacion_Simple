public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int lim_inferior, lim_superior, pos;
        double valor_buscado;

        valor_buscado = 10;
        lim_inferior = 0;
        lim_superior = arr.length - 1;

        pos = (int) (lim_inferior + ((valor_buscado - arr[lim_inferior])/(arr[lim_superior] - arr[lim_inferior]))
                * (lim_superior - lim_inferior));

        while (pos <= lim_superior && pos >= lim_inferior) {

            if (arr[pos] == valor_buscado) {
                System.out.println("El dato está en la posición: " + pos + " del arreglo");
                break;
            }
            else if (arr[pos] < valor_buscado) {
                lim_inferior = pos + 1;
            }
            else if (arr[pos] > valor_buscado) {
                lim_superior = pos - 1;
            }
        }
    }
}