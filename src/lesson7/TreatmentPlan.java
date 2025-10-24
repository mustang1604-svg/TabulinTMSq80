package lesson7;

class TreatmentPlan {
    private int healingCode;
    private String planDescription;

    public TreatmentPlan(int treatmentCode, String planDescription) {
        this.healingCode = treatmentCode;
        this.planDescription = planDescription;
    }

    public int getTreatmentCode() {
        return healingCode;
    }

    public String getPlanDescription() {
        return planDescription;
    }
}