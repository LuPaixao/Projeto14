package br.com.geekuniversity.secao14;
/*
 - Uma interface pode conter:
   - Contantes(toda em maiúsculo);
   - Métodos abstratos;
   
 Interface para servir de contrato para produtos eletronicos. Todo produto eletronico que 
 implementar essa interface OBRIGRATORIAMENTE deverão implementar
 os métodos abstratos
 */
public interface IEletronico {
	
	public String MARCA = "Geek"; //Constante
	
	public void ligar();
	
	public void desligar();
		

}
