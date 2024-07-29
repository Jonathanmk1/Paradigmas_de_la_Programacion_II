package MetOrd;

public class MetodosDeOrdenacion {

    //metodo por ordenacion de seleccion
    public void OrdenacionSeleccion(double[] arreglo) {
        int indiceMenor, i, j, n;
        double valorMayor, valorMenor;
        n = arreglo.length;

        for (i = 0; i < n - 1; i++) {
            indiceMenor = i;
            for (j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor) {
                valorMenor = arreglo[indiceMenor];
                valorMayor = arreglo[i];
                arreglo[i] = valorMenor;
                arreglo[indiceMenor] = valorMayor;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println("\033[33m***" + arreglo[i]);
        }
    }

//metodos de ordenacion por insercion
    public void OrdenacionInsercion(double[] arreglo) {
        int i, j;
        double aux;

        for (i = 1; i < arreglo.length; i++) {
            j = i;
            aux = arreglo[i];
            while (j > 0 && aux < arreglo[j - 1]) {
                arreglo[j] = arreglo[j - 1];
                j--;
            }
            arreglo[j] = aux;
        }
        for (i = 0; i < arreglo.length; i++) {
            System.out.println("\033[35m----->" + arreglo[i]);
        }

    }

    public static void main(String[] args) {
        MetodosDeOrdenacion ord = new MetodosDeOrdenacion();
        double[] vector = {-4, 5, 6, 11, 2};
        double[] vector2 = {100, 5.5, 7, 99, 2, 34, -6};
        ord.OrdenacionSeleccion(vector);
        System.out.println("\033[33m-------------------");
        ord.OrdenacionInsercion(vector2);
    }

}
