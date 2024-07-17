package uz.yasindev.foodapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import uz.yasindev.foodapp.databinding.ActivityLearnBinding


class LearnActivity : AppCompatActivity() {

    private var binding: ActivityLearnBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLearnBinding.inflate(layoutInflater)

        setContentView(binding!!.root)


        loadData()
        backButton()


    }


    private fun loadData() {
        val learnData = LearnData.learnData()
        val id = intent.getStringExtra("ID")

        for (i in 0..<LearnData.learnData.size) {
            if (id?.toInt() == learnData[i].id) {

                binding!!.youtubePlayerView.addYouTubePlayerListener(object :
                    AbstractYouTubePlayerListener() {
                    override fun onReady(youTubePlayer: YouTubePlayer) {
                        val videoId = learnData[i].video
                        youTubePlayer.cueVideo(videoId, 0f)
                    }
                })

                binding!!.receipName.text = "Receip For ${learnData[i].name}"
                binding!!.receips.text = learnData[i].recipes
                binding!!.dishName.text = learnData[i].name
            }
        }

    }

    private fun backButton() {
        binding!!.backButton.setOnClickListener {
            finish()
        }
    }

}
