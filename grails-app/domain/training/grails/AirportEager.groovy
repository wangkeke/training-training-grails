package training.grails

/**
 * FlightEager/AirportEager来配置立即查询加载
 *
 */
class AirportEager {

    /**
     * 查看FlightEager文件，我配置了belongsTo属性，也就是说这里是主动方，而FightEager是被动方
     *
     * 在操作级联更新/删除时候，如果删除或者修改主动方，那么会影响到被动方；操作被动方不会影响主动方
     */
    String name
    static hasMany = [flights: Flight]
    static mapping = {
        /**
         * 立即加载
         */
        flights lazy: false
    }
    static constraints = {
    }
}
