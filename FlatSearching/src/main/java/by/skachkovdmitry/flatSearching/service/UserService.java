package by.skachkovdmitry.flatSearching.service;

import by.dmitryskachkov.exception.Response;
import by.dmitryskachkov.exception.enumeration.ErrorType;
import by.dmitryskachkov.input_checking.Checking;
import by.dmitryskachkov.input_checking.RegistrationChecking;
import by.skachkovdmitry.flatSearching.core.dto.UserRegistration;

import by.skachkovdmitry.flatSearching.dao.api.IUserDao;
import by.skachkovdmitry.flatSearching.dao.entity.UserEntity;
import by.skachkovdmitry.flatSearching.service.api.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private final IUserDao userDao;

    private Checking checking = new RegistrationChecking();

    public UserService(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(UserRegistration userRegistration) throws Response {

        try {
            regInputChecking(userRegistration);

            UserEntity user = new UserEntity();
            user.setFio(userRegistration.getFio());
            user.setMail(userRegistration.getMail());
            user.setPassword(userRegistration.getPassword());

            userDao.save(user);
        } catch (Response e) {
            throw new Response(e.getMessage(), ErrorType.FOUR);
        } catch (Exception e) {
            throw new Response("Сервер не смог корректно обработать запрос. Пожалуйста обратитесь к администратору", ErrorType.FIVE);
        }
    }

//    @Override
//    public void login(UserLogin userLogin) throws Exception {
//
//        try {
//            Optional<UserEntity> userEntity = userDao.findByMailAndPassword(userLogin.getMail(), userLogin.getPassword());
//            if (userEntity.isEmpty()) {
//                throw new Response("Запрос содержит некорректные данные. Измените запрос и отправьте его ещё раз", ErrorType.FOUR);
//            }
//        } catch (Exception e) {
//            throw new Response("Сервер не смог корректно обработать запрос. Пожалуйста обратитесь к администратору", ErrorType.FIVE);
//        }
//    }


    private void regInputChecking(UserRegistration userRegistration) throws Response {
        if (checking.isGoodEmail(userRegistration.getMail())) {
            throw new Response("Запрос содержит некорректные данные. Измените запрос и отправьте его ещё раз (email)", ErrorType.FOUR);
        } else if (checking.isGoodPassword(userRegistration.getPassword())) {
            throw new Response("Запрос содержит некорректные данные. Измените запрос и отправьте его ещё раз (password)", ErrorType.FOUR);
        } else if (checking.isGoodFullName(userRegistration.getFio())) {
            throw new Response("Запрос содержит некорректные данные. Измените запрос и отправьте его ещё раз (fio)", ErrorType.FOUR);
        }
    }
}
