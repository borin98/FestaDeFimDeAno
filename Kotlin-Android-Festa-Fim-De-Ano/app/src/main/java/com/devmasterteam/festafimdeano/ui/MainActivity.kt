package com.devmasterteam.festafimdeano.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import com.devmasterteam.festafimdeano.R

class MainActivity : AppCompatActivity(), View.OnClickListener
{
    // tratamento do momento do click
    override fun onClick(v: View?)
    {

        val id = v?.id

        // estamos fazendo um tratamento de um caso geral no qual vemos se o id é o mesmo do botão clicado
        if ( id == R.id.button_confirm )
        {

            val intent = Intent(this, DetailsActivity::class.java)
            startActivity ( intent )

        }

    }

    private val mViewHolder : ViewHolder = ViewHolder()

    fun onCreat ( savedInstancesState: Bundle? )
    {

        super.onCreate ( savedInstancesState )
        // estamos procurando ids apenas presente na activity_main
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowCustomEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.mipmap.ic_launcher)

        // atribuindo os valores para a mViewHolder
        // fazendo o mapeamento por hash map
        mViewHolder.textToday = findViewById ( R.id.text_today ) as TextView
        mViewHolder.textDaysLeft = findViewById ( R.id.text_days_left) as TextView
        mViewHolder.buttonConfirm = findViewById ( R.id.button_confirm ) as Button

        // trocando a atividade do aplicativo quando clicado
        mViewHolder.buttonConfirm.setOnClickListener(this)

    }

    private class ViewHolder
    {
        // inicializando esta variável e indicando que iremos atribuir um valor para ela mais tarde
        lateinit var textToday : TextView
        lateinit var textDaysLeft : TextView
        lateinit var buttonConfirm : Button
    }

}