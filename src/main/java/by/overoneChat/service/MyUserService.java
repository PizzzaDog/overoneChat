package by.overoneChat.service;

import by.overoneChat.entity.MyUser;
import by.overoneChat.entity.Role;
import by.overoneChat.repository.MyUserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class MyUserService implements UserDetailsService {

    private final BCryptPasswordEncoder passwordEncoder;
    private final MyUserRepository userRepository;

    public MyUser createUser(MyUser user) {
        if (userRepository.existsByUsername(user.getUsername())) {
            //TODO Вернуть на страницу ошибки
            return null;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        user.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
        return userRepository.save(user);
    }

    public MyUser findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByUsername(username);
    }

    public List<MyUser> getAll() {
        return userRepository.findAll();
    }

}
