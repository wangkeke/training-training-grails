package training.grails

/**
 * Grails提供了几种强大的查询方式，在非特殊情况下我们可以告别了iBatis/MyBatis
 *
 * Dynamic Finders
 * Where Queries
 * Criteria Queries
 * Hibernate Query Language (HQL)
 *
 */
class Query {

    /**
     * Listing instances
     * 获取所有
     * def books = Book.list()
     *
     * 分页
     * def books = Book.list(offset:10, max:20)
     *
     * 排序
     * def books = Book.list(sort:"title", order:"asc")
     *
     * 根据主键查询
     * def book = Book.get(23)
     *
     * 获取多个
     * def books = Book.getAll(23, 93, 81)
     *
     * Dynamic Finders
     * 动态查询：使用的语法与Spring-Data完全一致
     *
     * def book = Book.findByTitle("The Stand")
     * book = Book.findByTitleLike("Harry Pot%")
     * book = Book.findByReleaseDateBetween(firstDate, secondDate)
     * book = Book.findByReleaseDateGreaterThan(someDate)
     * book = Book.findByTitleLikeOrReleaseDateLessThan("%Something%", someDate)
     *
     * 语法：Book.findBy([Property][Comparator][Boolean Operator])?[Property][Comparator]
     *
     * def book = Book.findByTitle("The Stand")
     * book =  Book.findByTitleLike("Harry Pot%")
     *
     * 逻辑或/逻辑与
     *
     * def books = Book.findAllByTitleLikeAndReleaseDateGreaterThan("%Java%", new Date() - 30)
     *
     * Where Queries -- Groovy syntax语法：使用的是闭包
     *
     * 基本语法
     * def query = Person.where {
     * firstName == "Bart"
     * }
     * Person bart = query.find()
     * 扩展
     * def query = Person.where {
     * (lastName != "Simpson" && firstName != "Fred") || (firstName == "Bart" && age > 9)
     * }
     * def results = query.list(sort:"firstName")
     * 扩展
     * def results = Person.findAll(sort:"firstName") {
     * lastName == "Simpson"
     * }
     * Person p = Person.find { firstName == "Bart" }
     *
     * 高级语法：加入到实体类
     *
     * class Person {
     * static simpsons = where {
     * lastName == "Simpson"
     * }
     * …
     * }
     * …
     * Person.simpsons.each {
     * println it.firstname
     * }
     *
     * 组合查询
     * Query Composition
     *
     * def query = Person.where {
     * lastName == "Simpson"
     * }
     * def bartQuery = query.where {
     * firstName == "Bart"
     * }
     * Person p = bartQuery.find()
     *
     * Note that you cannot pass a closure defined as a variable into the where method unless it has been explicitly cast to a DetachedCriteria instance. In other words the following will produce an error:
     * 注意：不能在闭包中定义一个变量，这样在使用过程中会产生异常的
     * Error:
     * def callable = {
     * lastName == "Simpson"
     * }
     * def query = Person.where(callable)
     *
     * Right:
     * import grails.gorm.DetachedCriteria
     * def callable = {
     * lastName == "Simpson"
     * } as DetachedCriteria<Person>
     * def query = Person.where(callable)
     *
     *
     */
    static constraints = {
    }
}
