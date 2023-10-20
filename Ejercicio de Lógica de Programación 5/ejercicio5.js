let numeroSecreto = parseInt(Math.random() * 100);
console.log(numeroSecreto);

let numeroNoAdivinado = true;
let numerosIngresados = new Array();

do {
    //Prompt para ingresar los numeros
    numero = parseInt(prompt("Intenta adivinar el numero secreto: "));
    //Condicion para comprobar que sea numero, no este vacio y tampoco sea null
    if (!isNaN(numero) && numero != null && numero != "") {
        numerosIngresados.push(numero);
        if (numeroSecreto == numero) {
            console.log("Felicidades, adivinaste el número secreto.");
            numeroNoAdivinado = false;
        } else {
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
            numeroNoAdivinado = true;
        }
        noEsNumero = false;
    } else {
        alert("El dato ingresado no es un numero o es un espacio vacio");
        noEsNumero = true;
    }

} while (noEsNumero || numeroNoAdivinado);

console.log("Numeros ingresados antes de adivinar: " + numerosIngresados);