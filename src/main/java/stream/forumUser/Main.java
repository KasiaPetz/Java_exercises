package stream.forumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Forum forum = new Forum();

        forum.getUserList().add(new ForumUser(1, "Hałabała", 'M', 100, 50));
        forum.getUserList().add(new ForumUser(2, "Muminek", 'M', 150, 100));
        forum.getUserList().add(new ForumUser(3, "Włóczykij", 'M', 20, 100));
        forum.getUserList().add(new ForumUser(4, "Cypisek", 'M', 15, 10));
        forum.getUserList().add(new ForumUser(5, "Mała Mi", 'F', 150, 100));
        forum.getUserList().add(new ForumUser(6, "Tekla", 'F', 150, 100));

        Map<Integer, ForumUser> map = forum.getUserList().stream()
                .filter(n -> n.getSex() == 'M')
                .filter(n -> n.getBirthDate() < 20)
                .filter(n -> n.getQuantityOfposts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));   // dlaczego tak

        map.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);

    }
}
