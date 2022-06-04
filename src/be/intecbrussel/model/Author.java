package be.intecbrussel.model;

public class Author {

    private String name;
    private String familyName;

    public Author(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
