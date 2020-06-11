import java.util.ArrayList;
import java.util.List;

class Angle {
    int degrees;
    int minutes;
    int seconds;

    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Angle> angleList) {
        List<Integer> result = new ArrayList<>(); //node 1

        for (int i = 0; i < angleList.size(); i++) { //node 2
            int deg = angleList.get(i).getDegrees(); //node 3
            int min = angleList.get(i).getMinutes(); //node 3
            int sec = angleList.get(i).getSeconds(); //node 3
            if (deg >= 0 && deg < 360) { //node 4
                if (min < 0 || min > 59) //node 5 
                    throw new RuntimeException("The minutes of the angle are not valid!"); //node 6
                else {
                    if (sec < 0 || sec > 59) //node 7
                        throw new RuntimeException("The seconds of the angle are not valid"); //node 8
                    else
                        result.add(deg * 3600 + min * 60 + sec); //node 9
                }
            } else if (deg == 360) { //node 10
                if (min == 0 && sec == 0) //node 11
                    result.add(deg * 3600 + min * 60 + sec); //node 12
                else
                    throw new RuntimeException("The angle is greater then the maximum"); //node 13
            } else {
                throw new RuntimeException("The angle is smaller or greater then the minimum"); //node 14
            }
        }
        return result; //node 15

    }
}
