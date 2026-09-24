package dao;

import java.util.List;

import model.Trabajador;

public interface TrabajadorDAO {
	public void create(Trabajador trabajador);
	public void edit(Trabajador trabajador);
	public void delete(int id);
	public Trabajador find(int id);
	public List<Trabajador> findAll();

}
