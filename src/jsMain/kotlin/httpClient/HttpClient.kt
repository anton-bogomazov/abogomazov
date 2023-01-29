package httpClient

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*

const val BLOG_API_HOST = "https://0e81cde8-7095-4850-897c-2f285426ef5a.mock.pstmn.io"
const val POST_PATH = "post"

val client = HttpClient {
    install(ContentNegotiation) {
        json()
    }
}
