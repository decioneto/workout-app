package com.example.workout_app.Activity;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.workout_app.Domain.Lession;
import com.example.workout_app.Domain.Workout;
import com.example.workout_app.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    public ArrayList<Workout> getData() {
        ArrayList<Workout> list = new ArrayList<>();

        list.add(new Workout("Morning Yoga", "A relaxing yoga session to start your day.", "pic_1", 250, "1h", getLessions_1()));
        list.add(new Workout("HIIT Workout", "High-intensity interval training to burn calories fast.", "pic_2", 500, "45 min", getLessions_2()));
        list.add(new Workout("Strength Training", "Build muscle and strength with this weight training session.", "pic_3", 400, "1h 30 min", getLessions_3()));

        return list;
    }

    private ArrayList<Lession> getLessions_1() {
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1", "00:00", "Abc123Xyz89", "pic_1_1"));
        list.add(new Lession("Lession 2", "00:10", "Def456Yza01", "pic_1_2"));
        list.add(new Lession("Lession 3", "00:15", "Ghi789Bcd23", "pic_1_3"));
        list.add(new Lession("Lession 4", "00:20", "Jkl012Mno34", "pic_1_4"));

        return list;
    }

    private ArrayList<Lession> getLessions_2() {
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1", "00:00", "Pqr345Stu56", "pic_2_1"));
        list.add(new Lession("Lession 2", "00:10", "Vwx678Yza78", "pic_2_2"));
        list.add(new Lession("Lession 3", "00:15", "Bcd901Efg12", "pic_2_3"));
        list.add(new Lession("Lession 4", "00:20", "Hij234Klm45", "pic_2_4"));

        return list;
    }

    private ArrayList<Lession> getLessions_3() {
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("Lession 1", "00:00", "Nop567Qrs89", "pic_3_1"));
        list.add(new Lession("Lession 2", "00:10", "Tuv890Wxy67", "pic_3_2"));
        list.add(new Lession("Lession 3", "00:15", "Ghi789Bcd23", "pic_3_3"));
        list.add(new Lession("Lession 4", "00:20", "Jkl012Mno34", "pic_3_4"));

        return list;
    }
}