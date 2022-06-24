package crud.pedro.basico.menu;
import crud.pedro.basico.modelos.*;

public class ListarAlunosReprovados extends ListarAlunos {

	@Override
	public String getDescricao() {
		return "Listar alunos reprovados";
	}

	@Override
	public boolean deveImprimir(Aluno aluno) {
		return !aluno.passou();
	}

}