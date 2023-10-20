//Función para verificar si el dato es númerico.
function isNumeric(value) {
    return !isNaN(parseFloat(value)) && isFinite(value);
}

//Función para calcular la serie de Fibonacci 
function calcularFibonacci(numero) {
    if (numero <= 0) {
        return [];
    } else if (numero === 1) {
        return [0];
    } else if (numero === 2) {
        return [0, 1];
    } else {
        let fibonacci = [0, 1];
        for (var i = 2; i < numero; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}

var input = prompt("Ingrese un número para calcular la serie de Fibonacci:");

//Verifica que el dato sea numérico
if (isNumeric(input)) {
    let numero = parseInt(input);
    let fibonacciSeries = calcularFibonacci(numero);
    console.log("La serie de Fibonacci de " + numero + " es: " + fibonacciSeries);
} else {
    console.log("Error: Por favor, ingrese un número válido.");
}
