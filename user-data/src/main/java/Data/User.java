package Data;

public abstract class User {

    private static Long count = 1L;
    private Long id = count;
    private String name;

    User(String name){
        this.name = name;
        ++count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
