package edu.farmingdale.datastoredemo.data.local

/*
 * Set data for Android Release Emoji name
 * the list contain distinct sequential Emoji name
 */
object LocalEmojiData {
    private val emojiNameMap = mapOf(
        "😀" to "Happy",
        "😃" to "Excited",
        "😄" to "Grinning",
        "😁" to "Beaming",
        "😆" to "Laughing",
        "😅" to "Sweating Smile",
        "😂" to "Tears of Joy",
        "🤣" to "Rolling on the Floor Laughing",
        "😊" to "Blushing",
        "😇" to "Angel",
        "🙂" to "Slight Smile",
        "🙃" to "Upside Down Smile",
        "😉" to "Wink",
        "😍" to "Heart Eyes",
        "🥰" to "Floating Hearts",
        "😘" to "Kiss",
        "😋" to "Yum",
        "😛" to "Tongue Out",
        "😜" to "Tongue Out Wink",
        "🤪" to "Zany",
        "🤨" to "Eyebrow Raise",
        "🧐" to "Monocle",
        "🤓" to "Nerd",
        "😎" to "Sunglasses",
        "🤩" to "Star Eyes",
        "🥳" to "Party",
        "😏" to "Smirk",
        "😒" to "Tired",
        "😟" to "Sad",
        "☹️" to "Very Sad",
        "😫" to "Sad Yell",
        "🥺" to "Pleading",
        "😢" to "Cry",
        "😭" to "Sob",
        "😡" to "Mad",
        "🤬" to "Cursing",
        "😈" to "Devil",
        "💀" to "Skull",
        "💩" to "Poop",
        "🤡" to "Clown",
        "👻" to "Ghost",
        "👽" to "Alien",
        "👍" to "Thumbs Up",
        "👎" to "Thumbs Down",
        "✊" to "Fist Up",
        "👊" to "Punch",
        "✌️" to "Peace"
    )
    val EmojiList = emojiNameMap.keys.toList()

    // Function to get emoji name by emoji character
    fun getEmojiName(emoji: String): String {
        return emojiNameMap[emoji] ?: "Unknown Emoji"
    }
}
