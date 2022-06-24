package crud.pedro.basico.menu;

import crud.pedro.basico.dao.Dao;
import crud.pedro.basico.dao.DaoArrayList;
import crud.pedro.basico.io.Leitor;



public abstract class ItemDeMenu {
	
	protected Leitor leitor;
	protected Dao dao;
	
	public ItemDeMenu() {
		leitor = new Leitor();
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();

	public abstract boolean executar();

}