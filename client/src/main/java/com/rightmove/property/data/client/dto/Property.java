package com.rightmove.property.data.client.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Objects;

@JsonDeserialize(builder = Property.Builder.class)
public class Property {

    private final long id;
    private final long price;
    private final int bedrooms;
    private final Integer bathrooms;
    private final String number;
    private final String address;
    private final String region;
    private final String postcode;
    private final PropertyType propertyType;

    public Property(long id, long price, int bedrooms, Integer bathrooms, String number, String address, String region, String postcode, PropertyType propertyType) {
        this.id = id;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.number = number;
        this.address = address;
        this.region = region;
        this.postcode = postcode;
        this.propertyType = propertyType;
    }

    public long getId() {
        return id;
    }

    public long getPrice() {
        return price;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getRegion() {
        return region;
    }

    public String getPostcode() {
        return postcode;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property that = (Property) o;
        return id == that.id && price == that.price && bedrooms == that.bedrooms && Objects.equals(bathrooms, that.bathrooms) && Objects.equals(number, that.number) && Objects.equals(address, that.address) && Objects.equals(region, that.region) && Objects.equals(postcode, that.postcode) && propertyType == that.propertyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, bedrooms, bathrooms, number, address, region, postcode, propertyType);
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {
        private long id;
        private long price;
        private int bedrooms;
        private Integer bathrooms;
        private String number;
        private String address;
        private String region;
        private String postcode;
        private PropertyType propertyType;

        private Builder() {
        }

        public static Builder aProperty() {
            return new Builder();
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder price(long price) {
            this.price = price;
            return this;
        }

        public Builder bedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
            return this;
        }

        public Builder bathrooms(Integer bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }

        @JsonSetter(value = "houseNumber")
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public Builder postcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        @JsonSetter(value = "type")
        public Builder type(PropertyType propertyType) {
            this.propertyType = propertyType;
            return this;
        }

        public Property build() {
            return new Property(id, price, bedrooms, bathrooms, number, address, region, postcode, propertyType);
        }
    }
}
