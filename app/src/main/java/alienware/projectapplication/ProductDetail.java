package alienware.projectapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ProductDetail extends AppCompatActivity {

    private RecyclerView recyclerView;

    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        ArrayList<Merchandise> itemList = new ArrayList<>();

        fillDummyData(itemList);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        itemAdapter = new ItemAdapter(itemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemAdapter);
    }

    private void fillDummyData(ArrayList<Merchandise> brandList) {
        Merchandise brand1 = new Merchandise();
        brand1.setName("Fire HD 8 Tablet with Alexa");
        brand1.setProductDescription("Fire HD 8, now with up to 12 hours of battery life, 2X the storage, and 50% more RAM for faster performance\n" +
                "Stunning 8\" HD display, a 1.3 GHz quad-core processor, and Dolby Audio. Available in four colors\n" +
                "Enjoy millions of movies, TV shows, songs, Kindle e-books, apps and games\n" +
                "16 or 32 GB of internal storage and a microSD slot for up to 200 GB of expandable storage");
        brand1.setProductPhotoLocation("https://images-na.ssl-images-amazon.com/images/I/41cBfKaDorL._AC_US218_.jpg");
        brandList.add(brand1);

        Merchandise brand2 = new Merchandise();
        brand2.setName("Amazon Fire TV | Streaming Media Player");
        brand2.setProductDescription("Amazon Fire TV supports 4K Ultra HD for true-to-life picture quality. Watch high-definition 1080p streams on Amazon Video, Netflix, YouTube, Hulu and more, even without a 4K TV.\n" +
                "Enjoy over 10,000 apps, games, and Alexa skills including access to over 300,000 TV episodes and movies on Netflix, Amazon Video, HBO NOW, Hulu, and more.\n" +
                "Includes 75% more processing power than the previous generation Amazon Fire TV, a dedicated graphics engine, better Wi-Fi support, 2 GB of memory, 8 GB of storage and expandable storage of up to 200 GB.");
        brand2.setProductPhotoLocation("https://images-na.ssl-images-amazon.com/images/I/31t3CwdjAXL._AC_US218_.jpg");
        brandList.add(brand2);

        Merchandise brand3 = new Merchandise();
        brand3.setName("Fire TV Stick with Alexa Voice Remote | Streaming Media Player");
        brand3.setProductDescription("The next generation of our bestselling Fire TV Stick. The most powerful streaming media stick under $50–now with the Alexa Voice Remote.\n" +
                "Enjoy over 10,000 apps, games, and Alexa skills including Netflix, Hulu, HBO NOW, YouTube, Amazon Video, NBC, WatchESPN, Disney, and more. Subscription fees may apply.\n" +
                "Find the best way to watch with universal search results from over 140 channels and apps including Netflix, Hulu, and Amazon Video.");
        brand3.setProductPhotoLocation("https://images-na.ssl-images-amazon.com/images/I/41vQqNH7zQL._AC_US218_.jpg");
        brandList.add(brand3);

        Merchandise brand4 = new Merchandise();
        brand4.setName("Fire Tablet with Alexa, 7-inch Display");
        brand4.setProductDescription("Beautiful 7\" IPS display and 1.3 GHz quad-core processor. Available in four colors.\n" +
                "Now with the Alexa cloud-based voice service - just press and ask\n" +
                "Enjoy millions of movies, TV shows, songs, Kindle e-books, apps and games\n" +
                "8 or 16 GB of internal storage and a microSD slot for up to 200 GB of expandable storage\n" +
                "Prime members get unlimited access to a huge selection of songs, books, videos and more\n" +
                "Up to 7 hours of battery life");
        brand4.setProductPhotoLocation("https://images-na.ssl-images-amazon.com/images/I/41FYkVPzrIL._AC_US218_.jpg");
        brandList.add(brand4);

        Merchandise brand5 = new Merchandise();
        brand5.setName("Amazon Fire TV Game Controller with Alexa");
        brand5.setProductDescription("Compatible with the all-new Fire TV Stick, previous generation Fire TV Stick and Amazon Fire TV.\n" +
                "Take gaming to the next level - Lets you play hundreds more games on Amazon Fire TV and Fire TV Stick than with the included remote\n" +
                "Ergonomic design - Fits naturally in your hands with precise and responsive controls so you can enjoy hours of wireless gaming\n" +
                "Instant voice search – simply speak into the controller to instantly find games, movies, and music, get information, and more");
        brand5.setProductPhotoLocation("https://images-na.ssl-images-amazon.com/images/I/41tcxFMkzwL._AC_US218_.jpg");
        brandList.add(brand5);

    }
}
