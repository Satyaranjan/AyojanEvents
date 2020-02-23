package com.satyasoft.ayojanevents.activity.pojo

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * Created by anupamchugh on 09/01/17.
 */
class MultipleResource {
    @SerializedName("page")
    var page: Int? = null
    @SerializedName("per_page")
    var perPage: Int? = null
    @SerializedName("total")
    var total: Int? = null
    @SerializedName("total_pages")
    var totalPages: Int? = null
    @SerializedName("data")
    var data: List<Datum> =
        ArrayList()

    inner class Datum {
        @SerializedName("id")
        var id: Int? = null
        @SerializedName("name")
        var name: String? = null
        @SerializedName("year")
        var year: Int? = null
        @SerializedName("pantone_value")
        var pantoneValue: String? = null
    }
}