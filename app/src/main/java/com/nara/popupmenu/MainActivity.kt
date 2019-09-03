package com.nara.popupmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        action.setOnClickListener(){
            var popupMenu = PopupMenu(this,it)
            popupMenu.setOnMenuItemClickListener {item->
                when(item.itemId){
                    R.id.op1 -> {
                        Toast.makeText(this,"Kratos: [to Ares] The monster you created has returned... to kill you!",Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.op2 -> {
                        Toast.makeText(this,"Atreus: That was your father in Hel... Is this what it is to be a god? Is this how it always ends? Sons killing their mothers... their fathers? ",Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.op3 -> {
                        Toast.makeText(this,"Mimir: Your father won't let me go, Baldur, and he won't let you kill me. You have nothing to offer me. So take your questions, take your threats, take these two worthless wankers and piss off!",Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> {
                        false
                    }
                }
            }
            popupMenu.inflate(R.menu.my_menu)
            popupMenu.show()
        }
    }

}
