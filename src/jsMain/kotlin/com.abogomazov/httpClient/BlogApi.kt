package com.abogomazov.httpClient

import com.abogomazov.application.content.blog.BlogPostDto
import com.abogomazov.application.content.blog.BlogPostListDto
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

object BlogApi {

    private const val BLOG_API_HOST = "https://0e81cde8-7095-4850-897c-2f285426ef5a.mock.pstmn.io"
    private const val POST_PATH = "post"

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
