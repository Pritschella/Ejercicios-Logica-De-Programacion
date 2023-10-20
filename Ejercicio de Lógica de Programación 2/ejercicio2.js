// Función para convertir grados Celsius a grados Fahrenheit
function celsiusAFahrenheit(celsius) {
    return (celsius * 9 / 5) + 32;
}

// Función para convertir grados Celsius a grados Kelvin
function celsiusAKelvin(celsius) {
    return celsius + 273.15;
}

// Solicitar al usuario la temperatura en grados Celsius
var celsius = parseFloat(prompt("Ingrese la temperatura en grados Celsius:"));
console.log("Los grados a convertir son: " + celsius);

// Verificar si se ingresó un número válido
if (isNaN(celsius)) {
    console.log("Ingrese un número válido.");
} else {
    // Realizar las conversiones
    var fahrenheit = celsiusAFahrenheit(celsius);
    var kelvin = celsiusAKelvin(celsius);

    // Mostrar los resultados en la consola
    console.log("Grados Fahrenheit: " + fahrenheit);
    console.log("Grados Kelvin: " + kelvin);

}