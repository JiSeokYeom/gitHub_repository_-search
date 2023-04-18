package com.example.domain


data class GitHubResponse(
    val items: List<Item> = emptyList()
)

data class Item(
    val owner: Owner,
    val full_name: String = "",
    val language: String? = ""
)

data class Owner(
    val avatar_url: String = ""
)
