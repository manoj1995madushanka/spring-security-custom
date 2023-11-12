package com.example.securingweb.customization;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class ModifiedUser extends User  {

    private final String nic;

    public ModifiedUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String nic) {
        super(username, password, authorities);
        this.nic = nic;
    }

    public String getNic() {
        return nic;
    }
}
