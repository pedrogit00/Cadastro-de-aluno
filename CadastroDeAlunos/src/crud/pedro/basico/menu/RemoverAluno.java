package crud.pedro.basico.menu;
import crud.pedro.basico.modelos.Aluno;

public class RemoverAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Remover aluno";
	}

	@Override
	public boolean executar() {
		String matricula = leitor.lerString("Matrícula: ");

		Aluno aluno = dao.pesquisar(matricula);

		if (aluno == null) {
			System.out.println("Aluno não encontrado!");
		}
		else {
			Aluno alunoParaRemover = new Aluno(matricula);

			dao.remover(alunoParaRemover);
		}

		return false;
	}

}