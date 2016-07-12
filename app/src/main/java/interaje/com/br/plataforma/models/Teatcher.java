package interaje.com.br.plataforma.models;

/**
 * Created by rayquaza on 12/07/16.
 */
// Professor
public class Teatcher extends User {

    private final Role role;

    public Teatcher() {
        this.role = Role.TEATCHER;

    }
}
