package training.grails

/**
 * One-to-many
 * Book/Author来说明One-to-many
 *
 */
class Author {
    /**
     * 查询：
     * def a = Author.get(1)
     * for (book in a.books) {
     *  println book.title
     * }
     *
     * 默认都是延迟加载，但是官方给的例子
     */
    static hasMany = [books: Book]
    String name
    static constraints = {
    }
}
