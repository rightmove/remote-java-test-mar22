package com.rightmove.property.data.client;

import com.rightmove.property.data.client.dto.PropertyDataDTO;

import java.util.Optional;

public interface PropertyDataClient {
    Optional<PropertyDataDTO> getPropertyData();
}
