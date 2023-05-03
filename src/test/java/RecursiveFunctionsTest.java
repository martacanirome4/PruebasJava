import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveFunctionsTest {

    /**
    @Test
    void testSumaNWithNegativeInput() {
        int sumaActual = RecursiveFunctions.SumaN(-2);
        int sumaEsperada = IllegalArgumentException("El número debe ser mayor o igual que 0");
        assertEquals(sumaEsperada, sumaActual);
    }
     **/

    @Test
    void testSumaNWithPositiveInput() {
        int sumaActual = RecursiveFunctions.SumaN(4);
        int sumaEsperada = 10;
        assertEquals(sumaEsperada, sumaActual);
    }


    @Test
    void FactorialCero() {
        int factorialActual = RecursiveFunctions.Factorial(0);
        int factorialEsperada = 1;
        assertEquals(factorialActual, factorialEsperada);
    }

    @Test
    void FactorialPositivo() {
        int factorialActual = RecursiveFunctions.Factorial(4);
        int factorialEsperada = 24;
        assertEquals(factorialActual, factorialEsperada);
    }

    @Test
    void PotenciaCero() {
        int potenciaActual = RecursiveFunctions.Potencia(4, 0);
        int potenciaEsperada = 1;
        assertEquals(potenciaActual, potenciaEsperada);
    }

    @Test
    void PotenciaPositiva() {
        int potenciaActual = RecursiveFunctions.Potencia(4, 2);
        int potenciaEsperada = 16;
        assertEquals(potenciaActual, potenciaEsperada);
    }

    @Test
    void SumListVacio() {
        List<Integer> numbers = Arrays.asList();
        int sumListActual = RecursiveFunctions.SumList(numbers);
        int sumListEsperada = 0;
        assertEquals(sumListActual, sumListEsperada);
    }

    @Test
    void SumList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int sumListActual = RecursiveFunctions.SumList(numbers);
        int sumListEsperada = 7;
        assertEquals(sumListActual, sumListEsperada);
    }

    @Test
    void CalcularMedia() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int calcularMediaActual = RecursiveFunctions.CalcularMedia(numbers);
        int calcularMediaEsperada = 2;
        assertEquals(calcularMediaEsperada, calcularMediaActual);
    }

    @Test
    void CalcularDesviacionEstandarVacia() {
        List<Integer> numbers = Arrays.asList();
        double desviacionEstandarActual = RecursiveFunctions.CalcularDesviacionEstandar(numbers);
        double desviacionEstandarEsperada = 0;
        assertEquals(desviacionEstandarEsperada, desviacionEstandarActual);

    }

    @Test
    void CalcularDesviacionEstandar() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double desviacionEstandarActual = RecursiveFunctions.CalcularDesviacionEstandar(numbers);
        // CALCULAR RESULTADO
        double desviacionEstandarEsperada = 0;
        assertEquals(desviacionEstandarEsperada, desviacionEstandarActual);
    }

    @Test
    void SumEven() {
        int sumEvenActual = RecursiveFunctions.SumEven(6);
        int sumEvenEsperado = 12;
        assertEquals(sumEvenEsperado, sumEvenActual);
    }

    @Test
    void RecursiveEvenSumListVacia() {
        List<Integer> numbers = Arrays.asList();
        int sumaRecursivaActual = RecursiveFunctions.RecursiveEvenSumList(numbers);
        int sumaRecursivaEsperada = 0;
        assertEquals(sumaRecursivaEsperada, sumaRecursivaActual);

    }

    @Test
    void RecursiveEvenSumList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumaRecursivaActual = RecursiveFunctions.RecursiveEvenSumList(numbers);
        int sumaRecursivaEsperada = 6;
        assertEquals(sumaRecursivaEsperada, sumaRecursivaActual);
    }

    @Test
    void GetEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> getEvenActual = RecursiveFunctions.GetEvenNumbers(numbers);
        List<Integer> getEvenEsperada = Arrays.asList(2,  4);
        assertEquals(getEvenEsperada, getEvenActual);
    }

    @Test
    void EvenNumbers() {
        List<Integer> evenNumbersActual = RecursiveFunctions.EvenNumbers(6);
        List<Integer> evenNumbersEsperada = Arrays.asList(2, 4, 6);
        assertEquals(evenNumbersEsperada, evenNumbersActual);
    }

    @Test
    void CalculateDotProduct() {
        List<Integer> numbers1 = Arrays.asList(1, 2);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        int calculateDotProductActual = RecursiveFunctions.CalculateDotProduct(numbers1, numbers2);
        // CALCULAR RESULTADO
        List<Integer> calculateDotProductEsperado = Arrays.asList(3, 4);
        assertEquals(calculateDotProductEsperado, calculateDotProductActual);
    }

    @Test
    void Fibonacci() {
        double fibonacciActual = RecursiveFunctions.Fibonacci(12);
        double fibonacciEsperado = 13;
        assertEquals(fibonacciEsperado, fibonacciActual);
    }

    @Test
    void FibonacciQuotient() {
        double fibonacciActual = RecursiveFunctions.Fibonacci(12);
        double fibonacciEsperado = 1.61803398875;
        assertEquals(fibonacciEsperado, fibonacciActual);
    }
}