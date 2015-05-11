/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.dao;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
<<<<<<< HEAD

//implementação da interface
public class AlunoDaoImp implements InterfaceAlunoDaoImp{
        private File arquivo = new File("ListaAluno.txt");
	private ArrayList<Aluno> lista = new ArrayList<Aluno>();
	private String nome;
	private String cpf;
	private Aluno aluno;
		
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	Iterator<Aluno> it;
        
        public ArrayList<Aluno> ler() throws IOException{
		if(arquivo.exists() == false){
			arquivo.createNewFile();
			return lista;//vai retornar lista de alunos
		}
		fr = new FileReader (arquivo);
		br = new BufferedReader (fr);//joga os dados na memória, ler do arquivo
		while (br.ready()){
			nome = br.readLine();
			cpf = br.readLine();
			inserir(nome, cpf);
		}
		br.close();
		fr.close();
		return lista; 
	}
        
        public ArrayList<Aluno> getLista() {
		return lista;
	}
        
        public Aluno verificar (String cpf){//verifica se o cpf ta salvo na lista de alunos
		if (lista.isEmpty() == true) return null;
	 
		it = lista.iterator(); 
		while (it.hasNext()) {  
			Aluno aux = it.next();  
		    if (aux.getCpf().equals(cpf)){  
		        return aux;
		   }  
		}
		return null;
	}
        
        public void inserir (String nome, String cpf){//inserir os alunos na lista em execução
		aluno = new Aluno(nome, cpf);
		lista.add(aluno);
	}
        
        
        //Salva um aluno no arquivo ListaAluno.
        public boolean salvar(Aluno aluno) throws IOException{
		if (aluno == null) return false;
		fw = new FileWriter(arquivo, true);
		bw = new BufferedWriter (fw);
		bw.write(aluno.getNome());
		bw.newLine();
		bw.write(aluno.getCpf());
		bw.newLine();
		bw.close();
		fw.close();
		return true;
	}
        
        public boolean salvar(ArrayList<Aluno> lista) throws IOException{//Pega os alunos da lista e vai salvando no arquivo
		if (lista.isEmpty() == true) return false;
		fw = new FileWriter(arquivo);
		it = lista.iterator();
		while (it.hasNext()){
			salvar(it.next());
		}
		return true;
	}
}

  
=======
public class AlunoDaoImp implements InterfaceAlunoDao{
    
    private List<Aluno> listaAluno;
    
    public AlunoDaoImp(){
        this.listaAluno = new ArrayList<Aluno>();
        
    }
   
    @Override
    public void salvar(Aluno aluno) {
        this.listaAluno.add(aluno);
    }

    public List<Aluno> obterTodos() {
        return this.listaAluno;
    }
    
    @Override
    public Aluno pesquisar(Aluno aluno) {
        return this.listaAluno.get(this.listaAluno.index0f(aluno));
    }
    
    
    
}

//método pra tratar arquivo deve ser privado
//ordenar collections.sor(listaAluno());
>>>>>>> parent of 431350f... ParteAmanda3
