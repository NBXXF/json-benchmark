package com.xxf.json.benchmark

import com.xxf.json.gson.booster.annotation.JsonModel


@JsonModel
data class GsonResponse(
    val users: List<GsonUser>?=null,
    val status: String?=null,
    val is_real_json: Boolean?=null
)

@JsonModel
data class GsonUser(
    val _id: String?=null,
    val index: Int?=null,
    val guid: String?=null,
    val is_active: Boolean?=null,
    val balance: String?=null,
    val picture: String?=null,
    val age: Int?=null,
    val name: GsonName?=null,
    val company: String?=null,
    val email: String?=null,
    val address: String?=null,
    val about: String?=null,
    val registered: String?=null,
    val latitude: Double?=null,
    val longitude: Double?=null,
    val tags: List<String>?=null,
    val range: List<Int>?=null,
    val friends: List<GsonFriend>?=null,
    val images: List<GsonImage>?=null,
    val greeting: String?=null,
    val favorite_fruit: String?=null,
    val eye_color: String?=null,
    val phone: String?=null
)

@JsonModel
class GsonName(
    val first: String?=null,
    val last: String?=null
)

@JsonModel
data class GsonFriend(
    val id: Int?=null,
    val name: String?=null
)

@JsonModel
class GsonImage(
    val id: String?=null,
    val format: String?=null,
    val url: String?=null,
    val description: String?=null
)