package crud.pedro.basico.dao;

import crud.pedro.basico.modelos.Aluno;

import java.util.ArrayList;

public interface Dao {

	void inserir(Aluno aluno);

	ArrayList<Aluno> listar();

	Aluno pesquisar(String matricula);
	
	void atualizar(Aluno aluno);
	
	void remover(Aluno aluno);

}