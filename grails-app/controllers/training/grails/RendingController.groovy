package training.grails

import groovy.xml.MarkupBuilder

/**
 * 渲染控制器<br>
 *
 * 练习如何渲染
 */
class RendingController {

    def index() {}

    /**
     * 渲染文本
     *
     * @return
     */
    def text() {
        render "hello"
    }

    /**
     * 渲染一个JSON
     */
    def json() {
        def result = new HashMap()
        result.put("hello", "world")
        render(result)
    }

    /**
     * 渲染一个视图
     */
    def view () {

    }

    /**
     * 使用模板
     *
     */
    def template () {
        render(template: 'book_template', collection: Book.list())
    }

    /**
     * 渲染一段Html
     *
     * @return
     */
    def html () {
        render(text: "<xml>some xml</xml>", contentType: "text/xml", encoding: "UTF-8")
    }

    /**
     * 生成一个完整的HTML
     *
     * @return
     */
    def login() {
        def writer = new StringWriter()
        def builder = new MarkupBuilder(writer)
        builder.html {
            head {
                title 'Log in'
            }
            body {
                h1 'Hello'
                form {
                }
            }
        }
        def html = writer.toString()
        render html
    }

}
