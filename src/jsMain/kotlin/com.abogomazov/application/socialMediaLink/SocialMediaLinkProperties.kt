package com.abogomazov.application.socialMediaLink

const val EMAIL_LINK = "mailto:abogomazov.dev@gmail.com"
const val GITHUB_LINK = "https://github.com/anton-bogomazov"
const val LINKEDIN_LINK = "https://www.linkedin.com/in/anton-p-bogomazov/"
const val INSTAGRAM_LINK = "https://instagram.com/so_so_ciable"
const val TELEGRAM_LINK = "https://t.me/antonbogomazov"

const val EMAIL_ICON_PATH = "icons/mail.svg"
const val GITHUB_ICON_PATH = "icons/github.svg"
const val LINKEDIN_ICON_PATH = "icons/linkedin.svg"
const val INSTAGRAM_ICON_PATH = "icons/instagram.svg"
const val TELEGRAM_ICON_PATH = "icons/telegram.svg"

enum class SocialMediaProperties(val uri: String, val iconPath: String) {
    EMAIL(EMAIL_LINK, EMAIL_ICON_PATH),
    GITHUB(GITHUB_LINK, GITHUB_ICON_PATH),
    LINKEDIN(LINKEDIN_LINK, LINKEDIN_ICON_PATH),
    INSTAGRAM(INSTAGRAM_LINK, INSTAGRAM_ICON_PATH),
    TELEGRAM(TELEGRAM_LINK, TELEGRAM_ICON_PATH)
}
