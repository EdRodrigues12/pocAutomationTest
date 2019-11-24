# encoding: utf-8
# language: pt

Funcionalidade: Funções Matematicas
  Realizar funções matematicas

  @soma
  Esquema do Cenário: Realizar uma soma de dois numeros inteiro
    Dado que um usuário entrou com o numero <Numero 1>
    E que o usuário clicou no botão +
    E que um usuário entrou com o segundo numero de valor <Numero 2>
    Quando o usuário clicar no botão = da calculadora
    Então o resultado deve ser <Resultado>
    Exemplos:
      | Numero 1 | Numero 2 | Resultado|
      |    10    |     5    |     15   |

  @subtracao
  Esquema do Cenário: Realizar uma subtração de dois numeros inteiro
    Dado que um usuário entrou com o numero <Numero 1>
    E que o usuário clicou no botão -
    E que um usuário entrou com o segundo numero de valor <Numero 2>
    Quando o usuário clicar no botão = da calculadora
    Então o resultado deve ser <Resultado>
    Exemplos:
      | Numero 1 | Numero 2 | Resultado|
      |    25    |     20   |     5    |

  @multiplicacao
  Esquema do Cenário: Realizar uma multiplicação de dois numeros inteiro
    Dado que um usuário entrou com o numero <Numero 1>
    E que o usuário clicou no botão *
    E que um usuário entrou com o segundo numero de valor <Numero 2>
    Quando o usuário clicar no botão = da calculadora
    Então o resultado deve ser <Resultado>
    Exemplos:
      | Numero 1 | Numero 2 | Resultado|
      |    5     |     9    |     45   |

  @divisao
  Esquema do Cenário: Realizar uma divisão de um numeros inteiro
    Dado que um usuário entrou com o numero <Numero 1>
    E que o usuário clicou no botão /
    E que um usuário entrou com o segundo numero de valor <Numero 2>
    Quando o usuário clicar no botão = da calculadora
    Então o resultado deve ser <Resultado>
    Exemplos:
      | Numero 1 | Numero 2 | Resultado|
      |    10    |     2    |     5    |

