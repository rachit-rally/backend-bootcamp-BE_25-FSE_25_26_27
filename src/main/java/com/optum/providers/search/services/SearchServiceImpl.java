package com.optum.providers.search.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optum.providers.search.models.Provider;
import com.optum.providers.search.repository.SearchRepository;

@Service
public class SearchServiceImpl implements SearchService{
    
    @Autowired
    SearchRepository searchRepository;
    
    @Override
    public Collection<Provider> getProviders(String searchText) {
        
        return null;
    }
}
