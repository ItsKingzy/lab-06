package com.example.listycity6;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Creates a new City.
     *
     * @param city the city name
     * @param province the province name
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Returns the name of the province.
     *
     * @return the province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Returns the name of the city.
     *
     * @param o the city object to compare
     * @return an integer (LT 0 if this city LT other city, =0 equal, GT 0 this city GT other city)
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Determines whether two City objects are equal if both their city and province names are the same.
     *
     * @param obj the City object to compare
     * @return true if the given object is a City with the same name and province as another City and province, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof City) {
            City other = (City) obj;
            return city.equals(other.city) && province.equals(other.province);
        }
        return false;
    }

}
