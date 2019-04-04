public class InsuranceCalc {

    InsuranceStrategy strategy;
    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new InsuranceStrategyLow();
            return strategy.calculateInsurance(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyMedium();
            return  strategy.calculateInsurance(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyHigh();
            return  strategy.calculateInsurance(income);
        } else {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculateInsurance(income);
        }
    }
}
