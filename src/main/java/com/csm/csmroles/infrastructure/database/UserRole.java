package com.csm.csmroles.infrastructure.database;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private AvailableUserRole assignedRole;

    @Column(name = "user_id")
    private String userId;

    public UserRole(String roleId, AvailableUserRole assignedRole, String userId) {
        this.roleId = roleId;
        this.assignedRole = assignedRole;
        this.userId = userId;
    }

}
