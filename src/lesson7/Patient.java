package lesson7;

class Patient {
    public TreatmentPlan healingCode;
    String name;
    TreatmentPlan treatmentPlan;
    Doctor doctor;

    public Patient(String name) {
        this.name = name;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}

