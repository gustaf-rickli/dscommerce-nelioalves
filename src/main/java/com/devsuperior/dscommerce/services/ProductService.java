package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // esta annotation Transactional nao ira dar lock completo no banco de dados, apenas lock de leitura
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
         return new ProductDTO(productRepository.findById(id).get());
    }




}
