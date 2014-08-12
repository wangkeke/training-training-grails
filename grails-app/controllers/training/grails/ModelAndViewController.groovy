package training.grails

/**
 * 学习Model/View<br>
 *
 *
 *
 */
class ModelAndViewController {

    def index() {

    }

    /**
     * 测试返回一个实体<br>
     *
     * 在使用过程中不要使用内置的关键字，attributes, application...
     * @return
     */
    def show() {
        log.debug("=====展示返回一个实体=====")
        def result = new Book(title:"Grails实战", releaseDate: new Date(), ISBN: "10001")
        render([book: result])
    }

    /**
     * 展示不同视图<br>
     *
     * 除了示例中写法外，还可以render(view:"/share/display", model:[book: result])
     * @return
     */
    def different() {
        log.debug("=====展示返回一个实体=====")
        def result = new Book(title:"Grails实战", releaseDate: new Date(), ISBN: "10001")
        render(view:"display", model: result)
    }


}
