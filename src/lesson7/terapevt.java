package lesson7;

import java.util.Scanner;

public class terapevt {
    static class GeneralPractitioner extends Doctor {
        public GeneralPractitioner() {
            super("Терапевт");
        }

        // Метод назначения врача
        public void assignDoctor(Patient patient) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите план лечения-");
            int  treatmentCode= scanner.nextInt();

            if (treatmentCode == 1) {
                patient.doctor = new Surge();
                System.out.println("Пациенту назначен " + patient.doctor.specialization + ".");
            } else if (treatmentCode == 2) {
                patient.doctor = new dantist.Dentist();
                System.out.println("Пациенту назначен " + patient.doctor.specialization + ".");
            } else {
                patient.doctor = new GeneralPractitioner();
                System.out.println("Пациенту назначен " + patient.doctor.specialization + ".");
            }

            patient.doctor.treat(patient);
        }

        @Override
        void treat(Patient patient) {
            System.out.println(this.specialization + " осматривает пациента.");
            System.out.println("Назначает медикаментозное лечение.");

        }


    }
}
