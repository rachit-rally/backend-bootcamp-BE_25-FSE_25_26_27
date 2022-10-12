package com.optum.providers.search.repository;

import java.util.Collection;

import com.optum.providers.search.models.Provider;

public interface SearchRepository {
    public Collection<Provider> getProviders();
}
