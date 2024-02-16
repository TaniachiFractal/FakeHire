package maslovat.taniachifractal.fakehire

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import maslovat.taniachifractal.fakehire.databinding.ActivityMainBinding

lateinit var fld:ActivityMainBinding
class MainActivity : AppCompatActivity() {

    /// data
    private var fioS = ""
    private var ageS = ""
    private var phoneS = ""
    private var emailS = ""
    // 4 checkboxes about pets: cat dog mouse parrot
    private var petCheckBoxes = arrayOf(false, false, false, false)
    private var salaryVisible = false
    private var salaryS = ""
    /// data


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        fld=ActivityMainBinding.inflate(layoutInflater)
        setContentView(fld.root)

        fld.fio.setText(fioS)
        fld.age.setText(ageS)
        fld.phone.setText(phoneS)
        fld.email.setText(emailS)
        fld.cbCat.isChecked = petCheckBoxes[0]
        fld.cbDog.isChecked = petCheckBoxes[1]
        fld.cbMouse.isChecked = petCheckBoxes[2]
        fld.cbParrot.isChecked = petCheckBoxes[3]
        fld.salary.setText(salaryS)


        fld.rbForMoney.setOnClickListener{ showSalaryBox() }
        fld.rbForFree.setOnClickListener { hideSalaryBox() }


    }
    override fun onStop()
    {
        super.onStop()

        fioS = fld.fio.toString()
        ageS = fld.age.toString()
        phoneS = fld.phone.toString()
        emailS = fld.email.toString()
        petCheckBoxes[0] = fld.cbCat.isChecked
        petCheckBoxes[1] = fld.cbDog.isChecked
        petCheckBoxes[2] = fld.cbMouse.isChecked
        petCheckBoxes[3] = fld.cbParrot.isChecked
        salaryVisible = fld.salaryBox.isVisible
        salaryS = fld.salary.toString()
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