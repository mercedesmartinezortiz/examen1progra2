import java.util.List;

public class Utilitario {
    
    public static boolean existeCodigo(List<Persona> amigos, Integer id){
        for( Persona amigo : amigos){
            if (amigo.getId().equals(id)) {
                return true;
            }
        }
       
        return false;

    }

    public static Persona buscarAmigo(List<Persona> amigos, Integer id) {
        for (Persona amigo : amigos) {
            if (amigo.getId().equals(id)) {
                return amigo;
            }
        }

        return null;

    }
}
