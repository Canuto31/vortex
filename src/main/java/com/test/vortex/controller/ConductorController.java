package com.test.vortex.controller;

import com.test.vortex.model.dto.DriverDto;
import com.test.vortex.service.conductor.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conductor")
public class ConductorController {

    @Autowired
    private ConductorService service;

    @GetMapping()
    public ResponseEntity<List<DriverDto>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/identificacion/{identification}")
    public ResponseEntity<DriverDto> getDriverByIdentification(@PathVariable("identification") String identification) {
        return service.getDriverByIdentification(identification).map(driver -> new ResponseEntity<>(driver, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<DriverDto> getDriverById(@PathVariable("id") int idDriver) {
        return service.getDriverById(idDriver).map(driver -> new ResponseEntity<>(driver, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ResponseEntity<DriverDto> saveDriver(@RequestBody DriverDto driverDto) {
        return new ResponseEntity<>(service.save(driverDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDriver(@PathVariable("id") int idDriver) {
        return new ResponseEntity<>(service.delete(idDriver) ? "Deleted successfully" : "Not found",
                this.service.delete(idDriver) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
