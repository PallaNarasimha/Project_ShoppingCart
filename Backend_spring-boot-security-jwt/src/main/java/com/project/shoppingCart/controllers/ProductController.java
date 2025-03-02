package com.project.shoppingCart.controllers;

import com.project.shoppingCart.models.ProductEntity;
import com.project.shoppingCart.response.MessageResponse;
import com.project.shoppingCart.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 4800)
@RestController
@RequestMapping("/api/auth")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/saveProducts")
    public ResponseEntity<?> saveProducts(@RequestParam String filePath, @RequestParam String productName, @RequestParam Integer price)
            throws IOException {

        //Here filePath is using to get the images of products from local system & store into DB
        productService.saveProducts(filePath, productName, price);
        return ResponseEntity.ok(new MessageResponse("Successfully inserted the Products in DB"));
    }


    @GetMapping("/productlist")
    public ResponseEntity<List<ProductEntity>> userProducts() {

        return ResponseEntity.ok(productService.userProducts());
    }

}
