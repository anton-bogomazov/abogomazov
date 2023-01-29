package httpClient

import application.content.blog.BlogPostDto
import application.content.blog.BlogPostListDto
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

object BlogApi {

    // fixme add param "no-content", that one to heavyweight
    // fixme for some reason ktor can't find deserizalizer
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
