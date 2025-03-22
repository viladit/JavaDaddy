package step5_AdvancedBase.topic4_Enums.task5_Operation.solution;

public enum Operation {
    PLUS {
        @Override
        public double apply(double x, double y) {return x + y;}
    },
    MINUS {
        @Override
        public double apply(double x, double y) {return x - y;}
    },
    TIMES {
        @Override
        public double apply(double x, double y) {return x * y;}
    },
    DIVIDE {
        @Override
        public double apply(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException();
            } else {
                return x / y;
            }
        }
    };

    public abstract double apply(double x, double y);
}
