package com.spiderman.landlordcommunicationapp.service;

import com.spiderman.landlordcommunicationapp.models.Accommodation;
import com.spiderman.landlordcommunicationapp.models.User;
import com.spiderman.landlordcommunicationapp.repositories.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccommodationServiceImpl implements AccommodationService{
    private final AccommodationRepository accommodationRepository;

    @Autowired
    public AccommodationServiceImpl(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }


    @Override
    public List<Accommodation> getAllAccommodations() {
        return accommodationRepository.findAll();
    }

    @Override
    public List<Accommodation> getAllAccommodationsOfThisUser(User user) {

        return  accommodationRepository.findAll().stream()
                .filter(x -> x.getLandlord().equals(user)||x.getTenant().equals(user))
                .collect(Collectors.toList());
    }

    @Override
    public Accommodation save(Accommodation accommodation) {
        return accommodationRepository.save(accommodation);
    }

    @Override
    public Accommodation addTenantToThisAccommodation(Accommodation accommodation, User newTenant) {
        accommodation.setTenant(newTenant);
        return accommodation;
    }

    @Override
    public Accommodation removeTenantFromThisAccommodation(Accommodation accommodation) {
        accommodation.setTenant(null);
        return accommodation;
    }
}