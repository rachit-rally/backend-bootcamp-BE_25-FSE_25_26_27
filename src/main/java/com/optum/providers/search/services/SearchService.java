package com.optum.providers.search.services;

import java.util.Collection;

import com.optum.providers.search.models.Provider;

public interface SearchService {
    public Collection<Provider> getProviders(String searchText);
}

