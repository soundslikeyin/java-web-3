package com.yin.javaexercise3.controller;

//import com.yin.javaexercise3.service.SalesServiceImpl;
import com.yin.javaexercise3.data.entity.Sales;
import com.yin.javaexercise3.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;


@CrossOrigin( "*" )
@RestController
@RequestMapping("/sales")
public class SalesController {

//    Using Service
//    @Autowired
//    private SalesServiceImpl salesService;

//    public SalesController(@Autowired SalesServiceImpl salesService) {
//    public SalesController(SalesServiceImpl salesService) {
//        this.salesService = salesService;
//    }

//    Not using service
    @Autowired
    private final SalesRepository salesRepository;

    public SalesController(final SalesRepository salesRepository) { // is the final here necessary?
        this.salesRepository = salesRepository;
    }

    @GetMapping
    public Iterable<Sales> getAllSales() {
        return this.salesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Sales> getSaleById(@PathVariable("id") String id) {
        return this.salesRepository.findById(Integer.parseInt(id));
    }

    @PostMapping()
    public Sales createNewSale(@RequestBody Sales sale) {
        Sales newSale = this.salesRepository.save(sale);
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

//    public @ResponseBody Sales getSale(@PathVariable String id) {
//        Optional<Sales> sale = this.salesRepository.findById(Integer.parseInt(id));

//        if (!sale.isPresent()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The ID does not exist.");
//        }

//        return sale.get();
//        return salesService.getSale(Integer.parseInt(id)); // controller parses path variable into integer
//    }

}