package com.orgnization.sw.redis.user.session.model;

import java.io.Serializable;

public class UserSession implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String username;
    private String token;
    private String refreshToken;
    private String tokenGeneratedDateTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getTokenGeneratedDateTime() {
        return tokenGeneratedDateTime;
    }

    public void setTokenGeneratedDateTime(String tokenGeneratedDateTime) {
        this.tokenGeneratedDateTime = tokenGeneratedDateTime;
    }

    public UserSession(String id, String username, String token, String refreshToken, String tokenGeneratedDateTime) {
        this.id = id;
        this.username = username;
        this.token = token;
        this.refreshToken = refreshToken;
        this.tokenGeneratedDateTime = tokenGeneratedDateTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserSession{");
        sb.append("id='").append(id).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", token='").append(token).append('\'');
        sb.append(", refreshToken='").append(refreshToken).append('\'');
        sb.append(", tokenGeneratedDateTime='").append(tokenGeneratedDateTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
