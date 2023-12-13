package by.skachkovdmitry.flatSearching.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class UserEntity {

    @Id
    private String uuid;
    private int dtCreate;
    private int dtUpdate;
    private String fio;
    private String mail;
    private String role;
    private String status;

    private String password;

    public UserEntity() {
    }

    public UserEntity(String uuid, int dtCreate, int dtUpdate, String fio, String mail, String role, String status, String password) {
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.fio = fio;
        this.mail = mail;
        this.role = role;
        this.status = status;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity that)) return false;
        return dtCreate == that.dtCreate && dtUpdate == that.dtUpdate && Objects.equals(uuid, that.uuid) && Objects.equals(fio, that.fio) && Objects.equals(mail, that.mail) && Objects.equals(role, that.role) && Objects.equals(status, that.status) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, dtCreate, dtUpdate, fio, mail, role, status, password);
    }
}
