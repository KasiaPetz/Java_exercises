package stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList;

    public Forum( ) {
        this.userList = new ArrayList<>();
    }

    public List<ForumUser> getUserList() {
        return userList;
    }

}
