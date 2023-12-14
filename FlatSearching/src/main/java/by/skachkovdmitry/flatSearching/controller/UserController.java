package by.skachkovdmitry.flatSearching.controller;


import by.skachkovdmitry.flatSearching.core.dto.UserRegistration;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

//    private final IUserService userService;
//
//    public UserController(IUserService userService) {
//        this.userService = userService;
//    }



    @PostMapping("/registration")
    public ResponseEntity<?> registration(@RequestBody UserRegistration userRegistration) throws Exception {


//        //todo make by cycle
//        try {
//            userService.save(userRegistration);
//        } catch (Response e) {
//            if (e.getType() == ErrorType.FOUR){
//                return new ResponseEntity<>(new ResponseExceptionDTO(e.getMessage()), HttpStatus.BAD_GATEWAY);
//            } else if (e.getType() == ErrorType.FOUR){
//                return new ResponseEntity<>(new ResponseExceptionDTO(e.getMessage()), HttpStatus.BAD_GATEWAY);
//            }
//        }
        throw new Exception("hi");


//        return new ResponseEntity<>("Пользователь зарегистрирован", HttpStatus.ACCEPTED);
    }




//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody UserLogin userLogin) {
//        try {
//            userService.login(userLogin);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//                return new ResponseEntity<>(new ResponseExceptionDTO(e.getMessage(), e.), HttpStatus.BAD_REQUEST);
//        } catch (Exception e){
//            return new ResponseEntity<>(new Response(e.getMessage()) , HttpStatus.BAD_GATEWAY);
//        }
//    }

//    @GetMapping("/verification")
//    public ResponseEntity<?> verify(@RequestParam(name = "code") String code,
//                                    @RequestParam(name = "mail") String mail) {
//
//    }

}
