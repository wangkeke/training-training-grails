package training.grails

/**
 * 悲观锁和乐观锁
 *
 */
class PessimisticAndOptimisticLocking {

    /**
     *
     * 乐观锁：
     * Hibernate默认是乐观锁，在乐观锁中有一个version的概念
     *
     * def airport = Airport.get(10)
     * println airport.version
     *
     * This is useful as it allows a certain level of atomicity without resorting to pessimistic locking that has an inherit performance penalty. The downside is that you have to deal with this exception if you have highly concurrent writes. This requires flushing the session:
     *
     * 高并发会有弊端
     *
     * 意思大概是，如果一个线程保存着一个版本数据，另一个线程读取该数据并且修改了数据后保存了，那么在第一个线程中，
     * 就不能保存了，这个时候就会抛出一个异常。
     *
     * 悲观锁：
     * Pessimistic locking is equivalent to doing a SQL "SELECT * FOR UPDATE" statement and locking a row in the database. This has the implication that other read operations will be blocking until the lock is released.
     *
     * 悲观锁相当于Select * from AAA for Update...
     *
     * def airport = Airport.get(10)
     * airport.lock() // lock for update
     * airport.name = "Heathrow"
     * airport.save()
     *
     * 一旦事务提交，这个悲观锁就释放了
     * 当然可以写成这样
     *
     * Airport.lock(10)
     *
     */
    static constraints = {
    }
}
