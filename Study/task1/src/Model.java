public class Model {

    private String partOne;
    private String partTwo;

    public String getPartOne() {
        return partOne;
    }

    public void setPartOne(String partOne) {
        this.partOne = partOne;
    }

    public String getPartTwo() {
        return partTwo;
    }

    public void setPartTwo(String partTwo) {
        this.partTwo = partTwo;
    }

    public String getGreeting(){
        return partOne + " " + partTwo;
    }


}
