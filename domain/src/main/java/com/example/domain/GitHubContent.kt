package com.example.domain


data class GitHubContent(
    val items: List<ItemContent> = emptyList()
) {
    companion object {
        fun of(gitHubResponse: GitHubResponse) : GitHubContent {
            return GitHubContent(
                items = gitHubResponse.items.map(ItemContent::of)
            )
        }
    }
}

data class ItemContent(
    val owner: OwnerContent,
    val fullName: String = "",
    val language: String? = ""
){
    companion object {
        fun of(item: Item) : ItemContent {
            return ItemContent(
                owner = item.owner.run(OwnerContent::of),
                fullName = item.full_name,
                language = item.language
            )
        }
    }
}

data class OwnerContent(
    val avatarUrl: String = ""
){
    companion object {
        fun of(owner: Owner) : OwnerContent {
            return OwnerContent(
                avatarUrl = owner.avatar_url
            )
        }
    }
}
