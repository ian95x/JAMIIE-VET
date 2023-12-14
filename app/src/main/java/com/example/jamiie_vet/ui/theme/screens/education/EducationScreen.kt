import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jamiie_vet.R
import com.example.jamiie_vet.ui.theme.JamiiEvetTheme

@Composable
fun EducationScreen(navController: NavHostController) {
    val imageIds = listOf(
        R.drawable.vettwo,
        R.drawable.vetthree,
        R.drawable.vetfive,
        R.drawable.parrot,
        R.drawable.vetone,
        R.drawable.vetseven
    )

    val textValues = listOf(
        "Bunnies - they are very cute and delicate to take care of but totally worth it" +
                "for Bunny DO`S and DON`T i recommend you watch https://youtu.be/NhkAiiROfeI?si=yoH3EYQ3_v9GgY8s" +
                "for more tips about rabbits read https://www.vetcarepethospital.ca/beginners-guide-to-pet-rabbit-care/" +
                "for shedding tips and how to deal with that i recommend you watch https://youtube.com/shorts/Zx_Wx6TvrZk?si=0YpY_HIn_wo1xpUj",
        "Dogs - considered man`s best friend. Of late dogs have been used as emotional support animals and this has shown a significant decrease in mental health cases." +
                " for more info about training and becoming a better dog owner i recommend for advanced owners you watch https://youtu.be/ygKkrAaaxzs?si=AG-139kGGzKTfdCp" +
                "for first-time pet owners, I recommend you watch https://youtu.be/aE9nnAa2j2E?si=uW4a0XSf3nr-7r9Z" +
                "confused about choosing the right dog breed for you I recommend you watch https://youtu.be/YnsUwiFf7Ak?si=Rt3B1Xtd7SqULvpD",
        "Cats - they are some of the laziest pets we keep. it basically sleeps for most of the day." +
                "here are some tips to help you Familiarize Your Cat With the Litter Box\n" +
                "\n" +
                "As a cat owner, a litter box and plenty of fresh litter should be a priority, as should proper litter box training." +
                "CAT PLAYTIME As an experienced cat owner can tell you, cats need to be mentally stimulated. Fortunately, there are plenty of games you can play with your cat that can give them physical and mental exercise at the same time while helping the two of you bond.  " +
                "Top 20 common mistakes I recommend you watch https://youtu.be/lArwj8ELa10?si=zazRQrqyWcAk31SP",
        "Parrots - There are around 372 different parrot species.\n" +
                "\n" +
                "Most parrots live in tropical areas.\n" +
                "\n" +
                "Parrots have curved bills (beaks), strong legs and clawed feet.\n" +
                "\n" +
                "Parrots are often brightly coloured." +
                "Did you know Bird owners call themselves Avian humanoids" +
                "for more info watch https://youtu.be/t_Q7WMntlMo?si=Uzu_WBrl6WYbQ8ay",
        "Dogs and cats are two animals from different class species. Some of " +
                "the most frequently asked questions are;" +
                "1. Are Cats and dogs compatible?" +
                "2. How do Dogs view cats and so on." +
                "studies show that they actually get along depending on the aggressiveness of the animals" +
                "some studies show that  more dogs lick the cat (42.8%) and more cats ignore the dog (41.8%) than vice versa " +
                "However, most dogs and cats sleep at least occasionally (68.5%) and play together (62.4%)",
        "To get your daily news of pets visit https://www.dailypaws.com/" +
                "I wish you all the best as a pet owner for more info please visit your nearest local vet ",
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(imageIds.size) { index ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = imageIds[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .size(150.dp) // Adjust the size as needed
                        .clip(MaterialTheme.shapes.medium)
                        .background(MaterialTheme.colorScheme.primary)
                )

                Text(
                    text = textValues[index],
                    fontSize = 20.sp,
                    color = Color.Black,
                    lineHeight = 24.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 8.dp, start = 8.dp, end = 8.dp, bottom = 16.dp) // Add padding
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EducationScreenPreview() {
    JamiiEvetTheme {
        EducationScreen(navController = rememberNavController())
    }
}
