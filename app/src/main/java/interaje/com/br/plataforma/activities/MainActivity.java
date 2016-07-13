package interaje.com.br.plataforma.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import interaje.com.br.plataforma.R;
import interaje.com.br.plataforma.adapter.NewsAdapter;
import interaje.com.br.plataforma.utils.FakeNews;

public class MainActivity extends AppCompatActivity {

    ListView newsListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsListview = (ListView) findViewById(R.id.mainActivity_newsList);
        NewsAdapter adapter = new NewsAdapter(FakeNews.getFakeList(), MainActivity.this);
        newsListview.setAdapter(adapter);
    }
}
