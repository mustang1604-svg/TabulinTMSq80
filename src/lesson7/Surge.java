package lesson7;

    class Surge extends Doctor {
        public Surge() {
            super("Хирург");
        }

        @Override
        void treat(Patient patient) {
            System.out.println(this.specialization + " осматривает пациента.");
            System.out.println("Выполняет хирургическое вмешательство...");

        }
    }

