package maslovat.taniachifractal.fakehire

import android.R
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import maslovat.taniachifractal.fakehire.databinding.ActivityMainBinding

lateinit var fld:ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fld=ActivityMainBinding.inflate(layoutInflater)
        setContentView(fld.root)

        fld.rbForMoney.setOnClickListener{ showSalaryBox() }
        fld.rbForFree.setOnClickListener { hideSalaryBox() }
    }
    private fun showSalaryBox()
    {
        fld.salaryBox.isVisible=true
    }
    private fun hideSalaryBox()
    {
        fld.salaryBox.isVisible=false;
    }
}