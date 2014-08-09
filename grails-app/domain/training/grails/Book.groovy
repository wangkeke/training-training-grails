package training.grails

/**
 * One-to-many
 * Book/Author来说明One-to-many
 *
 */
class Book {
    String title
    Date releaseDate
    String ISBN
    static constraints = {
    }

}
