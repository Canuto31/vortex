package com.test.vortex.controller;

import com.test.vortex.model.dto.VehicleDto;
import com.test.vortex.service.vehiculo.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoService service;
    @GetMapping()
    public ResponseEntity<List<VehicleDto>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/conductor/{id}")
    public ResponseEntity<List<VehicleDto>> getVehicleByDriver(@PathVariable("id") int idDriver) {
        return service.getVehicleByIdDriver(idDriver).map(order -> new ResponseEntity<>(order, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<VehicleDto> getDriverById(@PathVariable("id") int idVehicle) {
        return service.getVehicleById(idVehicle).map(driver -> new ResponseEntity<>(driver, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ResponseEntity<VehicleDto> saveDriver(@RequestBody VehicleDto vehicleDto) {
        return new ResponseEntity<>(service.save(vehicleDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDriver(@PathVariable("id") int idVehicle) {
        return new ResponseEntity<>(service.delete(idVehicle) ? "Deleted successfully" : "Not found",
                this.service.delete(idVehicle) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
