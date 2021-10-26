package TrabalhoDicionario;

import java.util.Scanner;
import java.util.ArrayList;

public class TrabalhoDicionario02 {

	
	static ArrayList<String> words = new ArrayList<>();
	public static void main(String[]args) {
		int opcao;
		String name = "";
		
		
		Scanner inputOp = new  Scanner(System.in);
		
		int word = 0;
		
		for(int i =0;i<2;i++) {
		menu();
		opcao = inputOp.nextInt();
		
		if(opcao > 4 && opcao < 1) {
	System.out.println("Opção inválida");
	     	
		}else if(opcao == 1) {
		for( int j =0;j<1;j++)	{
			 addWord();
			 
		}	
		}else if(opcao == 2) {
			
			buscar(name);
			i--;
			
		}else if(opcao == 3) {
			
		}
		
		}
	System.out.println(words);		
		
	}
	public static void menu() {
	System.out.println("============Dicionário==========");
	System.out.println("==Selecione uma opção a baixo.==");
	System.out.println("=== 01) Cadastrar nova palavra.=");
	System.out.println("=== 02) Buscar.=");
	System.out.println("=== 03) Editar =================");
	System.out.println("=== 04) Excluir ================");

	
	}
	
	public static void addWord(){
		Scanner wordInput =new Scanner(System.in);
		
		String pO ;
		String iG;
		for(int i  = 0;i<1;i++ ) {
			System.out.println("Digite um palavra me Portuguê");
			pO = wordInput.nextLine();		
			
			System.out.println("digite uma palavra em Ingles");
	        iG= wordInput.nextLine();
			words.add(pO+" = "+iG);
			
		}
		}
	
	public static void buscar(String name) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pesquisa");
		name = input.nextLine();
		for(int i= 0 ;i<words.size(); i++) {
			
			
				Object a= words.get(i);
				if(a.equals(name) ) {
					System.out.println(words.get(i));
				}
					
					
			}
		}
		
		
	
			
	
		
		public static void editar() {
			Scanner input = new Scanner(System.in);
			for(int i =0;i<3;i++) {
			System.out.println("Digite um palavra para ser editada");
		       String palavraPor = input.nextLine();
		       if(words.contains(palavraPor) ) {
		    	   System.out.println("Digite ");
		    	   
		    	   
		    	   
		    	  
		       }
		       
		       }
		       
		       
		}
			
			public static void excluir() {
				Scanner input = new Scanner(System.in);
				for(int i = 0;i<3;i++) {
				System.out.println("Selecione uma palavra para excluir");
				if (words.contains(input.nextLine())) {
					words.remove(i);
				}
				
				
			}
			
		
		
		
		}	
		
		
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

