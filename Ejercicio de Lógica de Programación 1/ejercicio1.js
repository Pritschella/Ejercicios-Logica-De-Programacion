
//Solicitar los números por medio de un prompt
var num1 = parseInt(prompt("Ingrese el primer número:"));
var num2 = parseInt(prompt("Ingrese el segundo número:"));
var num3 = parseInt(prompt("Ingrese el tercer número:"));

//Verifica que los datos ingresados sean números por medio de una función llamada isNaN, el cual significa (Not A Number) no es un número.
if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
    console.log("Al menos uno de los valores ingresados no es un número.");;
} else {
    //Función que ordena de mayor a menor los números ingresados
    var mayorAMenor = [num1, num2, num3].sort(function (a, b) {
        return a - b;
    });


    //Función que ordena de menor a mayor los números ingresados
    var menorAMayor = [num1, num2, num3].sort(function (a, b) {
        return b - a;
    });

}


//Impresión de los datos ordenados
console.log("Números ordenados de menor a mayor: " + mayorAMenor + ", ");
console.log("Los números ordenados de mayor a menor son: " + menorAMayor + ", ");