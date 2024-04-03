package project.first.audiometrysimulator;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import husaynhakeem.com.aboutpage.AboutPage;
import husaynhakeem.com.aboutpage.Item;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        var page = new AboutPage(this)
                .setDescription(R.string.description)
                .setImage(R.drawable.icon)
                .addEmail("23BCS10607@cuchd.in")
                .addGithub("ErrorxCode/EarAcuity")
                .addItem(new Item("Version : 2.0",R.drawable.ic_verified,null))
                .create();

        setContentView(page);


    }
}