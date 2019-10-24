package fr.allodel.devsubmit019

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Context
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.TextField
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.SimpleImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.graphics.imageFromResource
import androidx.ui.input.KeyboardType
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.themeColor
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             newStory()
        }
    }
}

 @Composable
fun Greeting(name: String) {
         Column{
             Text(text = "Hello $name!")
             TextField(value = "Type $name here")

    }
}
//
//@Preview
//@Composable
//fun GreetingPreview(){
//    MaterialTheme() {
//        Greeting(name = "Android")
//    }
//}


//New view component function
@Composable
fun newStory(){
    //get image resource from the drawable
    val headeImage = +imageResource(R.drawable.header)

    //Using column for seperating the view into linear vertical
    // crossAxisSize = LayoutSize.Expand= MatchParent
    // modifier = Spacing(16.dp) = margin

    Column (crossAxisSize = LayoutSize.Expand, modifier = Spacing(16.dp)){
        //I am going to add image on the top of image for that.
        //1. I have to set the container height to be 180 dp 
        //2. container wideth must be expanded till the end of parent.
        //3. draw image inside the container
        Container(expanded = true, height = 180.dp) {
            DrawImage(image = headeImage)
        }

        //Add a spacer to separate the graphic from the headings.
        HeightSpacer(height = 16.dp)


        Text("A day in Shark Fin Cove")
        Text("Davenport, California")
        Text("December 2018")
    }
}


// New preview composable
@Preview
@Composable
fun DefaultPreview(){
    newStory()
}