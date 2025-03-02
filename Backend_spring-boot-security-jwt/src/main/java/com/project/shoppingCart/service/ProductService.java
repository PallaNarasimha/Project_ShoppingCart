package com.project.shoppingCart.service;

import com.project.shoppingCart.models.ProductEntity;
import com.project.shoppingCart.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProducts(String filePath, String productName, Integer price) throws IOException {

        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            throw new IOException("File not found: " + filePath);
        }

        byte[] imageBytes = Files.readAllBytes(file.toPath());
        ProductEntity productEntity = new ProductEntity(imageBytes, productName, price);
        productRepository.save(productEntity);
    }

    public List<ProductEntity> userProducts() {

        return productRepository.findAll();
    }

}
