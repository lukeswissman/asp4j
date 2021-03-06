package asp4j.test.tripleupdate.flat.str;

import asp4j.mapping.annotations.DefAtom;
import java.util.Objects;
import org.openrdf.model.Statement;

/**
 *
 * @author hbeck 
 * date May 14, 2013
 */
@DefAtom("del")
public class Deletion extends TypedTriple {

    public Deletion() {
    }

    public Deletion(Statement statement) {
        super(statement);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Deletion other = (Deletion) obj;
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.predicate, other.predicate)) {
            return false;
        }
        if (!Objects.equals(this.object, other.object)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode()*Objects.hash("del");
    }
}
