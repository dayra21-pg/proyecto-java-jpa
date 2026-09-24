package pruebas;

import java.util.List;

import dao.TrabajadorDAO;
import dao.TrabajadorDAOImplements;
import model.Trabajador;

public class PruebaTrabajador {

	public static void main(String[] args) {
		TrabajadorDAO trabajador= new TrabajadorDAOImplements();
		List<Trabajador>lista = trabajador.findAll();
		for(Trabajador t:lista) {
			System.out.println(t.getId());
			System.out.println(t.getNombre());
			System.out.println(t.getApellidos());
			System.out.println(t.getDni());
			System.out.println(t.getCodEmpleado());
			System.out.print(t.isEstadoActividad());
		}

	}

}
