package com.example.myapplication

import android.graphics.Color

enum class WeightStatus(val value: String, val color: Int) {
    UNDERWEIGHT("Underweight", Color.BLACK),
    HEALTHY_WEIGHT("Healthy Weight", Color.BLACK),
    OVERWEIGHT("Overweight", Color.BLACK),
    OBESITY("Obesity", Color.BLACK)
}