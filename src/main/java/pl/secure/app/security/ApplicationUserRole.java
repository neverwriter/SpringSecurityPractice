package pl.secure.app.security;

import com.google.common.collect.Sets;
import lombok.Getter;

import java.util.Set;

import static pl.secure.app.security.ApplicationUserPermission.*;

@Getter
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
