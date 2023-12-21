package org.softuni.mobilele.service;

import org.softuni.mobilele.model.dto.CreateOfferDto;

import java.util.UUID;

public interface OfferService {

    UUID createOffer(CreateOfferDto createOfferDto);
}
