//função que verifica se nomes são iguais
function verificaNomeIgual(nomeDoFulano,nomeDoBeltrano){
  return nomeDoFulano == nomeDoBeltrano;
}
//função que verifica se idade é de um adulto
function verificaMaiorDeIdade(idade){
  return idade >= 18;
}
//função que calcula juros de boleto
function calculaBoletoComJuros(valorDeBoleto, valorDeJuros){
  return valorDeBoleto * valorDeJuros;
}
//função que calcula o valor da média aritmética de um conjunto de itens
function mediaAritmetica(itens){
  let soma = 0;
  //somar todos os itens do array
  for(let index = 0; index < itens.length; index++){    
    soma += itens[index];
  }
  //retorna o resultado da divisão do somatório pela quantidade de itens
  return soma / itens.length;
}
//função que calcula o valor para obter o percentual
function calculaPercentual(receitaLiquida,custoDeProduto){
  //dividir receita liquida pelo custo do produto
  let lucroBruto = receitaLiquida - custoDeProduto;
  //dividir o lucro bruto pela receita liquida e depois multiplicar por 100 para retorna o percentual
  return (lucroBruto / receitaLiquida) * 100;
}

cwi = "CWI";
reset = "Reset";
imprimir(verificaNomeIgual(cwi, cwi))   // true
imprimir(verificaNomeIgual(cwi, reset)) // false

imprimir("---")

imprimir(verificaMaiorDeIdade(30)) // true
imprimir(verificaMaiorDeIdade(18)) // true
imprimir(verificaMaiorDeIdade(5))  // false

imprimir("---")

imprimir(calculaBoletoComJuros(100,1.1))   // 110
imprimir(calculaBoletoComJuros(984.5,1.1)) // 1082.95

imprimir("---")

imprimir(mediaAritmetica([1]))             // 1
imprimir(mediaAritmetica([1, 4, 10]))      // 5
imprimir(mediaAritmetica([1, 2, 3, 4, 5])) // 3

imprimir("---")

imprimir(calculaPercentual(1000000, 500000))      // 50
imprimir(calculaPercentual(528459.11, 632501.87)) // -19.68[...]