package me.androidbox.busbysocialrecipes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import me.androidbox.domain.RecipesInteractor


class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recipes = object: RecipesInteractor {
            override fun getRecipes() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }

        recipes.getRecipes()
    }
}
