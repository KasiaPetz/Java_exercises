package stream.forumUser;


public class ForumUser {
    private int id;
    private String name;
    private char sex;
    private int birthDate;
    private int quantityOfposts;

    public ForumUser(int id, String name, char sex, int birthDate, int quantityOfposts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.quantityOfposts = quantityOfposts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getQuantityOfposts() {
        return quantityOfposts;
    }

    public void setQuantityOfposts(int quantityOfposts) {
        this.quantityOfposts = quantityOfposts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", quantityOfposts=" + quantityOfposts +
                '}';
    }
}
