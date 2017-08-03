package kotako.java.info.notifyer.Model

import io.realm.RealmObject
import io.realm.annotations.RealmClass
import java.util.*

@RealmClass
open class Task(open var content: String,
                open var genre: String,
                open var milestone: Date) : RealmObject() {
}