package com.example.android.physicalhealthtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int foodScore = 0;
    int activityScore = 0;
    int waterScore = 0;
    int badhabitScore= 0;
    public int totalScore = foodScore + activityScore + waterScore + badhabitScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    /*
    FOOD BUTTONS
     */
    private void displayFood(int number) {
        TextView foodTextView = (TextView) findViewById(R.id.food_text_view);
        foodTextView.setText("" + number);
    }
    //Food + button, add one to food score
    public void addOneToFoodScore (View view) {
        foodScore = foodScore + 1;
        displayFood(foodScore);
    }
    //Food - button, remove one from food score
    public void removeOneFromFoodScore (View view) {
        foodScore = foodScore - 1;
        displayFood(foodScore);
    }
    /*
 ACTiVITY BUTTONS
  */
    private void displayActivity(int number) {
        TextView activityTextView = (TextView) findViewById(R.id.activity_text_view);
        activityTextView.setText("" + number);
    }
    //Activity + button, add one to activity score
    public void addOneToActivityScore (View view) {
        activityScore = activityScore + 1;
        displayActivity(activityScore);
    }
    //Activity - button, remove one from activity score
    public void removeOneFromActivityScore (View view) {
        activityScore = activityScore - 1;
        displayActivity(activityScore);
    }
    /*
WATER BUTTONS
 */
    private void displayWater(int number) {
        TextView waterTextView = (TextView) findViewById(R.id.water_text_view);
        waterTextView.setText("" + number);
    }
    //Water + button, add one to water score
    public void addOneToWaterScore (View view) {
        waterScore = waterScore + 1;
        displayWater(waterScore);
    }
    //Water - button, remove one from water score
    public void removeOneFromWaterScore (View view) {
        waterScore = waterScore - 1;
        displayWater(waterScore);
    }
    /*
    BAD HABITS BUTTONS
 */
    private void displayBadHabits(int number) {
        TextView waterTextView = (TextView) findViewById(R.id.badhabits_text_view);
        waterTextView.setText("" + number);
    }
    //Bad habits  + button, add one to water score
    public void addOneToBadHabitsScore (View view) {
        badhabitScore = badhabitScore + 1;
        displayBadHabits(badhabitScore);
    }
    //Bad Habits - button, remove one from water score
    public void removeOneFromBadHabitsScore (View view) {
        badhabitScore = badhabitScore - 1;
        displayBadHabits(badhabitScore);
    }
    /* INFO BUTTONS
     */
    private void displayMessage(String message) {
        TextView reportTextView = (TextView) findViewById(R.id.report_text_veiw);
        reportTextView.setText(message);}
    // displays info about how to track food points
    public void FoodInfo (View view) {
        String foodInfo = "If at least 2 out of 3 main meals of the day were healthy (includes vegetables, less fat etc.) press +, if not, press -";
        displayMessage(foodInfo);
    }
    // displays info about how to track activity points
    public void ActivityInfo (View view) {
        String activityInfo = "If you did any workout today, or achieved daily steps goal press +, if not, press -";
        displayMessage(activityInfo);
    }
    // displays info about how to track water points
    public void WaterInfo (View view){
        String waterInfo = "If you drank about 2 liters of water press +, if not, press -";
        displayMessage(waterInfo);
    }
    // displays info about how to track bad habits points
    public void BadHabitsInfo (View view) {
        String badhabitsInfo = "If you smoked today or had alcohol (more than one glass of wine or beer) press -if not press +";
        displayMessage(badhabitsInfo);
    }

    /* FINISH WEEK
     */
    private void displayScore(String message) {
        TextView reportTextView = (TextView) findViewById(R.id.report_text_veiw);
        reportTextView.setText(message);}

    public void FinishWeekReport (View view) {
        totalScore = foodScore + activityScore + waterScore + badhabitScore;
        if (totalScore <= 8) {
            displayScore("Very bad: You need to work on your health. Try setting small goals such as eating junk only once per week, adding healthy breakfast every day, smoking less, going for a walk, run or do sports");
        } else if (totalScore >= 9 && totalScore <17) {
            displayScore("Bad: You need to work more on your health, try to see where you have the most problems and try to change that part. Remember that you need to focus on more than one area to live healthy.");
        } else if (totalScore >= 17 && totalScore <21) {
            displayScore("Not bad: ...but could be better, keep trying, there are lots of benefits from eating healthy, drinking enough water, working out and reducing cigarettes and alcohol");
        } else if (totalScore >= 21 && totalScore <27) {
            displayScore("Good: You are doing good, there is still place to improve your lifestyle");
        } else  {
            displayScore("Perfect: Keep it up!");
        }
    }

    // RESTART week
    public void ResetScore (View view) {
        foodScore = 0;
        activityScore = 0;
        waterScore = 0;
        badhabitScore = 0;
        totalScore = 0;
        displayFood(foodScore);
        displayActivity(activityScore);
        displayWater(waterScore);
        displayBadHabits(badhabitScore);
        displayMessage("");
    }
}
