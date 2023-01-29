package application.content.blog

import kotlinx.serialization.Serializable

@Serializable
data class BlogPostDto(
    val title: String,
    val description: String,
    val content: String
) {

    companion object {
        private const val NO_DATA = "NO_DATA"

        fun empty() = BlogPostDto(NO_DATA, NO_DATA, NO_DATA)
    }

    fun toUri(origin: String) = "$origin/#blog/${title.split("\\W+".toRegex()).joinToString("-")}"
}

@Serializable
data class BlogPostListDto(
    val blogPosts: List<BlogPostDto>
)
