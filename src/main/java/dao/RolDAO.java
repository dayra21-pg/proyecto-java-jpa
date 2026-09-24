package dao;
import model.Rol;
import java.util.List;

public interface RolDAO {
	
	public void create(Rol rol);
	public void updtad(Rol rol);
	public void delete(int id);
	public Rol find(int id);
	public List<Rol> findAll();
}
