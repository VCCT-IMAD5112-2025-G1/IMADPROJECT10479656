package za.co.varsitycollege.st10479656

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<TextView>(R.id.txt1)
        val editText = findViewById<EditText>(R.id.editTextText)
        val btn = findViewById<TextView>(R.id.button)

        val textView2 = findViewById<TextView>(R.id.textView2)
        val resetButton = findViewById<TextView>(R.id.resetButton)


        btn.setOnClickListener {
            val str = editText.text.toString()
            textView2.text = str

            val input = textView2.text.toString().trim() //get input from TextView

            when (input) {
                "morning" -> textView2.text = "Eggs or Waffles or Omlette or Cereal"
                "mid-morning" -> textView2.text = "Apple or Banana"
                "afternoon" -> textView2.text = "Fish and Chips or Bbq Wings"
                "afternoon snack" -> textView2.text = "Pizza Pie or Chicken and Mayo Sandwhich"
                "dinner" -> textView2.text = "Pasta or Beef Stew or Marcaroni or Noodles"
                "late snack" -> textView2.text = " Doritos or Ice Cream "
                else -> Toast.makeText(this, "ERROR! PLEASE TRY AGAIN", Toast.LENGTH_SHORT).show()
            }

        // reset button fun
        resetButton.setOnClickListener {
                 textView2.text ="" //clear the TextView
                editText.text.clear() //clear EditText
                Toast.makeText(this,"Reset Successful",Toast.LENGTH_SHORT).show()


            }


            }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

