package beans;

import java.math.BigInteger;

public class Calculator {

    public Calculator() {
    }

    private Address address;

    public BigInteger calculate(Integer n) {
        if (n < 0) throw new IllegalArgumentException("Unsupported negative value.");
        if (n==1)return BigInteger.ZERO;
        if (n==2)return BigInteger.ONE;

        BigInteger bigIntegerF1 = BigInteger.ZERO;
        BigInteger bigIntegerF2 = BigInteger.ONE;
        BigInteger tmpBigInteger;

        for (int i = 2 ; i <= n ; i++){
            tmpBigInteger = bigIntegerF2;
            bigIntegerF2 = bigIntegerF2.add(bigIntegerF1);
            bigIntegerF1 = tmpBigInteger;
        }

        return bigIntegerF2;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
