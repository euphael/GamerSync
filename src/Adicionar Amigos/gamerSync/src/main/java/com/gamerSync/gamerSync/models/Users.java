package com.gamerSync.gamerSync.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import java.util.Objects;

@Entity
@Table(name = Users.TABLE_NAME)
public class Users {
    public interface Getuser {
    }

    public interface GetAllUser {
    }

    public static final String TABLE_NAME = "users";

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // like auto_increment
    private Long id;

    @Column(name = "avatar", length = 1000, nullable = true)
    private String avatar;

    @Column(name = "username", length = 45, nullable = true, unique = true)
    @Size(min = 2, max = 100)
    private String username;

    @Column(name = "language", length = 45, nullable = true, unique = false)
    private String language;

    @Column(name = "gender", length = 45, nullable = true, unique = false)
    private String gender;

    @Column(name = "email", length = 45, nullable = false, unique = true)
    private String email;

    @Column(name = "password", length = 60, nullable = false)
    @JsonProperty(access = Access.WRITE_ONLY)
    @Size(min = 8, max = 60)
    @NotBlank
    private String password;

    @Column(name = "userCount", length = 1000, nullable = true)
    private Long userCount;

    public Users() {
    }

    public Users(Long id, String username, String language, String gender, String email, String password,
            String avatar, Long userCount) {
        this.id = id;
        this.username = username;
        this.language = language;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.userCount = userCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Users))
            return false;
        Users users = (Users) obj;
        return Objects.equals(id, users.id) && Objects.equals(username, users.username) &&
                Objects.equals(language, users.language) && Objects.equals(gender, users.gender)
                && Objects.equals(email, users.email) && Objects.equals(password, users.password);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int results = 1;
        results = prime * results + ((id == null) ? 0 : id.hashCode());
        return results;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public String setAvatar(String avatar) {
        return this.avatar = avatar;
    }

    public Long getUserCount() {
        return userCount;
    }

    public Long setUserCount(Long userCount) {
        return this.userCount = userCount;
    }
}
