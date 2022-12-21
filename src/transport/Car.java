package transport;
import java.text.ParseException;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

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
    private String rubber;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, int regisNumber, int seatsNumber, String rubber) {
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
        if (rubber == null && rubber.isBlank()) {
            this.rubber = "зимняя";
        } else {
            this.rubber = rubber;
        }

    }

    public Car() {
        this.brand = "default";
        this.model = "default";
        this.color = "белый";
        this.country = "default";
        this.engineVolume = 1.5;
        this.year = 2000;
        this.transmission = "default";
        this.bodyType = "default";
        this.regisNumber = 123;
        this.seatsNumber = 2;
        this.rubber = "зимняя";
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка " + country + ", " + color + " цвет, объем двигателя - " + engineVolume + ", трансмиссия - " + transmission + ", кузов - " + bodyType + ", регистрационный номер: " + regisNumber + ", количество мест: " + seatsNumber + ", резина " + rubber;
    }

    // task 2
    private class Key {
        private final boolean remoteEngineStart = Boolean.parseBoolean("true");
        private final boolean keylessAccess = Boolean.parseBoolean("true");


        public Key(boolean remoteEngineStart, boolean keylessAccess) {
        }


    }

    public static class insurance {
        private LocalDate duration;
        private final int price;
        private int[] numInsurance = new int[9];
        int length = Array.getLength(numInsurance);

        public insurance(LocalDate duration, int price, int numInsurance) {

            if (duration == null) {
                this.duration = LocalDate.now();
            } else {
                this.duration = duration;
            }

            if (price == 0) {
                this.price = 15000;
            } else {
                this.price = price;
            }

//            if (numInsurance == 0 && numInsurance < length) {
//                System.out.println("Номер страховки некорректный!");
//            } else {
//                this.numInsurance = new int[]{numInsurance};
//            }
        }
//        public void time() throws ParseException {
//            Date date = new Date();
//            Calendar calendar = Calendar.getInstance();
//            calendar.setTime(date);
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            System.out.println(simpleDateFormat.format((date)));
//        }

        @Override
        public String toString() {
            return "insurance{" +
                    "duration=" + duration +
                    ", price=" + price +
                    ", numInsurance=" + Arrays.toString(numInsurance) +
                    '}';
        }

        public LocalDate getDuration() {
            return duration;
        }

        public int getPrice() {
            return price;
        }

        public int[] getNumInsurance() {
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
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getRegisNumber() {
        return regisNumber;
    }

    public void setRegisNumber(int regisNumber) {
        this.regisNumber = regisNumber;
    }

    public String getRubber() {
        return rubber;
    }

    public void setRubber(String rubber) {
        this.rubber = rubber;
    }

}

