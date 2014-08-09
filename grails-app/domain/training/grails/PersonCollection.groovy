package training.grails

/**
 * 支持的普通的属性集合
 */
class PersonCollection {
    /**
     * As well as associations between different domain classes, GORM also supports mapping of basic collection types. For example, the following class creates a nicknames association that is a Set of String instances:
     * 支持的普通的属性集合
     */
    static hasMany = [nicknames: String]
    static constraints = {
    }

    /**
     * GORM will map an association like the above using a join table. You can alter various aspects of how the join table is mapped using the joinTable argument
     * 你也可以这样灵活配置一个映射表
     *
     * static hasMany = [nicknames: String]
     *
     * static mapping = {
     * hasMany joinTable: [name: 'bunch_o_nicknames',
     * key: 'person_id',
     * column: 'nickname',
     * type: "text"]
     * }
     *
     */
}
