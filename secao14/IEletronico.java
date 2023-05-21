package br.com.geekuniversity.secao14;
/*
 - Uma interface pode conter:
   - Contantes(toda em mai�sculo);
   - M�todos abstratos;
   
 Interface para servir de contrato para produtos eletronicos. Todo produto eletronico que 
 implementar essa interface OBRIGRATORIAMENTE dever�o implementar
 os m�todos abstratos
 */
public interface IEletronico {
	
	public String MARCA = "Geek"; //Constante
	
	public void ligar();
	
	public void desligar();
		

}
