let arrayDeValores = [1, 2, 3, 5, 8, 10, 11, 20, 23, 34, 40, 41];
let soma = 0;
let i = 0;
let media = 0;

while(i < arrayDeValores.length){
  soma += arrayDeValores[i];
  i++;
}
media = soma / arrayDeValores.length;
console.log(media.toFixed(2));