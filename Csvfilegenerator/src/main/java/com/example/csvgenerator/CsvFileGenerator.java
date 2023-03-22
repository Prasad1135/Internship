package com.example.csvgenerator;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Component;

import com.example.entity.Product;
import com.example.service.ProductService;
import com.example.service.impl.ProductServiceimpl;
@Component
public class CsvFileGenerator {
	public void writeProductToCsv(List<Product> products, Writer writer) {
		try {
			CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
			for (Product product : products) {
				printer.printRecord(product.getProduct_Id(),product.getProduct_Name(),product.getProduct_Price());
		}
		}
			 catch (IOException e) {
				 e.printStackTrace();
	}
}
}
