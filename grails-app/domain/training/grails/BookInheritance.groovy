package training.grails

/**
 * GORM的集成关系使用
 * ContentInheritance/BookInheritance
 *
 */
class BookInheritance extends ContentInheritance{
    String ISBN
    static constraints = {
    }

    /**
     * Polymorphic Queries <br />
     * 多态查询
     *
     * def content = Content.list() // list all blog entries, books and podcasts
     * content = Content.findAllByAuthor('Joe Bloggs') // find all by author
     * def podCasts = BookInheritance.list() // list only podcasts
     *
     *
     */
}
