import java.util.Scanner;
import java.text.SimpleDateFormat;
public interface On_Time_for_the_Exam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hours_exam = Integer.parseInt(scan.nextLine());
        int minute_exam = Integer.parseInt(scan.nextLine());
        int hour_arrival = Integer.parseInt(scan.nextLine());
        int minute_arrival = Integer.parseInt(scan.nextLine());
        String late = "Late";
        String onTime = "On time";
        String early = "Early";

        int exam_time = (hours_exam * 60 ) + minute_exam;
        int arrival_time = (hour_arrival * 60) + minute_arrival;
        int total_time =  arrival_time - exam_time;
        String spristigna = late;

        if(total_time < -30){

            spristigna = early;

        }
        else if(total_time <= 0){

            spristigna = onTime;
        }
        String results = "";
        if (total_time != 0 ){

            int hour_difference
                    = Math.abs(total_time / 60);
            int minute_difference = Math.abs(total_time % 60);

            if (hour_difference > 0){
                results = String.format("%d:%02d hours", hour_difference,minute_difference);

            }
            else{
                results = minute_difference + " minutes";
            }
            if (total_time < 0){
                results += " before the start";

            }
            else {

                results +=" after the start";
            }
        }
        System.out.println(spristigna);
        if(!results.isEmpty()){
            System.out.println(results);
        }
    }
}


