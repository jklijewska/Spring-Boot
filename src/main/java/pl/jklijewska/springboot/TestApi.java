package pl.jklijewska.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApi {

    @GetMapping
    public ResponseEntity<String> get(){

        return new ResponseEntity("Hello World", HttpStatus.OK);
    }

}
