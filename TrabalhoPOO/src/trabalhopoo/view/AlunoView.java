/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

/**
 *
 * @author Amanda
 */
public class AlunoView {
    
    Dao<Aluno> dao;
    public AlunoView(Dao,dao){
        this.dao = dao;
    }
     
 
    public void cadastrar(){
        System.out.println("Cadastro de alunos");
        System.out.println("Informe o nome: ");
        //ler nome
        String nome = scan.nextLine();
        System.out.println("Infome o cpf: ");
        //ler cpf
        String cpf = scan.nextLine();
        Aluno aluno = new Aluno(nome,cpf);
        scan.close();
        
        
        dao.salvar(aluno);
    }
    
    public void listar(){
        List<Aluno> listaAluno = dao.obterTodos();
        
        for(Aluno aluno : listaAluno){
            System.out.println(aluno.getNome()+ " " + aluno.getCpf());
        }
        
    }
    public void pesquisar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o cpf:");
        
    }
}
