package com.rightmove.property.data.client.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Objects;
import java.util.Set;

@JsonDeserialize(builder = PropertyDataDTO.Builder.class)
public class PropertyDataDTO {

    private final Set<Property> properties;

    public PropertyDataDTO(Set<Property> properties) {
        this.properties = properties;
    }

    public Set<Property> getProperties() {
        return properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyDataDTO that = (PropertyDataDTO) o;
        return Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }


    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {
        private Set<Property> properties;

        private Builder() {
        }

        public static Builder aPropertyDataDTO() {
            return new Builder();
        }

        public Builder properties(Set<Property> properties) {
            this.properties = properties;
            return this;
        }

        public PropertyDataDTO build() {
            return new PropertyDataDTO(properties);
        }
    }
}
