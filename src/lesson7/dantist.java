package lesson7;

public class dantist {
    static class Dentist extends Doctor {
        public Dentist() {
            super("Дантист");
        }

        @Override
        void treat(Patient patient) {
            System.out.println(this.specialization + " осматривает пациента.");
            System.out.println("Проводит лечение зубов...");
        }
    }
}
