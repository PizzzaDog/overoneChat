package by.overoneChat.entity;

import by.overoneChat.res.MaritalStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class PersonalInfo {

    @Id
    private Long id;

    private String about;

    private MaritalStatus status;

}
