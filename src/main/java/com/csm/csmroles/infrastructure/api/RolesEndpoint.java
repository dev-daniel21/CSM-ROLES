package com.csm.csmroles.infrastructure.api;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/roles")
@RequiredArgsConstructor
@RestController
class RolesEndpoint {

    private final RolesService rolesService;

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    String getUserRole(@PathVariable("userId") String userId) {
        return rolesService.getUserRoles(userId);
    }

    @PostMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    String addUserRole(@PathVariable("userId") String userId, @RequestBody AddUserRoleRequest addUserRoleRequest) {
        return rolesService.addUserRole(addUserRoleRequest);
    }

    @PatchMapping("/{userId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void updateRole(@PathVariable("userId") String userId, @RequestBody UpdateRoleRequest updateRoleRequest) {
        rolesService.updateRole(updateRoleRequest);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteRole(@PathVariable("userId") String userId) {
        rolesService.deleteRole(userId);
    }
}
