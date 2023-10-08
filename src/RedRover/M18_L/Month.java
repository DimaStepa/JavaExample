package RedRover.M18_L;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int numOfDays;

    Month (int numOfDays){
        this.numOfDays = numOfDays;
    }

    public int getNumOfDays(){
        return numOfDays;
    }

}

//enum это неизменяемый список возможных экземпляров это класа, и
//каждый экземпляр существует в единственном числе