package HomeWorkSeminar2;

public class Parameter {
    double parameterSize;
    public Parameter(double parameterSize) {
        this.parameterSize = parameterSize;
    }

    public double getParameterSize() {
        return parameterSize;
    }

    @Override
    public String toString() {
        return "" + parameterSize;
    }
}
