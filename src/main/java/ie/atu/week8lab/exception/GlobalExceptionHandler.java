package ie.atu.week8lab.exception;

<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException)

        Map<String, String> errors = new HashMap<>();

    for (FeildError feildError : ex.getBindingResult().getFeildErrors()) {
        String put = errors.put(feildError.getFeild(), feildError.getDefaultMessage());
    }
    
    return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
=======
public class GlobalExceptionHandler {
}
>>>>>>> week8lab5/master
