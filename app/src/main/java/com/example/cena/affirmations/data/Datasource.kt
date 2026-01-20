package com.example.cena.affirmations.data

import com.example.cena.R
import com.example.cena.affirmations.models.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.img1),
            Affirmation(R.string.affirmation2, R.drawable.img2),
            Affirmation(R.string.affirmation3, R.drawable.img3),
            Affirmation(R.string.affirmation4, R.drawable.img4),
            Affirmation(R.string.affirmation5, R.drawable.img5),
            Affirmation(R.string.affirmation6, R.drawable.img6),
            Affirmation(R.string.affirmation7, R.drawable.img7),
            Affirmation(R.string.affirmation8, R.drawable.img8),
            Affirmation(R.string.affirmation9, R.drawable.img9),
            Affirmation(R.string.affirmation10, R.drawable.img10)
        )
    }
}
