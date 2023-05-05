import java.util.*;

public class RecursiveFunctions {

    /** 1
     *
     * @param n - número entero
     * @return - la suma de los números de 0 a n
     */
    public static int SumaN (int n) throws IllegalArgumentException {
        // Elevar una excepción cuando haya una entrada no válida
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
        }
        if (n == 0) {
            return 0;
        } else {
            return n + SumaN(n - 1);
        }
    }


    /** 2
     * Calcula el factorial de un número entero
     * @param n - número entero
     * @return - el factorial de n
     */
    public static int Factorial (int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }


    /** 3
     * Calcula la potencia de un número entero
     * @param n - número entero
     * @param p - potencia
     * @return - el resultado de elevar n a la p, le pasaremos como valor también n
     */
    public static int Potencia (int n, int p) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
        }
        if (p < 0) {
            throw new IllegalArgumentException("El valor de la potencia debe ser mayor o igual que 0");
        }
        if (p == 0) {
            return 1;
        } else {
            return n * Potencia(n, p - 1);
        }
    }


    /** 4
     * Calcula la suma de los elementos de una lista de numeros
     * @param numbers - lista de enteros
     * @return sum - la suma de los elementos de la lista
     */
    public static int SumList (List<Integer> numbers) {
        if (numbers.size() == 0) {
            return 0;
        }
        else {
            int lastNumber = numbers.get(numbers.size() - 1);
            List<Integer> remainingNumbers = numbers.subList(0, numbers.size() - 1);
            int sum = SumList(remainingNumbers);
            return sum + lastNumber;
        }
    }


    /** 5
     * Calcula la media de los elementos de una lista de enteros
     * @param lista - lista de enteros
     * @return suma - la media de los elementos de la lista
     */
    public static int CalcularMedia(List<Integer> lista) {
        if (lista.size() == 0) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }
        return CalcularMediaRecursiva(lista, 0, 0);
    }

    private static int CalcularMediaRecursiva(List<Integer> lista, int index, int suma) {
        if (index == lista.size()) {
            // Caso base: se han sumado todos los elementos
            return suma / lista.size();
        } else {
            // Caso recursivo: sumar el elemento actual y avanzar al siguiente índice
            int elementoActual = lista.get(index);
            return CalcularMediaRecursiva(lista, index + 1, suma + elementoActual);
        }
    }



    /** 6
     * Calcula la desviación típica de una lista de enteros
     * @param lista - lista de enteros
     * @return - la desviación típica de la lista
     */
    public static double CalcularDesviacionEstandar(List<Integer> lista) {
        int n = lista.size();

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else {
            double media = CalcularMedia(lista);
            double sumatoria = 0;
            for (int i = 0; i < n; i++) {
                sumatoria += Math.pow(lista.get(i) - media, 2);
            }
            return Math.sqrt(sumatoria / (n - 1));
        }
    }



    /** 7
     * Calcula la suma de los números pares de 0 a n
     * @param n - número entero mayor o igual que 2
     * @return - la suma de los números pares de 0 a n
     */
    public static int SumEven(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
        }
        if (n == 2) { // base case
            return 2;
        } else if (n % 2 == 0) { // even number
            return n + SumEven(n - 2); // recursive call with n-2
        } else { // odd number
            return SumEven(n - 1); // recursive call with n-1
        }
    }


    /** 8
     * Calcula la suma de los elementos pares de una lista de enteros
     * @param numbers - lista de enteros
     * @return - la suma de los números pares de la lista
     */
    public static int RecursiveEvenSumList(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return 0;
        }
        else {
            int lastNumber = numbers.get(numbers.size() - 1);
            List<Integer> remainingNumbers = numbers.subList(0, numbers.size() - 1);
            int sum = RecursiveEvenSumList(remainingNumbers);
            return lastNumber % 2 == 0 ? sum + lastNumber : sum;
        }
    }


    /** 9
     * Obtiene la lista de los numeros pares de una lista de enteros
     * @param list - lista de enteros
     * @return - la lista de los números pares de la lista
     */
    public static List<Integer> GetEvenNumbers(List<Integer> list) {
        if (list.size() == 2) { // caso base
            if (list.get(0) % 2 == 0) {
                List<Integer> sol = Arrays.asList(0);
                return sol;
            } else {
                List<Integer> sol = Arrays.asList();
                return sol;
            }
        } else {
            List<Integer> evenList = GetEvenNumbers(list.subList(0, list.size() - 1));
            int lastElement = list.get(list.size() - 1);
            if (lastElement % 2 == 0) {
                evenList.add(lastElement);
            }
            return evenList;
        }
    }



    /** 10
     * Obtiene la lista de los números pares de 0 a n
     * @param n - número entero mayor o igual que 2
     * @return list - la lista de los números pares de 0 a n
     */
    public static List<Integer> EvenNumbers(int n) {
        List<Integer> list = new ArrayList<>();
        if (n == 0) {
            return list;
        }
        if (n % 2 == 0) {
            list.addAll(EvenNumbers(n - 2));
            list.add(n);
        } else {
            list.addAll(EvenNumbers(n - 1));
        }
        return list;
    }


    /** 11
     * Calcula el producto escalar de dos vectores
     * @param list1 - lista de enteros
     * @param list2 - lista de enteros
     * @return - el producto escalar de los dos vectores
     */
    public static int CalculateDotProduct(List<Integer> list1, List<Integer> list2) {
        // excepciones
        if (list1.size() < 2) {
            throw new IllegalArgumentException("La lista debe contener al menos 2 elementos");
        }
        if (list2.size() < 2) {
            throw new IllegalArgumentException("La lista debe contener al menos 2 elementos");
        }
        return CalculateDotProductRecursive(list1, list2, 0, 0, 0);
    }
    public static int CalculateDotProductRecursive(List<Integer> list1, List<Integer> list2, int index, int product, int sum) {
        if (list1.size() != list2.size()) {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño");
        }
        if (index == list1.size()) {
            return sum;
        }
        product = list1.get(index) * list2.get(index);
        sum += product;
        return CalculateDotProductRecursive(list1, list2, index + 1, 0, sum);
    }


    /** 12
     * Calcula recursivamente el elemento n de la sucesión de Fibonacci
     * @param n - número entero
     * @return - el elemento n de la sucesión de Fibonacci
     */
    // Complejidad logarítmica
    public static double Fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }


    /** 13
     * Calcula el cociente entre el elemento n y el elemento n-1 de la sucesión de Fibonacci
     * @param n - número entero
     * @return - el cociente entre el elemento n y el elemento n-1 de la sucesión de Fibonacci
     */
    public static double FibonacciQuotient(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            double fn1 = Fibonacci(n-1);
            double fn2 = Fibonacci(n-2);
            return fn1 / fn2;
        }
    }


    /**
     * 14 - Relacion entre la sucesion de Fibonacci y la proporción áurea
     *
     * La proporción áurea es una constante matemática que es aproximadamente igual a 1.61803398875, el valor obtenido
     * de la división de 1+(raiz cuadrada de)5 / 2.
     * La proporción áurea está estrechamente relacionada con la secuencia de Fibonacci y, de hecho,
     * se define como el límite de la proporción entre números de Fibonacci consecutivos a medida que la secuencia
     * tiende al infinito.
     *
     * Para comparar el resultado obtenido de la función recursiva del cociente de los números de Fibonacci 13 y 12
     * con el valor de la proporción áurea, podemos calcular los números de Fibonacci 13 y 12 y dividirlos para obtener
     * el valor real de la proporción. Entonces podemos comparar este valor con el valor de la proporción áurea.
     */
}