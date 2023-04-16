# 📚 Study 

- ### 본 레포는 Clean Architecture, Hilt를 학습하기 위한 레포이다

# 📌 주요 기능

- ### GitHub API를 사용하여 GitHub Repository를 조회하고 리스트를 보여주는 기능

# 📋 Search Repositories API

- ### 해당 API 출처 : [https://docs.github.com/en/rest/reference/search#search-repositories](https://docs.github.com/en/rest/reference/search#search-repositories)
- ### API URL : https://api.github.com/search/repositories
- ### API Method : GET "/search/repositories"

# 📞 Response

- ### 전체 Response중에, 사용할 filed는 아래와 같습니다.
| Field | Type | Description |
| --- | --- | --- |
| items | Array | Repository에 대한 다양한 데이터를 담고 있습니다. |
| full_name | String | Repository명을 나타냅니다. |
| owner | Object | 유저 프로필관련 정보를 담고 있습니다. |
| avatar_url | String | 유저 아바타 이미지 주소를 나타냅니다. |
| language | String | 해당 프로젝트에서 사용한 언어를 나타냅니다. |
