# encoding: utf-8
# language: pt

Funcionalidade: Funções Matematicas
  Realizar funções matematicas

  @soma
  Esquema do Cenário: Realizar uma soma de dois numeros inteiro
    Dado que um usuário entrou com o primeiro numero de valor  <Numero 1> para realizar a soma
    E que o usuário clicou no botão de soma
    E que um usuário entrou com o segundo numero de valor <Numero 2> para realizar a soma
    Quando o usuário clicar no botão igual da calculadora
    Então o resultado da soma deve ser <Resultado>
    Exemplos:
      | Numero 1 | Numero 2 | Resultado|
      |    10    |     5    |     15   |

  @subtracao
  Esquema do Cenário: Realizar uma subtração de dois numeros inteiro
    Dado que um usuário entrou com o primeiro numero de valor <Numero 1> para realizar a subtração
    E que o usuário clicou no botão de subtração
    E que um usuário entrou com o segundo numero de valor <Numero 2> para realizar a subtração
    Quando o usuário clicar no botão igual da calculadora
    Então o resultado da subtração deve ser <Resultado>
    Exemplos:
      | Numero 1 | Numero 2 | Resultado|
      |    25    |     20   |     5    |

  @multiplicacao
  Esquema do Cenário: Realizar uma multiplicação de dois numeros inteiro
    Dado que um usuário entrou com o primeiro numero de valor <Numero 1> para realizar a multiplicação
    E que o usuário clicou no botão de multiplicação
    E que um usuário entrou com o segundo numero de valor <Numero 2> para realizar a multiplicação
    Quando o usuário clicar no botão igual da calculadora
    Então o resultado da multiplicação deve ser <Resultado>
    Exemplos:
      | Numero 1 | Numero 2 | Resultado|
      |    5     |     9    |     45   |

  @divisao
  Esquema do Cenário: Realizar uma divisão de um numeros inteiro
    Dado que um usuário entrou com o numero <Numero 1> para realizar a divisão
    E que o usuário clicou no botão de divisão
    E que um usuário entrou com o segundo numero de valor <Numero 2> para realizar a divisão
    Quando o usuário clicar no botão igual da calculadora
    Então o resultado da divisão deve ser <Resultado>
    Exemplos:
      | Numero 1 | Numero 2 | Resultado|
      |    10    |     2    |     5    |

