package httpClient

import application.content.blog.BlogPostDto
import application.content.blog.BlogPostListDto
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

object BlogApi {

    suspend fun getAllPosts(): BlogPostListDto {
        val serializer = BlogPostListDto.serializer()
        val response = Json.decodeFromString(serializer, client.get("$BLOG_API_HOST/$POST_PATH").body())

        return response
    }

    suspend fun getPost(title: String): BlogPostDto {
        val serializer = BlogPostDto.serializer()
        val response = Json.decodeFromString(serializer, client.get("$BLOG_API_HOST/$POST_PATH/$title").body())

        return response
    }

}
