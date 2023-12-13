package by.skachkovdmitry.flatSearching.dao.api;

import by.skachkovdmitry.flatSearching.dao.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface IUserDao extends CrudRepository<UserEntity, String> {
    Optional<UserEntity> findByMailAndPassword(String mail, String password);
}
