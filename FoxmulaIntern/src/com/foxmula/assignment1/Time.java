package com.foxmula.assignment1;

public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        FormatCorrectionSeconds();
        FormatCorrectionMinutes();
    }

    public void Add(Time timeParam){
        int totalHours, totalMinutes, totalSeconds;

        totalSeconds = this.seconds + timeParam.seconds;
        totalMinutes = this.minutes + timeParam.minutes;
        totalHours = this.hours + timeParam.hours;

        totalMinutes += totalSeconds / 60;
        totalSeconds %= 60;

        totalHours += totalMinutes / 60;
        totalMinutes %= 60;

        System.out.println(totalHours + " hours " + totalMinutes + " minutes " + totalSeconds + " seconds");
    }

    private void FormatCorrectionSeconds(){
        this.minutes += this.seconds / 60;
        this.seconds %= 60;
    }

    private void FormatCorrectionMinutes(){
        this.hours += this.minutes / 60;
        this.minutes %= 60;
    }
}
