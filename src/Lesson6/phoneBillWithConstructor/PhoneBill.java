package Lesson6.phoneBillWithConstructor;

public class PhoneBill {
    private int spentGigabytes;
    private int basicCost;
    private int spentMinutes;
    private int spentSMS;
    private int callsAbroadZoneOne;
    private int callsAbroadZoneTwo;
    private double phoneBill;

    public PhoneBill(int basicCost, int spentGigabytes, int spentMinutes, int spentSMS, int callsAbroadZoneOne, int callsAbroadZoneTwo) {
        this.basicCost = basicCost;
        this.spentGigabytes = spentGigabytes;
        this.spentMinutes = spentMinutes;
        this.spentSMS = spentSMS;
        this.callsAbroadZoneOne = callsAbroadZoneOne;
        this.callsAbroadZoneTwo = callsAbroadZoneTwo;
        setPhoneBill((basicCost + ((internetCost() + callsCost() + SMSCost()
                + callsAbroadZoneOneCost() + callsAbroadZoneTwoCost()) * 1.07))) ;
    }

    public int getBasicCost() {
        return basicCost;
    }

    public void setBasicCost(int basicCost) {
        this.basicCost = basicCost;
    }

    public int getSpentGigabytes() {
        return spentGigabytes;
    }

    public void setSpentGigabytes(int spentGigabytes) {
        this.spentGigabytes = spentGigabytes;
    }

    public int getSpentMinutes() {
        return spentMinutes;
    }

    public void setSpentMinutes(int spentMinutes) {
        this.spentMinutes = spentMinutes;
    }

    public int getSpentSMS() {
        return spentSMS;
    }

    public void setSpentSMS(int spentSMS) {
        this.spentSMS = spentSMS;
    }

    public int getCallsAbroadZoneOne() {
        return callsAbroadZoneOne;
    }

    public void setCallsAbroadZoneOne(int callsAbroadZoneOne) {
        this.callsAbroadZoneOne = callsAbroadZoneOne;
    }

    public int getCallsAbroadZoneTwo() {
        return callsAbroadZoneTwo;
    }

    public void setCallsAbroadZoneTwo(int callsAbroadZoneTwo) {
        this.callsAbroadZoneTwo = callsAbroadZoneTwo;
    }

    public double getPhoneBill() {
        return phoneBill;
    }

    public void setPhoneBill(double phoneBill) {
        this.phoneBill = phoneBill;
    }

    double internetCost() {
        if (spentGigabytes > 8) {
            return (((spentGigabytes - 8) / 0.5) * 50);
        } else
            return 0;
    }

    double callsCost() {
        if (spentMinutes > 500) {
            return (((spentMinutes - 500) * 0.75) + 250);
        } else
            return (spentMinutes * 0.5);
    }

     double SMSCost() {
        if (spentSMS > 50) {
            return (((spentSMS - 50) * 1.5) + 50);
        } else
            return (spentSMS);
    }

    double callsAbroadZoneOneCost() {
        return (callsAbroadZoneOne * 1.5);
    }

    double callsAbroadZoneTwoCost() {
        return (callsAbroadZoneTwo * 2);
    }
}
