package com.geekster.StockApp.controller;

import com.geekster.StockApp.model.Stock;
import com.geekster.StockApp.model.StockType;
import com.geekster.StockApp.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping("stocks")
    public List<Stock> getAllStocks(){
        return stockService.getAllStocks();
    }
    @PostMapping("stocks")
    public String addStocks(@RequestBody List<Stock> stockList){
        return stockService.addStocks(stockList);
    }
    @DeleteMapping("stock/{id}")
    public String stockDeleteById(@PathVariable Long id){
        return stockService.stockDeleteById(id);
    }
    @GetMapping("stock/type/{type}")
    public List<Stock> getStocksByTypePriceDescSorted(@PathVariable StockType type){
        return stockService.getStocksByTypePriceDescSorted(type);
    }
    @GetMapping("stock/timestamp/")
    public List<Stock> getStocksBirthTimeDesc(){
        return stockService.getStocksBirthTimeDesc();
    }

    @PutMapping("stock/type/{type}/increment/{hike}")
    public String updateStockByType(@PathVariable StockType type , @PathVariable Float hike){
         stockService.updateStocksByType(type,hike);
         return  "updated";
    }


}
