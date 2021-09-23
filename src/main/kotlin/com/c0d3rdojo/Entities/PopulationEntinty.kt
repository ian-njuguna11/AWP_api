package com.c0d3rdojo.Entities

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object PopulationEntity: Table<Nothing>("population"){
    val id = int("id").primaryKey()
    val Outpatient = varchar("Outpatient")
    val Constituency = varchar("Constituency")
}