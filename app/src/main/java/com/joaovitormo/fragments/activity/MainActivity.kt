package com.joaovitormo.fragments.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import com.joaovitormo.fragments.R
import com.joaovitormo.fragments.fragment.ContatosFragment
import com.joaovitormo.fragments.fragment.ConversasFragment


class MainActivity : AppCompatActivity() {

    val conversasFragment = ConversasFragment
    val contatosFragment = ContatosFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonConversa: Button  = findViewById<Button>(R.id.buttonConversas)
        val buttonContato: Button = findViewById<Button>(R.id.buttonContatos)

        //remover sombra da ActionBar
        supportActionBar?.elevation = 0f

        //Load Fragment
        val conversasFragment = ConversasFragment()

        //Configurar o objeto
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameConteudo, conversasFragment)
        transaction.commit()

        buttonContato.setOnClickListener(){

            val contatosFragment = ContatosFragment()

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameConteudo, contatosFragment)
            transaction.commit()
        }

        buttonConversa.setOnClickListener(){
            val conversasFragment = ConversasFragment()

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameConteudo, conversasFragment)
            transaction.commit()
        }
    }
}