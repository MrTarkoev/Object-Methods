public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    @Override
    public String toString(){
        return this.name+" "+this.surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author otherAuthor = (Author) other;
        return this.name.equals(otherAuthor.getName()) && this.surname.equals(otherAuthor.getSurname());
    }
    @Override
    public int hashCode(){
        if(this.name!=null && this.surname!=null){
            return java.util.Objects.hash(this.name, this.surname);
        }
        return -1;
    }
}
