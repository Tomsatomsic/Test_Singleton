package factory;


    public class Car   {
        private String engine;
        private String color;
        private String wheels;
        private  String name;

    private Car(carBuilder builder){
        this.engine = builder.engine;
        this.color = builder.color;
        this.wheels = builder.wheels;
        this.name = builder.name;
    }
        public String carDetails() {
            return "Your car " +
                    "Jmeno=' " + name + '\'' +
                    "Motor=' " + engine + '\'' +
                    ", Barva=' " + color + '\'' +
                    ", Kola=' " + wheels + '\'' ;

        }
    public static class carBuilder{
        private String engine;
        private String color;
        private String wheels;
        private String name;

        public carBuilder setEngine(String engine){
            this.engine =engine;
            return this;
        }
        public carBuilder setColor(String color){
            this.color =color;
            return this;
        }
        public carBuilder setWheels(String wheels){
            this.wheels =wheels;
            return this;
        }
        public carBuilder setName(String name){
            this.name =name;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
        public String getName(){
            return name;
        }



    }
        }

