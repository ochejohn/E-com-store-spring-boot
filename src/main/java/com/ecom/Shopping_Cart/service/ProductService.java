package com.ecom.Shopping_Cart.service;

import java.util.List;

import com.ecom.Shopping_Cart.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProducts();

    public Boolean deleteProduct(Integer id);

    public Product getProductById(Integer id);

    public Product updateProduct(Product product, MultipartFile file);
}
