package training.grails

/**
 * FlightEager/AirportEager来配置立即查询加载
 */
class FlightEager {

    static belongsTo = [airportEager: AirportEager]
    static constraints = {
    }
}
