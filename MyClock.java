import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyClock extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel dateLabel;
    JLabel timeLabel;
    JLabel dayLabel;
    String date;
    String time;
    String day;

    MyClock(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MyClockApp");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(true);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM - dd - yyyy ");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("MV Boli",Font.PLAIN,50));
        timeLabel.setForeground(Color.black);
        timeLabel.setBackground(Color.green);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        dayLabel.setForeground(Color.BLUE);
        dayLabel.setBackground(Color.CYAN);
        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana",Font.PLAIN,25));
        dateLabel.setForeground(Color.ORANGE);
        dateLabel.setBackground(Color.yellow);
        dateLabel.setOpaque(true);


        this.add(dateLabel);
        this.add(dayLabel);
        this.add(timeLabel);
        this.setVisible(true);

        setTime();
    }
    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try{
            Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
