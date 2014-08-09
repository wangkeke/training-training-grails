package training.grails

/**
 * 使用Books/Authors展示多对多
 *
 */
class Books {

    /**
     * 这个是被控方，它的保存不会影响到Authors
     *
     * new Book(name:"Groovy in Action")
     * .addToAuthors(new Author(name:"Dierk Koenig"))
     * .addToAuthors(new Author(name:"Guillaume Laforge"))
     * .save()
     *
     * 这种添加不会增加Authors
     *
     */
    static belongsTo = Author
    static hasMany = [authors:Author]
    String title

    static constraints = {
    }
}
