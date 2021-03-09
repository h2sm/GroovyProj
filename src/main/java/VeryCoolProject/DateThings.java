package VeryCoolProject;

import java.util.Date;

public class DateThings implements HelloMXBean{
    private final Date date;
    public DateThings(){
        date = new Date();
    }

    @Override
    public String showDate() {
        return "Started at " + date.toString();
    }
}
