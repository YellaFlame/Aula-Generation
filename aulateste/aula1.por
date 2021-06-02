programa
{
	
	funcao inicio()
	{
		cadeia nome[] = {"leonardo","gabriel","geovana"}
		cadeia comentario[] = {"ola","eitaaa"}

		escreva("------", "tabela", "------- \n")

		para(inteiro contador = 0; contador < 3; contador++){
			escreva("id: ",contador,"\n","nome: ", nome[contador], "\n" , "comentarios: ", comentario[contador], "\n" , "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */