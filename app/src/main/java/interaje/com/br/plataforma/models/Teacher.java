package interaje.com.br.plataforma.models;

/**
 * Created by rayquaza on 12/07/16.
 */
// Professor
public class Teacher extends User {

    private final Role role;

    public Teacher() {
        this.role = Role.TEATCHER;
    }
}
