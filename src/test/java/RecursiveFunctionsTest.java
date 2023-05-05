import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveFunctionsTest {


    @Test
    void testSumaNNegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                RecursiveFunctions.SumaN(-2));
        assertEquals(exception.getMessage(), "El número debe ser mayor o igual que 0");
    }

    @Test
    void testSumaNCero() {
        int factorialActual = RecursiveFunctions.SumaN(0);
        assertEquals(0, factorialActual);
    }

    @Test
    void testSumaNPositiveInput() {
        int sumaActual = RecursiveFunctions.SumaN(4);
        assertEquals(10, sumaActual);
    }

    void FactorialNegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                RecursiveFunctions.SumaN(-2));
        assertEquals(exception.getMessage(), "El número debe ser mayor o igual que 0");
    }

    @Test
    void FactorialCero() {
        int factorialActual = RecursiveFunctions.Factorial(0);
        assertEquals(1, factorialActual);
    }

    @Test
    void FactorialPositivo() {
        int factorialActual = RecursiveFunctions.Factorial(4);
        assertEquals(24, factorialActual);
    }

    @Test
    void PotenciaCero() {
        int potenciaActual = RecursiveFunctions.Potencia(4, 0);
        assertEquals(1, potenciaActual);
    }

    @Test
    void PotenciaPositiva() {
        int potenciaActual = RecursiveFunctions.Potencia(4, 2);
        assertEquals(16, potenciaActual);
    }

    @Test
    void SumListVacio() {
        List<Integer> numbers = Arrays.asList();
        int sumListActual = RecursiveFunctions.SumList(numbers);
        assertEquals(0, sumListActual);
    }

    @Test
    void SumList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int sumListActual = RecursiveFunctions.SumList(numbers);
        assertEquals(6, sumListActual);
    }

    @Test
    void CalcularMedia() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int calcularMediaActual = RecursiveFunctions.CalcularMedia(numbers);
        assertEquals(2, calcularMediaActual);
    }

    @Test
    void CalcularDesviacionEstandarVacia() {
        List<Integer> numbers = Arrays.asList();
        double desviacionEstandarActual = RecursiveFunctions.CalcularDesviacionEstandar(numbers);
        assertEquals(0, desviacionEstandarActual);

    }

    @Test
    void CalcularDesviacionEstandar() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double desviacionEstandarActual = RecursiveFunctions.CalcularDesviacionEstandar(numbers);
        assertEquals(1.5811388300841898, desviacionEstandarActual);
    }

    @Test
    void SumEven() {
        int sumEvenActual = RecursiveFunctions.SumEven(6);
        assertEquals(12, sumEvenActual);
    }

    @Test
    void RecursiveEvenSumListVacia() {
        List<Integer> numbers = Arrays.asList();
        int sumaRecursivaActual = RecursiveFunctions.RecursiveEvenSumList(numbers);
        assertEquals(0, sumaRecursivaActual);

    }

    @Test
    void RecursiveEvenSumList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumaRecursivaActual = RecursiveFunctions.RecursiveEvenSumList(numbers);
        assertEquals(6, sumaRecursivaActual);
    }

    /**
    void GetEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> getEvenActual = RecursiveFunctions.GetEvenNumbers(numbers);
        List<Integer> getEvenEsperada = Arrays.asList(2,  4);
        assertEquals(getEvenEsperada, getEvenActual);
    }
     **/

    @Test
    void EvenNumbers() {
        List<Integer> evenNumbersActual = RecursiveFunctions.EvenNumbers(6);
        List<Integer> evenNumbersEsperada = Arrays.asList(2, 4, 6);
        assertEquals(evenNumbersEsperada, evenNumbersActual);
    }

    // si la diferencia en valor absoluta es menor que 0.00000001
    @Test
    void CalculateDotProduct() {
        List<Integer> numbers1 = Arrays.asList(1, 2);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        int calculateDotProductActual = RecursiveFunctions.CalculateDotProduct(numbers1, numbers2);
        assertEquals(11, calculateDotProductActual);
    }

    @Test
    void Fibonacci() {
        double fibonacciActual = RecursiveFunctions.Fibonacci(12);
        assertEquals(144.0, fibonacciActual);
    }

    @Test
    void FibonacciQuotient() {
        double fibonacciQuotientActual = RecursiveFunctions.FibonacciQuotient(12);
        assertEquals(1.6181818181818182, fibonacciQuotientActual);
    }
}