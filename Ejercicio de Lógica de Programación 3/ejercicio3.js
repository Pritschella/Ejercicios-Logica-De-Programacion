//Solicita un número y verificar si es válido
let numero;
do {
    let input = prompt("Ingresa un número:");
    numero = parseFloat(input);

    if (isNaN(numero) || numero < 0) {
        alert("El dato ingresado no es válido");
    }
} while (isNaN(numero) || numero < 0);

//Se calcula el factorial
let factorial = 1;
for (let i = 1; i <= numero; i++) {
    factorial *= i;
}

console.log("El factorial de " + numero + " es: " + factorial);
