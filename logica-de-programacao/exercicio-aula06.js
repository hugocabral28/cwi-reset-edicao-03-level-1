let altura = 1.68;
let peso = 90;

let imc = peso/(altura * altura);
imc = imc.toFixed(2);

let classificacao = "";
let grauDeObesidade = 0;

if (imc < 18.50){
  classificacao = "Magreza";
  grau = 0;
}else if (imc >= 18.50 & imc <= 24.99){
  classificacao = "Normal";
  grau = 0;
}else if (imc >= 25.00 & imc <= 29.99){
  classificacao = "Sobrepeso";
  grau = 1;
}else if (imc >= 30.00 & imc <= 39.99){
  classificacao = "Obesidade";
  grau = 2;
}else {
  classificacao = "Obesidade grave";
  grau = 3;
}

console.log("Valor do IMC = " + imc + " classificação = " + classificacao + " Grau = " + grau);
if (grau > 0){
  console.log("Cuidado! Você está acima do peso recomendado pela OMS.");
}
if(grau == 3){
  console.log("É importante procurar um médico para avaliar sua saúde.");
}

