$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Transferencia.feature");
formatter.feature({
  "name": "transferencia",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@transferencia"
    }
  ]
});
formatter.scenario({
  "name": "transferir saldo",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@transferencia"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu esteja logado no sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "transferenciaSteps.euEstejaLogadoNoSistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no botao transferencia",
  "keyword": "Quando "
});
formatter.match({
  "location": "transferenciaSteps.euClicarNoBotaoTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar numero da conta \"5\"",
  "keyword": "E "
});
formatter.match({
  "location": "transferenciaSteps.informarNumeroDaConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o digito \"5\"",
  "keyword": "E "
});
formatter.match({
  "location": "transferenciaSteps.informarODigito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o valor da transferencia \"500\"",
  "keyword": "E "
});
formatter.match({
  "location": "transferenciaSteps.informarOValorDaTransferencia(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar uma descricao \"pra voce pagar seu agiota\"",
  "keyword": "E "
});
formatter.match({
  "location": "transferenciaSteps.informarUmaDescricao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao transferir agora",
  "keyword": "E "
});
formatter.match({
  "location": "transferenciaSteps.acionarOBotaoTransferirAgora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a transferencia sera realizada",
  "keyword": "Entao "
});
formatter.match({
  "location": "transferenciaSteps.aTransferenciaSeraRealizada()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});