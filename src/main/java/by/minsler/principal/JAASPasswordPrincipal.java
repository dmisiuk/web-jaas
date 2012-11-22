package by.minsler.principal;

import java.io.Serializable;
import java.security.Principal;

public class JAASPasswordPrincipal implements Principal, Serializable {

    private String name;

    public JAASPasswordPrincipal(String name) {
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

        JAASPasswordPrincipal that = (JAASPasswordPrincipal) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
