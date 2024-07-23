package com.gamerSync.gamerSync.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import java.util.Objects;

@Entity
@Table(name = Friend.TABLE_NAME)
public class Friend {
    public interface Getuser {
    }

    public interface GetAllUser {
    }

    public static final String TABLE_NAME = "friend";

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // like auto_increment
    private Long id;

    @Column(name = "username", length = 45, nullable = true, unique = true)
    @Size(min = 2, max = 100)
    private String username;

    @Column(name = "avatar", length = 1000, nullable = true)
    private String avatar;

    @Column(name = "language", length = 45, nullable = true, unique = false)
    @Size(min = 2, max = 100)
    private String language;

    @Column(name = "online", length = 45, nullable = true, unique = false)
    private Boolean online;

    @Column(name = "playing", length = 45, nullable = true, unique = false)
    private String playing;
    @Column(name = "user_id", length = 45, nullable = true, unique = false)
    private Long user_id;

    public Friend() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Users))
            return false;
        Friend users = (Friend) obj;
        return Objects.equals(id, users.id) && Objects.equals(username, users.username) &&
                Objects.equals(language, users.language) && Objects.equals(online, users.online)
                && Objects.equals(playing, users.playing);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int results = 1;
        results = prime * results + ((id == null) ? 0 : id.hashCode());
        return results;
    }

    public Friend(Long id, String username, String language, Boolean online, String playing, Long user_id, String avatar) {
        this.id = id;
        this.username = username;
        this.language = language;
        this.online = online;
        this.playing = playing;
        this.user_id = user_id;
        this.avatar = avatar;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean isOnline() {
        return this.online;
    }

    public Boolean getOnline() {
        return this.online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public String getPlaying() {
        return this.playing;
    }

    public void setPlaying(String playing) {
        this.playing = playing;
    }
    public Long getUser_id() {
        return this.user_id;
    }

    public Long setUser_id(Long user_id) {
        return this.user_id = user_id;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String setAvatar(String avatar) {
        return this.avatar = avatar;
    }
}
