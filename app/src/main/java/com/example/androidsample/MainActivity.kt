package com.example.androidsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidsample.ui.theme.AndroidSampleTheme
import android.view.View
import com.example.androidsample.databinding.ActivityMainBinding
// 실행되지는 않고 View Binding으로 마이그레이션 하라는 가이드가 나온다.
// The 'kotlin-android-extensions' Gradle plugin is no longer supported. Please use this migration guide (https://goo.gle/kotlin-android-extensions-deprecation) to start working with View Binding (https://developer.android.com/topic/libraries/view-binding) and the 'kotlin-parcelize' plugin.
class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun convertCurrency(view: View) {
        if (binding.dollarText.text.isNotEmpty()) {
            val dollarValue = binding.dollarText.text.toString().toFloat()
            val euroValue = dollarValue * 0.85f
            binding.textView.text = euroValue.toString()
        } else {
            binding.textView.text = getString(R.string.no_value_string)
        }
    }
}