package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link org.gtk.gobject.TypeValueTable} provides the functions required by the {@link org.gtk.gobject.Value} implementation, to serve as a container for values of a type.
 */
public class TypeValueTable extends io.github.jwharm.javagi.ResourceBase {

    public TypeValueTable(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Returns the location of the {@link org.gtk.gobject.TypeValueTable} associated with @type.
     * 
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * @type.
     */
    public static TypeValueTable peek(Type type) {
        var RESULT = gtk_h.g_type_value_table_peek(type.getValue());
        return new TypeValueTable(References.get(RESULT, false));
    }
    
}
