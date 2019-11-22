package mm.com.mytel.assignment12.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mm.com.mytel.assignment12.R
import mm.com.mytel.assignment12.util.Utils

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Utils.setStatusBarColor(this, R.color.textColorPrimaryLight)
    }
}
