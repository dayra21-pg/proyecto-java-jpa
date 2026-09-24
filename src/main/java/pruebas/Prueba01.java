package pruebas;

import java.util.List;

import dao.RolDAO;
import dao.RolDAOImplement;
import model.Rol;

public class Prueba01 {

	public static void main(String[] args) {
		RolDAO rol= new RolDAOImplement();
		List<Rol>lista = rol.findAll();
		for(Rol r:lista) {
			System.out.println(r.getId());
			System.out.println(r.getRolName());
			System.out.println(r.getRolStatus());
			System.out.println(r.getRolStatus());
		}
		
	}

}
