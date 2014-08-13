package training.grails

import grails.web.RequestParameter

/**
 * 数据绑定<br>
 *
 *
 */
class DataBindingController {

    def bindingMap = [name: 'Peter', age: 63]
    def person = new Person(bindingMap)
    def index() {}

    /**
     * 直接将params绑定到实体<br>
     * 这里应该与实体匹配params：
     * [name: 'Peter', age: 63]<br>
     *
     * <pre>
     *     需要说明的是Grails强大的绑定功能支持级联操作：
     *     /book/save?author.id=20
     *     book.author.id = 20
     * </pre>
     *
     */
    def bindingModel() {
        def b = new Book(params)
        b.save()
    }

    /**
     * 绑定多个实体<br>
     *
     * /book/save?book.title=The%20Stand&author.name=Stephen%20King
     */
    def bindingMultiModel () {
        def b = new Book(params.book)
        def a = new Author(params.author)
    }

    /**
     * 绑定普通参数<br>
     *
     * 这种方式类似于SpringMVC:<br>
     *
     * /accounting/displayInvoice?accountNumber=B59786&accountType=bogusValue
     */
    def bindingNormal (@RequestParameter('accountNumber') String mainAccountNumber, int accountType) {

    }

    /**
     * 可以直接绑定时候做数据转换
     *
     */
    def bindingDataFormat() {

    }
}
