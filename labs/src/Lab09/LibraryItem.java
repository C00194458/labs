public class LibraryItem {
    private String type;
    private String ID;

    public LibraryItem(String type, String ID) {
        setType(type);
        setID(ID);
    }

    // setters and getters
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getID() {
        return ID;
    }
}
