package training.grails

class Person {
    String name
    Integer age
    Date lastVisit
    CommandPerson parent

    static belongsTo = [supervisor: CommandPerson]
    static mappedBy = [supervisor: "none", parent: "none"]
    static constraints = {
        supervisor nullable: true
    }

}
