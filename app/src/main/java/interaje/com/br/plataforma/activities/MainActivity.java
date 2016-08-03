package interaje.com.br.plataforma.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        newsListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // Toast.makeText(MainActivity.this, "Clicou "+ position, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ShowNewsActivity.class);
                intent.putExtra("id_list", position);
                startActivity(intent);
                finish();
            }
        });
    }
}
