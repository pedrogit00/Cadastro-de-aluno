package crud.pedro.basico.menu;
import crud.pedro.basico.modelos.*;

public class ListarAlunosAprovados extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos aprovados";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return aluno.passou();
	}

}