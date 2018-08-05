/**
 * Classe criada que salva o que o usuário escolheu na opção se ele
 * vai ou não para a festa de fim de ano
 */

package com.devmasterteam.festafimdeano.util

// salvando os dados da confirmação do usuário
import android.content.Context

// estamos definindo que que a variável FimDeAno terá acesso privado
class SecurityPreferences( val context: Context )
{
    // definindo apenas uma chave relacionada com FimDeAno
    val mSharedPreferences = context.getSharedPreferences("FimDeAno", Context.MODE_PRIVATE)

    /**
     * Faz o Store da data
     * utilizando um map
     */
    fun storeString( key : String, value : String )
    {

        mSharedPreferences.edit().putString( key, value).apply()

    }

    /**
     * Pega o valor do Store do data
     * utlizando um map
     */
    fun getString ( key : String ) : String
    {

        return mSharedPreferences.getString(key, "" )

    }

}

