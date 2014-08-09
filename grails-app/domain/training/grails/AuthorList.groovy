package training.grails

/**
 * List使用
 * AuthorList/BookList来讲解
 */
class AuthorList {
    /**
     * 如果不添加该属性，默认是Set
     */
    List books

    static hasMany = [books: Book]
    static constraints = {
    }
}
