package Model;

import Interfaces.Animal;
import java.util.*;

public class Cavalo implements Animal {
	
	String nome,emitirSom, correr;
	int idade;
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//Outros M�todos
	
	Scanner atendimento = new Scanner(System.in);
	
	public void relinchar()
	{
		System.out.println("Seu animal esta relinchando!");
		emitirSom = "relincho relincho relincho";
		setEmitirSom(emitirSom);
		System.out.println(emitirSom);
	}
	
	public void atendimentoVet()
	{
		System.out.println("qual o nome do seu animal?");
		nome = atendimento.nextLine();
		setNome(nome);
		
		System.out.println("Qual a idade do seu animal?");
		idade = atendimento.nextInt();
		setIdade(idade);
		
		System.out.println("Seu animal esta latindo?");
		emitirSom = "relincho relincho relincho";
		setEmitirSom(emitirSom);
		System.out.println(emitirSom);
		
		System.out.println("Seu animal esta correndo ");
		correr = "Trotando para bem longe - pocoto, pocoto, pocoto";
		setCorrer(correr);
		System.out.println(correr);
		
		
		
	}

}
