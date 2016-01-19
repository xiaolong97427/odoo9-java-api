package com.manexware.odoo.api.service;

import com.manexware.odoo.api.entity.product.Product;

public interface OdooProductService {

	public Product findProduct(String ean13);
}
