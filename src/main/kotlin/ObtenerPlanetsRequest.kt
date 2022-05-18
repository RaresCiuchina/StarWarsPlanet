import com.google.gson.reflect.TypeToken
import okhttp3.OkHttpClient
import okhttp3.Request

class ObtenerPlanetsRequest {

    companion object {
        fun get(): PlanetResponse {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url("https://swapi.dev/api/planets/")
                .build()
            val response = client.newCall(request).execute()

            if (response.isSuccessful) {
                response.body?.string().let { responseBody ->
                    return gson.fromJson(responseBody, PlanetResponse::class.java)
                }

            } else
                throw DownloadingException()
        }
    }

    class DownloadingException : Exception()

}