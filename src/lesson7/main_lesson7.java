package lesson7;
import java.util.Scanner;

public class main_lesson7 {

        public static void main(String[] args) {

            Patient patient1 = new Patient("Иван Иванов");


            TreatmentPlan plan1 = new TreatmentPlan(1, "Требуется хирургическое вмешательство");
            TreatmentPlan plan2 = new TreatmentPlan(2, "Требуется лечение зуба");
            TreatmentPlan plan3 = new TreatmentPlan(3, "Требуется общее обследование");


            patient1.setTreatmentPlan(plan2);


            terapevt.GeneralPractitioner therapist = new terapevt.GeneralPractitioner();


            therapist.assignDoctor(patient1);
        }
    }
