package com.academy.LocalTeam1.model;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CommunityAdminManager")
public class CommunityManager {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name ="communityadminandmanagerid")
    private UUID id;

    @Column(name ="communityadminandmanagername", length = 20, nullable = false)
    private String name;

    @Column(name ="cognizantid", length = 20, nullable = false)
    private String cognizantId;

    @Column(name ="password", length = 20, nullable = false)
    private Long password;

    /*@Enumerated(value = EnumType.STRING)
    @Column(name ="roletype")
    private RoleType type*/

    @Column
    private boolean isActive;
}
