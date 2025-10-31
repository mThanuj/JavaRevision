class IdNotFoundException extends Exception {

    IdNotFoundException(String message) {
        super(message);
    }

}

class User {
    private Integer id;
    private String name;

    User() {

    }

    User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    boolean checkId(Integer id) throws IdNotFoundException {
        if (id == null) {
            throw new IdNotFoundException("Id not given");
        }

        return this.id.equals(id);
    }

}

public class ExceptionHandling {

    static void main() {

        User user = new User(1, "Thanuj");

        try {
            user.checkId(null);
        } catch (IdNotFoundException exception) {
            exception.printStackTrace();
        }

    }

}
