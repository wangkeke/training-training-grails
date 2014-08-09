package training.grails

/**
 * 一对多:Airport/Flight <br />
 * If you have two properties of the same type on the many side of a one-to-many you have to use mappedBy to specify which the collection is mapped
 *
 * 官方：如果超过一个相同的属性指向了一对多，那么就需要mappedBy属性置顶映射的类
 *
 */
class Flight {

    Airport departureAirport
    Airport destinationAirport
    static constraints = {
    }
}
