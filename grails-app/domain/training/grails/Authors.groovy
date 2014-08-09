package training.grails

/**
 * 使用Books/Authors展示多对多
 */
class Authors {

    /**
     * Grails maps a many-to-many using a join table at the database level. The owning side of the relationship, in this case Author, takes responsibility for persisting the relationship and is the only side that can cascade saves across.
     * 支持数据库层面上的多对多关系，主动方是Authors并且由主动方进行级联保存
     *
     * new Author(name:"Stephen King")
     * .addToBooks(new Book(title:"The Stand"))
     * .addToBooks(new Book(title:"The Shining"))
     * .save()
     *
     */
    static hasMany = [books: Book]
    String name

    static constraints = {
    }
}
