package training.grails

import grails.converters.JSON
import grails.converters.XML

/**
 * Xml/Json输出格式的控制器<br>
 *
 */
class XmlJsonController {

    def index() {}

    /**
     * 输出Xml格式
     * <pre>
     * <books>
     *     <book title="The Stand" />
     *     <book title="The Shining" />
     * </books>
     * </pre>
     *
     * @return
     */
    def list() {
        def results = Book.list()
        render(contentType: "text/xml") {
            books {
                for (b in results) {
                    book(title: b.title)
                }
            }
        }
    }

    /**
     * 输出格式为Json<br>
     *
     * <pre>
     *     [
     *{"title":"The Stand"},
     *{"title":"The Shining"}*     ]
     * </pre>
     *
     * @return
     */
    def renderJson() {
        def results = Book.list()

        render(contentType: "application/json") {
            books = array {
                for (b in results) {
                    book title: b.title
                }
            }
        }
    }

    /**
     * 自动映射Xml<br>
     *
     *
     * 格式这样：<br>
     * <pre>
     * <?xml version="1.0" encoding="ISO-8859-1"?>
     *     <list>
     *         <book id="1">
     *             <author>Stephen King</author>
     *             <title>The Stand</title>
     *             </book>
     *             <book id="2">
     *                 <author>Stephen King</author>
     *                 <title>The Shining</title>
     *              </book>
     *      </list>
     *
     * </pre>
     * @return
     */
    def autoRenderXml() {
        render Book.list() as XML
    }

    /**
     * 自动映射Json<br>
     *
     * <pre>
     * [
     * {"id":1,
     * "class":"Book",
     * "author":"Stephen King",
     * "title":"The Stand"},
     * {"id":2,
     * "class":"Book",
     * "author":"Stephen King",
     * "releaseDate":new Date(1194127343161),
     * "title":"The Shining"}
     * ]
     *
     * </pre>
     *
     */
    def autoRenderJson() {
        render Book.list() as JSON
    }
}
