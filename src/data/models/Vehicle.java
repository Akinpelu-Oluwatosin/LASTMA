package data.models;



    public class Vehicle {
        private int id;
        private String name;
        private String model;
        private String color;
        private String phoneNumber;
        private Owner owner;

        public Vehicle(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }


        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Owner getOwner() {
            return owner;
        }

        public void setOwner(Owner owner) {

            this.owner = owner;
        }
    }

