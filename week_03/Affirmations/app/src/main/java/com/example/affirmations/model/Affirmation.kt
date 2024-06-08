package com.example.affirmations.model

data class Affirmation(val stringResourcesId: Int) {
    val stringResourceId: Int
        get() {
            return stringResourcesId
        }
}