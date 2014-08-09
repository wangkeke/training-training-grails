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
     * （注）：默认是Lazy加载方式，但是弊端就是N+1查询
     * 可以修改成Eager加载方式来修复这种弊端
     *
     * 默认都是延迟加载，但是官方给的例子
     *
     *
     * In this case we have a unidirectional one-to-many. Grails will, by default, map this kind of relationship with a join table.
     * 官方：默认情况下，会自动映射关系
     *
     * The ORM DSL allows mapping unidirectional relationships using a foreign key association instead
     * 我们可以手动置顶一个外键代替这种单项关系
     *
     * 这种关系，Grails默认使用的HashSet来记录属性以供遍历
     *
     *
     *
     */
    static hasMany = [books: Book]
    String name
    static constraints = {
    }
}
