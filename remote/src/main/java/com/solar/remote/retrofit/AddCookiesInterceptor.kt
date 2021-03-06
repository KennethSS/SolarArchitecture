package com.solar.remote.retrofit

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class AddCookiesInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        val accessToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjo5LCJ1c2VybmFtZSI6ImtlbmZmbmVkIiwiZXhwIjoxNTk3OTE4MjkzLCJlbWFpbCI6IiIsIm9yaWdfaWF0IjoxNTk3ODgyMjkzfQ.RwmoxtfPLnEN0tLZXwTIc-DNT_D9aYUpo3KjWxUg_wc"

        val authenticationRequestBuilder = originalRequest.newBuilder()
        if (accessToken.isNotEmpty()) {
            //authenticationRequestBuilder.addHeader("Authorization", "Bearer $accessToken")
        }

        authenticationRequestBuilder.addHeader("Authorization", "JWT $accessToken")

        val initialResponse = chain.proceed(authenticationRequestBuilder.build())
        val builder = chain.request().newBuilder()

        //builder.header("Authorization", "JWT eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjo5LCJ1c2VybmFtZSI6ImtlbmZmbmVkIiwiZXhwIjoxNTk3Mjg0MzY1LCJlbWFpbCI6IiIsIm9yaWdfaWF0IjoxNTk3MjgwNzY1fQ.aYgBHIZNNRRINETyW7AqQCTGoEGpq2qfqUgCNbwFOG8")
        //if (accessToken.isNotEmpty()) builder.header("Authorization", "Bearer $accessToken")
        return initialResponse
    }
}