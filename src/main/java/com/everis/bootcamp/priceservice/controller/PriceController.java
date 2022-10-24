package com.everis.bootcamp.priceservice.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.everis.bootcamp.priceservice.model.Prices;
import com.everis.bootcamp.priceservice.service.PriceService;

@RestController
@RequestMapping("/api")
public class PriceController {

	private PriceService priceService;

	public PriceController(PriceService priceService) {
		this.priceService = priceService;
	}

	// Petición de tipo GET para obtener el precio del elemento con el "id" especificado
	@GetMapping(path= "/get-price/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Prices getPrice(@PathVariable Integer id) {
		return priceService.get(id);
		
	}
	
	// Petición de tipo GET para obtener todos los precios
	@GetMapping(path="/get-all-prices", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Prices> getAllPrices() {
		return priceService.getAllPrices();
	}

}
