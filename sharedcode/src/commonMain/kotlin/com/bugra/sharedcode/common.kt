package com.bugra.sharedcode

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return platformName()
}