package training.grails

import org.grails.databinding.BindingFormat

/**
 * Created by Percy on 2014/8/13.
 */
class CommandPerson {
    @BindingFormat('MMddyyyy')
    Date birthDate
}
