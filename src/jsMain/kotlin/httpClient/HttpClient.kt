package httpClient

import application.content.blog.BlogPostDto
import application.content.blog.BlogPostListDto
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

const val BLOG_API_HOST = "https://0e81cde8-7095-4850-897c-2f285426ef5a.mock.pstmn.io"
const val POST_PATH = "post"

val client = HttpClient {
    install(ContentNegotiation) {
        json()
    }
}

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
