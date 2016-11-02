package com.android4dev.navigationview;

import java.util.List;

/**
 * Created by Arpit Singhal on 10/25/2016.
 */

public class TestJson {


    /**
     * restaurant : {"R":{"res_id":17956972},"apikey":"cc5b9f3ad0c0575f1227c608b4c3d557","id":"17956972","name":"Al Rashida's","url":"https://www.zomato.com/ncr/al-rashidas-zakir-nagar-new-delhi?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","location":{"address":"Shop 2, Gali 12, Zakir Nagar, New Delhi","locality":"Zakir Nagar","city":"New Delhi","city_id":1,"latitude":"28.6257890000","longitude":"77.2102760000","zipcode":"","country_id":1},"cuisines":"Mughlai, Lucknowi","average_cost_for_two":250,"price_range":1,"currency":"Rs.","offers":[],"thumb":"https://b.zmtcdn.com/data/pictures/2/17956972/4cabef2dbe0d7c51a6a94a1a86573af2_featured_v2.jpg","user_rating":{"aggregate_rating":"0","rating_text":"Not rated","rating_color":"CBCBC8","votes":"1"},"photos_url":"https://www.zomato.com/ncr/al-rashidas-zakir-nagar-new-delhi/photos#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","menu_url":"https://www.zomato.com/ncr/al-rashidas-zakir-nagar-new-delhi/menu#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","featured_image":"https://b.zmtcdn.com/data/pictures/2/17956972/4cabef2dbe0d7c51a6a94a1a86573af2.jpg","has_online_delivery":0,"is_delivering_now":0,"deeplink":"zomato://restaurant/17956972","has_table_booking":0,"events_url":"https://www.zomato.com/ncr/al-rashidas-zakir-nagar-new-delhi/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1","establishment_types":[]}
     */

    private List<RestaurantsBean> restaurants;

    public List<RestaurantsBean> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<RestaurantsBean> restaurants) {
        this.restaurants = restaurants;
    }

    public static class RestaurantsBean {
        /**
         * R : {"res_id":17956972}
         * apikey : cc5b9f3ad0c0575f1227c608b4c3d557
         * id : 17956972
         * name : Al Rashida's
         * url : https://www.zomato.com/ncr/al-rashidas-zakir-nagar-new-delhi?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
         * location : {"address":"Shop 2, Gali 12, Zakir Nagar, New Delhi","locality":"Zakir Nagar","city":"New Delhi","city_id":1,"latitude":"28.6257890000","longitude":"77.2102760000","zipcode":"","country_id":1}
         * cuisines : Mughlai, Lucknowi
         * average_cost_for_two : 250
         * price_range : 1
         * currency : Rs.
         * offers : []
         * thumb : https://b.zmtcdn.com/data/pictures/2/17956972/4cabef2dbe0d7c51a6a94a1a86573af2_featured_v2.jpg
         * user_rating : {"aggregate_rating":"0","rating_text":"Not rated","rating_color":"CBCBC8","votes":"1"}
         * photos_url : https://www.zomato.com/ncr/al-rashidas-zakir-nagar-new-delhi/photos#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
         * menu_url : https://www.zomato.com/ncr/al-rashidas-zakir-nagar-new-delhi/menu#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
         * featured_image : https://b.zmtcdn.com/data/pictures/2/17956972/4cabef2dbe0d7c51a6a94a1a86573af2.jpg
         * has_online_delivery : 0
         * is_delivering_now : 0
         * deeplink : zomato://restaurant/17956972
         * has_table_booking : 0
         * events_url : https://www.zomato.com/ncr/al-rashidas-zakir-nagar-new-delhi/events#tabtop?utm_source=api_basic_user&utm_medium=api&utm_campaign=v2.1
         * establishment_types : []
         */

        private RestaurantBean restaurant;

        public RestaurantBean getRestaurant() {
            return restaurant;
        }

        public void setRestaurant(RestaurantBean restaurant) {
            this.restaurant = restaurant;
        }

        public static class RestaurantBean {
            /**
             * res_id : 17956972
             */

            private RBean R;
            private String apikey;
            private String id;
            private String name;
            private String url;
            /**
             * address : Shop 2, Gali 12, Zakir Nagar, New Delhi
             * locality : Zakir Nagar
             * city : New Delhi
             * city_id : 1
             * latitude : 28.6257890000
             * longitude : 77.2102760000
             * zipcode :
             * country_id : 1
             */

            private LocationBean location;
            private String cuisines;
            private int average_cost_for_two;
            private int price_range;
            private String currency;
            private String thumb;
            /**
             * aggregate_rating : 0
             * rating_text : Not rated
             * rating_color : CBCBC8
             * votes : 1
             */

            private UserRatingBean user_rating;
            private String photos_url;
            private String menu_url;
            private String featured_image;
            private int has_online_delivery;
            private int is_delivering_now;
            private String deeplink;
            private int has_table_booking;
            private String events_url;
            private List<?> offers;
            private List<?> establishment_types;

            public RBean getR() {
                return R;
            }

            public void setR(RBean R) {
                this.R = R;
            }

            public String getApikey() {
                return apikey;
            }

            public void setApikey(String apikey) {
                this.apikey = apikey;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public String getCuisines() {
                return cuisines;
            }

            public void setCuisines(String cuisines) {
                this.cuisines = cuisines;
            }

            public int getAverage_cost_for_two() {
                return average_cost_for_two;
            }

            public void setAverage_cost_for_two(int average_cost_for_two) {
                this.average_cost_for_two = average_cost_for_two;
            }

            public int getPrice_range() {
                return price_range;
            }

            public void setPrice_range(int price_range) {
                this.price_range = price_range;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }

            public UserRatingBean getUser_rating() {
                return user_rating;
            }

            public void setUser_rating(UserRatingBean user_rating) {
                this.user_rating = user_rating;
            }

            public String getPhotos_url() {
                return photos_url;
            }

            public void setPhotos_url(String photos_url) {
                this.photos_url = photos_url;
            }

            public String getMenu_url() {
                return menu_url;
            }

            public void setMenu_url(String menu_url) {
                this.menu_url = menu_url;
            }

            public String getFeatured_image() {
                return featured_image;
            }

            public void setFeatured_image(String featured_image) {
                this.featured_image = featured_image;
            }

            public int getHas_online_delivery() {
                return has_online_delivery;
            }

            public void setHas_online_delivery(int has_online_delivery) {
                this.has_online_delivery = has_online_delivery;
            }

            public int getIs_delivering_now() {
                return is_delivering_now;
            }

            public void setIs_delivering_now(int is_delivering_now) {
                this.is_delivering_now = is_delivering_now;
            }

            public String getDeeplink() {
                return deeplink;
            }

            public void setDeeplink(String deeplink) {
                this.deeplink = deeplink;
            }

            public int getHas_table_booking() {
                return has_table_booking;
            }

            public void setHas_table_booking(int has_table_booking) {
                this.has_table_booking = has_table_booking;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public List<?> getOffers() {
                return offers;
            }

            public void setOffers(List<?> offers) {
                this.offers = offers;
            }

            public List<?> getEstablishment_types() {
                return establishment_types;
            }

            public void setEstablishment_types(List<?> establishment_types) {
                this.establishment_types = establishment_types;
            }

            public static class RBean {
                private int res_id;

                public int getRes_id() {
                    return res_id;
                }

                public void setRes_id(int res_id) {
                    this.res_id = res_id;
                }
            }

            public static class LocationBean {
                private String address;
                private String locality;
                private String city;
                private int city_id;
                private String latitude;
                private String longitude;
                private String zipcode;
                private int country_id;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getLocality() {
                    return locality;
                }

                public void setLocality(String locality) {
                    this.locality = locality;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public int getCity_id() {
                    return city_id;
                }

                public void setCity_id(int city_id) {
                    this.city_id = city_id;
                }

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }

                public String getZipcode() {
                    return zipcode;
                }

                public void setZipcode(String zipcode) {
                    this.zipcode = zipcode;
                }

                public int getCountry_id() {
                    return country_id;
                }

                public void setCountry_id(int country_id) {
                    this.country_id = country_id;
                }
            }

            public static class UserRatingBean {
                private String aggregate_rating;
                private String rating_text;
                private String rating_color;
                private String votes;

                public String getAggregate_rating() {
                    return aggregate_rating;
                }

                public void setAggregate_rating(String aggregate_rating) {
                    this.aggregate_rating = aggregate_rating;
                }

                public String getRating_text() {
                    return rating_text;
                }

                public void setRating_text(String rating_text) {
                    this.rating_text = rating_text;
                }

                public String getRating_color() {
                    return rating_color;
                }

                public void setRating_color(String rating_color) {
                    this.rating_color = rating_color;
                }

                public String getVotes() {
                    return votes;
                }

                public void setVotes(String votes) {
                    this.votes = votes;
                }
            }
        }
    }
}
