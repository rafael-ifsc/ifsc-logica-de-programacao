programa
{
	funcao inicio()
	{

		real valor1, valor2
		real soma, subtracao, multiplicacao, divisao
		
    escreva("Digite seu priemiro número ")
      leia(valor1)

    escreva("Digite seu segundo número ")
      leia(valor2)


		escreva("\n") 

	  soma = valor1 + valor2
		  escreva("O valor da soma é: ", soma, "\n")

		subtracao = valor1 - valor2
		  escreva("O valor da subtração é: ", subtracao, "\n")

		multiplicacao = valor1 * valor2
		  escreva("O valor da multiplicação é: ", multiplicacao, "\n")

		se (valor2 == 0)
		{
				escreva("Não é possível dividir por 0 (zero)!\n")
		}
		senao
		{
				divisao = valor1 / valor2
			    escreva("O valor da divisão é: ", divisao, "\n")
		}
	}
}