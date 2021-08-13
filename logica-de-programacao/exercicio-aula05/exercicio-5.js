let receitaLiquida = 50;
let custoDeProduto = 21;

//variáveis que calcula o valor para obter o percentual
let lucroBruto = receitaLiquida - custoDeProduto;
let margemBruta = (lucroBruto / receitaLiquida) * 100;

console.log(margemBruta);