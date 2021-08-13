let nomeCompleto = "Hugo Ferreira de Almeida Cabral";
let apelido = "Cabral";
let idade = 28;
let dataNascimento = "17-01-1993";
let localNascimento = "Brasília";
let altura = 1.68;
let trabalhando = true;

let apresentacao = "Meu nome é " + nomeCompleto + " (sou conhecido como " + apelido + ") e tenho " + idade + " anos. Nasci no dia " + dataNascimento + ", na cidade de " + localNascimento + ". Tenho " + altura + "m de altura e atualmente estou " + (trabalhando ? "empregado" : "desempregado") + ".";

console.log(apresentacao);