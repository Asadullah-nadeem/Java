package lecture.Real_code_Week.update;

import static lecture.Real_code_Week.update.Color.*;

class weather {
    public void upwe(int degrees){
        String dec;
        Color color;
        if (degrees < 10){
            dec = "cold";
            color = BLUE;
        }else if (degrees<25){
            dec =  "mild";
            color = ORANGE;
        }else {
            dec = "hot";
            color = RED;
        }
    }
}
