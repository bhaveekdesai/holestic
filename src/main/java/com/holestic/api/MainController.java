package com.holestic.api;

import com.holestic.service.SticManager;
import com.holestic.models.Location;
import com.holestic.models.Stic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private SticManager manager;

    @RequestMapping("/ping")
    public ResponseEntity<String> ping() {
        return new ResponseEntity<String>("pong", HttpStatus.OK);
    }

    @PutMapping("/report")
    public ResponseEntity<Boolean> report(@RequestBody Stic stic) {
        return new ResponseEntity<Boolean>(manager.report(stic), HttpStatus.OK);
    }

    @GetMapping("/scan")
    public List<Stic> scan(@RequestBody Location location) {
        return manager.scan(location);
    }
}
