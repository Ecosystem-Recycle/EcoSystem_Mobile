package com.example.ecosystem_mobile.apis

import android.telecom.Call
import com.example.ecosystem_mobile.models.Login
import org.json.JSONObject
import java.util.*

interface EndpointInterface {
    @POST("login")
    fun login(@Body usuario: Login) : Call<JsonObject>

    @GET("usuarios/{idUsuario}")
    fun buscarUsuarioPorId(@Path(value = "idUsuario", encoded = true)
                           idUsuario: UUID
    ) : Call<JsonObject>
}

annotation class Body

annotation class POST(val value: String)

annotation class GET(val value: String)
