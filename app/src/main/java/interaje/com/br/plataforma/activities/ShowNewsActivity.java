package interaje.com.br.plataforma.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import interaje.com.br.plataforma.R;
import interaje.com.br.plataforma.models.News;
import interaje.com.br.plataforma.utils.FakeNews;

public class ShowNewsActivity extends AppCompatActivity {

    private News news;
    private TextView tvTitle, tvCourse, tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_news);

        ActionBar bar = getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);

        if (getIntent().hasExtra("id_list")) {
            Integer idList = getIntent().getIntExtra("id_list", 46666);
            if (idList != 46666) {
                news = FakeNews.getFakeList().get(idList);
            }
        }

        tvTitle = (TextView) findViewById(R.id.tv_newsTitle);
        tvCourse = (TextView) findViewById(R.id.tv_newsCourse);
        tvMessage = (TextView) findViewById(R.id.tv_newsMessage);

        tvTitle.setText(news.getTitle());
        tvCourse.setText(news.getCourse());
        tvMessage.setText(news.getMessage());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case android.R.id.home: {
                startActivity(new Intent(ShowNewsActivity.this, MainActivity.class));
                finish();
            }
        }
        return true;
    }
}
