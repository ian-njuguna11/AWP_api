package com.c0d3rdojo

import io.ktor.server.engine.*
//import io.ktor.server.netty.*
import com.c0d3rdojo.plugins.*
import io.ktor.server.tomcat.*
import org.ktorm.database.Database

fun main() {

//    val database = Database.connect (
//        "jdbc:mysql://localhost:3306/population",
//        user = "root",
//        password = ""
//    )

    embeddedServer(Tomcat, port = 8080, host = "0.0.0.0") {
        configureRouting()

    }.start(wait = true)
}
