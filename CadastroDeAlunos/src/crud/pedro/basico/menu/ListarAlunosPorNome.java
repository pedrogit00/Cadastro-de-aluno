package crud.pedro.basico.menu;
import crud.pedro.basico.modelos.*;

public class ListarAlunosPorNome extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos (ordem alfab�tica)";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return true;
	}

}