package com.example.covidja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val m = Toast.makeText(applicationContext,"ห้าม username กับ passwordเหมือนกัน.",Toast.LENGTH_LONG)
        val n = Toast.makeText(applicationContext,"รหัสผ่านไม่ตรงกัน.",Toast.LENGTH_LONG)
        val o = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.",Toast.LENGTH_LONG)
        val p = Toast.makeText(applicationContext,"สมัครเสร็จสิ้น.",Toast.LENGTH_LONG)

        btOK.setOnClickListener(){
            if (this.name.text.toString() == "" || this.password.text.toString() == "" || this.confirm.text.toString() == ""){
                o.show()
            }
            else{
                if (this.name.text.toString() == this.password.text.toString() || this.name.text.toString() == this.password.text.toString()||
                        this.name.text.toString() == this.password.text.toString() && this.name.text.toString() == this.confirm.text.toString()){
                    m.show()
                }
                else
                    if (this.password.text.toString() == this.confirm.text.toString()){
                        p.show()
                    }
                    else{
                        n.show()
                    }
            }
        }

        btClear.setOnClickListener(){
            name.setText(null)
            password.setText(null)
            confirm.setText(null)
        }
    }
}