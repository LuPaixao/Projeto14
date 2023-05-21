package br.com.geekuniversity.secao14;
//Interfaces - o que �, e quando utilizar

/*
 - Interfaces s�o conhecidas como contratos.
 
 Ume empresa criou um contrato 'com regras' para definir a cria��o de um produto ou servi�o.
 
 Quem implementar este contrato � OBRIGADO a seguir as regras.
 
 O Jo�o, decidiu implementar um produto/servi�o baseado nesse contrato
 A Maria tbm decidiu implementar um produto/servi�o baseado no mesmo contrato
 
 Contrato para a confec��o de um bolo.
 - O bolo precisa ser de chocolate;
 - O bolo deve ter cobertura;
 - O bolo deve ser recheado;
 
 */
public class Programa33 {
	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador �: " + vent.MARCA);
		
		vent.desligar(); //N�o deve imprimir a mensagem
		
		vent.ligar(); //Deve imprimir a mensagem
		
		vent.desligar(); //Deve imprimir a mensagem
	}

}
