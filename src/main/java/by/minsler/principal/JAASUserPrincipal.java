package by.minsler.principal;

import java.io.Serializable;
import java.security.Principal;

public class JAASUserPrincipal implements Principal, Serializable {

    private String name;

    public JAASUserPrincipal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JAASUserPrincipal that = (JAASUserPrincipal) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
