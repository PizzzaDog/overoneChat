package by.overoneChat.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Conversation {
    @Id
    private int id;

//    @OneToMany
//    private List<MyUser> users;
}
