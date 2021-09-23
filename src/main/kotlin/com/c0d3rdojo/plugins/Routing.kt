package com.c0d3rdojo.plugins

import awp_gen
import com.c0d3rdojo.Entities.PopulationEntity
import com.c0d3rdojo.Model.Population
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.serialization.*
import org.ktorm.database.Database
import org.ktorm.dsl.from
import org.ktorm.dsl.map
import org.ktorm.dsl.select


fun Application.configureRouting() {

    install(ContentNegotiation){
        json()
    }

    val database = Database.connect (
        "jdbc:mysql://localhost:3306/mydatabase",
        user = "root",
        password = ""
    )

    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/api_population"){
//            call.respond("Baringo Population")

            val population = database.from(PopulationEntity).select()
                .map {
//                    val id = it[PopulationEntity.id]
                    val outpatient = it[PopulationEntity.Outpatient]
                    val constituency = it[PopulationEntity.Constituency]

                    Population(outpatient ?: "",constituency?: "")
                }
            call.respond(population)
        }

        get("Awp_pdf"){
            awp_gen()
        }


    }

}
