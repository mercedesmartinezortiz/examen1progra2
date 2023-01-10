import java.util.List;
import java.util.Scanner;

public class Persona implements IActividad {

	private Integer id;
	private String nombre;
	private Integer edad;
	private String sexo;
	private List<Persona> amigos;

	public List<Persona> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Persona> amigos) {
		this.amigos = amigos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Persona() {

	}

	@Override
	public void addAmigo() {
		try {
			Scanner leer = new Scanner(System.in);
			System.out.println(" <+> Por favor registra: ");
			int mmCodigo = 0;
			do {
				System.out.println("+ Codigo:");
				mmCodigo = leer.nextInt();
			} while (Utilitario.existeCodigo(amigos, mmCodigo));

			System.out.println("+ Nombre o nick :");

			String mmNick = leer.nextLine();
			System.out.println("+ Edad :");
			int mmEdad = leer.nextInt();
			System.out.println("+ Sexo :");
			String mmSexo = leer.nextLine();

			this.getAmigos().add(new Integrante(mmCodigo, mmNick));
		} catch (Exception e) {
			System.out.println(" error " + e.getMessage());
		}

	}

	@Override
	public void addAmigoDe() {
		try {
			Scanner leer = new Scanner(System.in);
			System.out.println("<+> Agrega un amigo a tu Amigo:");
			System.out.println("+ Cual es el ID de tu amigo:");
			int mmIDAmigo = leer.nextInt();
			
			System.out.println(" <+> Por favor registra: ");
			
			int mmCodigo = 0;
			do {
				System.out.println("+ Codigo:");
				mmCodigo = leer.nextInt();
			} while (Utilitario.existeCodigo(this.getAmigos(), mmCodigo));

			System.out.println("+ Nombre o nick :");
			String mmNick = leer.nextLine();
			System.out.println("+ Edad :");
			int mmEdad = leer.nextInt();
			System.out.println("+ Sexo :");
			String mmSexo = leer.nextLine();
			Persona amigo = Utilitario.buscarAmigo(this.getAmigos(), mmIDAmigo);
			if(amigo == null) {
				 System.out.println(": ( Lo sentimos.... no se ha encontrado a tu amigo");
				 return;
			}
			amigo.getAmigos().add(new Integrante(mmCodigo, mmNick));
			System.out.println("Se agrego al amigo de tu Amigo");
			
			
			

		} catch (Exception e) {
			System.out.println(" error " + e.getMessage());
		}

	}

	@Override
	public void showAmigos() {
		// TODO Auto-generated method stub

	}
}
