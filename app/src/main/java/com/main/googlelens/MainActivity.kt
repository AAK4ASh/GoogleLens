import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.main.googlelens.BarCodeFragment
import com.main.googlelens.FaceDetectionFragment
import com.main.googlelens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.apply {
            imageCaptureButton.setOnClickListener{
                startActivity(Intent(this@MainActivity, BarCodeFragment::class.java))
            }
            videoCaptureButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, FaceDetectionFragment::class.java))
            }
        }
    }
}