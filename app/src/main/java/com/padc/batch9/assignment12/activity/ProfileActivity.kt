package com.padc.batch9.assignment12.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.api.load
import com.google.firebase.auth.FirebaseAuth
import com.padc.batch9.assignment12.R
import com.padc.batch9.assignment12.util.EMAIL
import com.padc.batch9.assignment12.util.IMAGE
import com.padc.batch9.assignment12.util.USERNAME
import com.padc.batch9.assignment12.util.Utils
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context, username:String?, email:String?, imageUrl:String?):Intent {
             var intent = Intent(context, ProfileActivity::class.java)
            intent.putExtra(USERNAME, username)
            intent.putExtra(EMAIL, email)
            intent.putExtra(IMAGE, imageUrl)
            return intent
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Utils.setStatusBarColor(this, R.color.textColorPrimaryLight)
        val username = intent.getStringExtra(USERNAME)
        val email = intent.getStringExtra(EMAIL)
        val imageUrl = intent.getStringExtra(IMAGE)
        username?.let {
            tvUsername.text = username
        }
        email?.let {
            tvEmail.text = email
        }
        imageUrl?.let {
            imgvUser.load(imageUrl) {
                crossfade(true)
                crossfade(2000)
            }
        }

        btnLogOut.setOnClickListener {
            signOut()
        }
    }

    private fun signOut() {
        startActivity(MainActivity.getLaunchIntent(this))
        FirebaseAuth.getInstance().signOut()
    }
}
