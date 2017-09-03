package com.kotlinFirst

import spark.Spark.*

fun main(args: Array<String>) {
    get("/haha/:par") { req, res -> "Gasteva ${req.params("par")} ${req.queryParams("second")}" }
    get ("/lala") {req2, resp2 -> "Nu chto"  }
}