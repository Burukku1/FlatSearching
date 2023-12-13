package by.skachkovdmitry.flatSearching.core.dto;

import java.util.Objects;

public class User {
    private String uuid;
    private int dtCreate;
    private int dtUpdate;
    private String fio;
    private String mail;
    private String role;
    private String status;


    public User() {
    }

    public User(String uuid, int dtCreate, int dtUpdate, String fio, String mail, String role, String status) {
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.fio = fio;
        this.mail = mail;
        this.role = role;
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public int getDtCreate() {
        return dtCreate;
    }

    public int getDtUpdate() {
        return dtUpdate;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return dtCreate == user.dtCreate && dtUpdate == user.dtUpdate && Objects.equals(uuid, user.uuid) && Objects.equals(fio, user.fio) && Objects.equals(mail, user.mail) && Objects.equals(role, user.role) && Objects.equals(status, user.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, dtCreate, dtUpdate, fio, mail, role, status);
    }
}
