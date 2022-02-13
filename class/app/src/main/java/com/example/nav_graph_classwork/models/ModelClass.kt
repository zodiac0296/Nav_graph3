package com.example.nav_graph_classwork.models

import android.widget.ImageView
import java.io.Serializable

data class ModelClass(
    val image: String,
    val name: String,
    val description: String,
    val detailDescription: String
): Serializable
