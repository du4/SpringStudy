package beans;

public class CalcBean {
    private Double multiplier;
    private String value;
    private Boolean exp;
    private String elvis;
    private Boolean regexp;

    public Double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Double multiplier) {
        this.multiplier = multiplier;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getExp() {
        return exp;
    }

    public void setExp(Boolean exp) {
        this.exp = exp;
    }

    public String getElvis() {
        return elvis;
    }

    public void setElvis(String elvis) {
        this.elvis = elvis;
    }

    public Boolean getRegexp() {
        return regexp;
    }

    public void setRegexp(Boolean regexp) {
        this.regexp = regexp;
    }

    @Override
    public String toString() {
        return "CalcBean{" +
                "multiplier=" + multiplier +
                ", value='" + value + '\'' +
                ", exp=" + exp +
                ", elvis='" + elvis + '\'' +
                ", regexp=" + regexp +
                '}';
    }
}
