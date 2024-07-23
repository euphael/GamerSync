package com.gamerSync.gamerSync.services;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gamerSync.gamerSync.models.Users;
import com.gamerSync.gamerSync.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users findById(Long id) {
        Optional<Users> user = this.userRepository.findById(id);
        return user.orElseThrow(() -> new RuntimeException(
                "Usuario não encontrado! ID " + id + ", Tipo: " + Users.class.getName()));
    }

    public Users findByUsername(String username) {
        Optional<Users> user = Optional.ofNullable(this.userRepository.findByUsername(username));
        return user.orElseThrow(() -> new RuntimeException(
                "Usuario não encontrado! ID " + username + ", Tipo: " + Users.class.getName()));
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public Users createUser(Users obj) {
        obj.setId(null);
        obj.setPassword(obj.getPassword());
        obj = this.userRepository.save(obj);
        this.userRepository.save(obj);
        return obj;
    }

    @Transactional
    public Users updateUser(Users obj) {
        Users newObj = findById(obj.getId());
        newObj.setPassword(obj.getPassword());
        newObj.setName(obj.getName());
        newObj.setLanguage(obj.getLanguage());
        newObj.setGender(obj.getGender());
        newObj.setEmail(obj.getEmail());
        return this.userRepository.save(newObj);
    }

    public void delete(Long id) {
        findById(id);
        try {
            this.userRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Não é possível excluir pois há entidades relacionadas!");
        }
    }

    public Long countUsers() {
        Long total = this.userRepository.countUsers() ;
        return total;
    }

}
