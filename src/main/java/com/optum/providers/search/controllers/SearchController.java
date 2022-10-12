package com.optum.providers.search.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.optum.providers.search.services.SearchService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SearchController {
 
    @Autowired
    SearchService searchService;
    
}
