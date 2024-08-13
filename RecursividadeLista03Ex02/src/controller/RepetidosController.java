package controller;

public class RepetidosController {
	public RepetidosController() {
		super();
	}
	
	public int aparece(String numero, int tamanho, int n) {
		//Condição de Parada: Se o tamanho do número for menor do que 0, a função recursiva para de ser chamada e retorna 0.
		
		if(tamanho < 0) {
			return 0;
		}else {
			//Se o caractere for igual a n soma-se 1 com a recursiva e diminui o tamanho do número em 1, senão, soma-se 0 com a recursiva e diminui o tamanho do número em 1 . 
			
			if(Character.getNumericValue(numero.charAt(tamanho)) == n) {
				return 1 + aparece(numero, tamanho-1, n);
			}else {
				return 0 + aparece(numero, tamanho-1, n);
			}
		}
	}
}
