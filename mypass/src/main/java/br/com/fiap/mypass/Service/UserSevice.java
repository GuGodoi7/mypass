package br.com.fiap.mypass.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.fiap.mypass.model.User;

import java.util.List;
@Service
public class UserSevice  {

    @Autowired
    UserRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;



    // GET - FINDALL
    public List<User> findAll(){
        return repository.findAll();
    }

    // POST -   CREATE
    public User create(User user){
        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );
        return repository.save(user);
    }

}
