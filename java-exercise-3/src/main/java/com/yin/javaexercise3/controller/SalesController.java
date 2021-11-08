package com.yin.javaexercise3.controller;

import com.yin.javaexercise3.service.SalesServiceImpl;
import com.yin.javaexercise3.data.entity.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin( "*" )
@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesServiceImpl salesService;

    public SalesController(SalesServiceImpl salesService) {
        this.salesService = salesService;
    }

    @GetMapping
    public Iterable<Sales> getAllSales() {
        return this.salesService.getAll();
    }

    @GetMapping("/{id}")
    public Sales getSaleById(@PathVariable("id") String id) {
        return this.salesService.getSale(Integer.parseInt(id));
    }

    @PostMapping()
    public Sales createNewSale(@RequestBody Sales sale) {
        Sales newSale = this.salesService.addSale(sale);
        return newSale;
    }

//    @PutMapping("/{id}")
//    public Sales updateSale(@PathVariable("id") Integer id, @RequestBody Sales s) {
//        Optional<Sales> saleToUpdateOptional = this.salesRepository.findById(id);
//        if (!saleToUpdateOptional.isPresent()) {
//            return null;
//        }
//        Sales saleToUpdate = saleToUpdateOptional.get();
//        if (s.getDescription() != null) {
//            saleToUpdate.setDescription(s.getDescription());
//        }
//        if (s.getQuantity() != null) {
//            saleToUpdate.setQuantity(s.getQuantity());
//        }
//        if (s.getName() != null) {
//            saleToUpdate.setName(s.getName());
//        }
//        if (p.getWateringFrequency() != null) {
//            plantToUpdate.setWateringFrequency(p.getWateringFrequency());
//        }
//        Plant updatedPlant = this.plantRepository.save(plantToUpdate);
//        return updatedPlant;
//    }
//
//    @DeleteMapping("/plants/{id}")
//    public Plant deletePlant(@PathVariable("id") Integer id) {
//        Optional<Plant> plantToDeleteOptional = this.plantRepository.findById(id);
//        if (!plantToDeleteOptional.isPresent()) {
//            return null;
//        }
//        Plant plantToDelete = plantToDeleteOptional.get();
//        this.plantRepository.delete(plantToDelete);
//        return plantToDelete;
//    }

}