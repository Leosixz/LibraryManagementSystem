package library;

public class Reader extends User {

    public Reader(String id, String name) {
        super(id, name);
    }

    @Override
    public String getRole() {
        return "Reader";
    }
}