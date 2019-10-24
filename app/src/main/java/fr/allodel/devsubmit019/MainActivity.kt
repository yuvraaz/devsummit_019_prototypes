package fr.allodel.devsubmit019

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Context
import androidx.compose.unaryPlus
import androidx.ui.core.*
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.SimpleImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.graphics.imageFromResource
import androidx.ui.input.KeyboardType
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.surface.Card
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
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
    Column {
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
fun newStory() {
    //get image resource from the drawable
    val headeImage = +imageResource(R.drawable.header)

    //Using column for seperating the view into linear vertical
    // crossAxisSize = LayoutSize.Expand= MatchParent
    // modifier = Spacing(16.dp) = margin

    MaterialTheme {
        Column(crossAxisSize = LayoutSize.Expand, modifier = Spacing(16.dp)) {
            //I am going to add image on the top of image for that.
            //1. I have to set the container height to be 180 dp
            //2. container wideth must be expanded till the end of parent.
            //3. draw image inside the container
            Container(expanded = true, height = 180.dp) {
                //Lesson 3 : Clip function is responsible for rounding the shape
                //Shape is very essential component of material design.
                Clip(shape = RoundedCornerShape(4.dp)) {
                    DrawImage(image = headeImage)
                }

            }

            //Add a spacer to separate the graphic from the headings.
            HeightSpacer(height = 16.dp)

            //Lesson 1 : display text
            //Lesson 3 : Stylig texts , Apply material theme to style the text.
            /*   The most beautiful thing about material text theme is , Material text theme provided
        the bunch of text style guidelines so apply that to achieve required text style*/
            Text("The most beautiful thing about material text theme is , Material text theme provided the bunch of text style guidelines so apply that to achieve required text style",
                   maxLines = 2,overflow = TextOverflow.Ellipsis, style = (+themeTextStyle { h6 }).withOpacity(1f))
            Text("Davenport, California", style = (+themeTextStyle { body1 }).withOpacity(0.87f))
            Text("December 2018", style = (+themeTextStyle { body2 }).withOpacity(0.6f))

        }
    }
}


// New preview composable
@Preview
@Composable
fun DefaultPreview() {
    newStory()
}