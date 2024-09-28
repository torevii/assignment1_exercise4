import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.asd123.R

class FeedAdtr(private val feedPostList: List<Feed>) : RecyclerView.Adapter<FeedAdtr.PostViewHolder>() {

    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val feedImage: ImageView = itemView.findViewById(R.id.post_image)
        val feedCaption: TextView = itemView.findViewById(R.id.post_caption)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main2, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = feedPostList[position]
        holder.feedImage.setImageResource(post.imageResId)
        holder.feedCaption.text = post.caption
    }

    override fun getItemCount(): Int {
        return feedPostList.size
    }
}
