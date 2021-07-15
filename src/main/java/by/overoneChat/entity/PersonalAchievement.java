package by.overoneChat.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
public class PersonalAchievement {

    @Id
    private Long id;
    private String about;

    @ManyToOne(fetch = FetchType.EAGER)
    private MyUser owner;
}
