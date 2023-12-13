package by.skachkovdmitry.flatSearching.service.api;

import by.dmitryskachkov.exception.Response;
import by.skachkovdmitry.flatSearching.core.dto.UserLogin;
import by.skachkovdmitry.flatSearching.core.dto.UserRegistration;


public interface IUserService {
    void save(UserRegistration userRegistration) throws Response;

//    void login(UserLogin userLogin) throws Exception;


}
