
package trabalhopoo.model.dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import trabalhopoo.model.pojo.Turma;

/**
 *
 * @author Klaus
 */

//implementação da interface
public class TurmaDaoImp implements InterfaceTurmaDaoImp{
        private File arquivo = new File("ListaTurma.txt");
	private ArrayList<Turma> lista = new ArrayList<Turma>();
	private int ano;
	private int periodo;
	private String local;
	private String horario;
	private int numero_de_vagas;
	private Turma turma;
		
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	Iterator<Turma> it;
        
        public ArrayList<Turma> ler() throws IOException{
		if(arquivo.exists() == false){
			arquivo.createNewFile();
			return lista;
		}
		fr = new FileReader (arquivo);
		br = new BufferedReader (fr);
		while (br.ready()){
			ano = br.read();
			periodo = br.read();
			local = br.readLine();
			horario = br.readLine();
			numero_de_vagas = br.read();
			inserir(ano, periodo, local, horario, numero_de_vagas);
		}
		br.close();
		fr.close();
		return lista; 
	}
        
        public ArrayList<Turma> getLista() {
		return lista;
	}
        
        //insere as turmas na lista em execução        
        public void inserir (int ano, int periodo, String local, 
                String horario, int numero_de_vagas){
		turma = new Turma(ano, periodo, local, horario, numero_de_vagas);
		lista.add(turma);
	}
        
        //Salva um aluno no arquivo ListaAluno.
        public boolean salvar(Turma turma) throws IOException{
		if (turma == null) return false;
		fw = new FileWriter(arquivo, true);
		bw = new BufferedWriter (fw);
		bw.write(turma.getAno());
		bw.newLine();
		bw.write(turma.getPeriodo());
		bw.newLine();
		bw.write(turma.getLocal());
		bw.newLine();
		bw.write(turma.getHorario());
		bw.newLine();
		bw.write(turma.getNumero_de_vagas());
		bw.newLine();		
		bw.close();
		fw.close();
		return true;
	}
        //Salva as turmas da lista no arquivo
        public boolean salvar(ArrayList<Turma> lista) throws IOException{
		if (lista.isEmpty() == true) return false;
		fw = new FileWriter(arquivo);
		it = lista.iterator();
		while (it.hasNext()){
			salvar(it.next());
		}
		return true;
	}
}
