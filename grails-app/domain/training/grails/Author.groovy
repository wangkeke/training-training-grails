package training.grails

class Author {
    static hasMany = [books: Book]
    String name
    static constraints = {
    }
}
