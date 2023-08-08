package com.test.vortex.controller;

import com.test.vortex.model.dto.VehicleDto;
import com.test.vortex.service.vehiculo.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoService service;

    @GetMapping()
    public ResponseEntity<List<VehicleDto>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/driver/{id}")
    public ResponseEntity<List<VehicleDto>> getVehicleByIdDriver(@PathVariable("id") int idDriver) {
        return service.getVehicleByIdDriver(idDriver).map(driver -> new ResponseEntity<>(driver, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{id}")
    public ResponseEntity<VehicleDto> getVehicleById(@PathVariable("id") int idVehicle) {
        return service.getVehicleById(idVehicle).map(driver -> new ResponseEntity<>(driver, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ResponseEntity<VehicleDto> saveVehicle(@RequestBody VehicleDto vehicleDto) {
        return new ResponseEntity<>(service.save(vehicleDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicle(@PathVariable("id") int idVehicle) {
        return new ResponseEntity<>(service.delete(idVehicle) ? "Deleted successfully" : "Not found",
                this.service.delete(idVehicle) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
