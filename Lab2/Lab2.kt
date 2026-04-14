import kotlin.random.Random
fun main() {
    val verseOfTheDay = VerseOfTheDay()

    verseOfTheDay.getRandomVerse()

    verseOfTheDay.getAllVerses()
}
class BibleVerse {
    private var book: String = ""
    private var chapter: Int = 1
    private var verse: Int = 1
    private var text: String = ""

    fun getBook(): String = book
    fun getChapter(): Int = chapter
    fun getVerse(): Int = verse
    fun getText(): String = text

    fun setBook(book: String) {
        this.book = book
    }

    fun setChapter(chapter: Int) {
        if (chapter > 0) {
            this.chapter = chapter
        } else {
            throw IllegalArgumentException("Chapter must be greater than zero.")
        }
    }

    fun setVerse(verse: Int) {
        if (verse > 0) {
            this.verse = verse
        } else {
            throw IllegalArgumentException("Verse must be greater than zero.")
        }
    }

    fun setText(text: String) {
        this.text = text
    }
    fun printVerse() {
        println("$book $chapter:$verse - $text")
    }
    fun getBibleVerse(): String {
        return "$book $chapter:$verse - $text"
    }
}

class VerseOfTheDay {
    private val verses = arrayOf<BibleVerse>(
        BibleVerse().apply {
            setBook("Proverbs")
            setChapter(3)
            setVerse(5)
            setText("Trust in the Lord with all your heart and lean not on your own understanding;")
        },
        BibleVerse().apply {
            setBook("Romans")
            setChapter(8)
            setVerse(28)
            setText("And we know that in all things God works for the good of those who love him, who have been called according to his purpose.")
        },
        BibleVerse().apply {
            setBook("Philippians")
            setChapter(4)
            setVerse(13)
            setText("I can do all this through him who gives me strength.")
        },
        BibleVerse().apply {
            setBook("Psalm")
            setChapter(23)
            setVerse(1)
            setText("The Lord is my shepherd, I lack nothing.")
        },
        BibleVerse().apply {
            setBook("John")
            setChapter(3)
            setVerse(16)
            setText("For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life.")
        },
        BibleVerse().apply {
            setBook("Isaiah")
            setChapter(41)
            setVerse(10)
            setText("So do not fear, for I am with you; do not be dismayed, for I am your God.")
        },
        BibleVerse().apply {
            setBook("Matthew")
            setChapter(6)
            setVerse(33)
            setText("But seek first his kingdom and his righteousness, and all these things will be given to you as well.")
        },
        BibleVerse().apply {
            setBook("Jeremiah")
            setChapter(29)
            setVerse(11)
            setText("For I know the plans I have for you,” declares the Lord, “plans to prosper you and not to harm you, plans to give you hope and a future.")
        },
        BibleVerse().apply {
            setBook("1 Corinthians")
            setChapter(13)
            setVerse(4)
            setText("Love is patient, love is kind. It does not envy, it does not boast, it is not proud.")
        },
        BibleVerse().apply {
            setBook("Psalm")
            setChapter(46)
            setVerse(1)
            setText("God is our refuge and strength, an ever-present help in trouble.")
        }
    )
    fun getRandomVerse() {
        val randomIndex = Random.nextInt(verses.size)
        println("Random Verse: ${verses[randomIndex].getBibleVerse()}")
    }
    fun getAllVerses() {
        println("All Verses:")
        for (verse in verses) {
            verse.printVerse()
        }
    }
}