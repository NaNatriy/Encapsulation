package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private int regisNumber;
    private final int seatsNumber;
    private boolean rubber;
    int month = 9;


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, int regisNumber, int seatsNumber) {
        if (brand == null && brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null && model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null && country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null && color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (transmission == null && transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null && bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (regisNumber == 0) {
            this.regisNumber = 123;
        } else {
            this.regisNumber = regisNumber;
        }
        if (seatsNumber == 0) {
            this.seatsNumber = 2;
        } else {
            this.seatsNumber = seatsNumber;
        }
        if (month == 1 || month == 2 || month == 12) {
            setRubber(true);
            //зимняя
        } else {
            setRubber(false);
            //летняя
        }

    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка " + country + ", " + color + " цвет, объем двигателя - " + engineVolume + ", трансмиссия - " + transmission + ", кузов - " + bodyType + ", регистрационный номер: " + regisNumber + ", количество мест: " + seatsNumber + ", резина " + rubber;
    }

    // task 2
    private class Key {
        private boolean remoteEngineStart = Boolean.parseBoolean("true");
        private boolean keylessAccess = Boolean.parseBoolean("false");


        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

    }

    public static class Insurance {
        private LocalDate duration;
        private final int price;
        private String numInsurance;
        int length = numInsurance.length();


        public Insurance(LocalDate duration, int price, String numInsurance) {


            if (duration == null && duration.isBefore(LocalDate.now())) {
                System.out.println("нужно срочно ехать оформлять новую страховку");
            } else {
                this.duration = duration;
            }

            if (price == 0) {
                this.price = 15000;
            } else {
                this.price = price;
            }

            if (length != 9) {
                System.out.println("Номер страховки некорректный!");
            } else {
                this.numInsurance = numInsurance;
            }


        }

        @Override
        public String toString() {
            return "insurance{" +
                    "duration=" + duration +
                    ", price=" + price +
                    ", numInsurance=" + (numInsurance) +
                    '}';
        }

        public LocalDate getDuration() {
            return duration;
        }

        public int getPrice() {
            return price;
        }

        public String getNumInsurance() {
            return numInsurance;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null && color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null && transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public int getRegisNumber() {
        return regisNumber;
    }

    public void setRegisNumber(int regisNumber) {
        if (regisNumber == 0) {
            this.regisNumber = 123;
        } else {
            this.regisNumber = regisNumber;
        }
    }

    public boolean getRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
        if (rubber == true) {
        } else {

        }
    }

}