package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a location in a file or other source of data parsed
 * by the CSS engine.
 * 
 * The @bytes and @line_bytes offsets are meant to be used to
 * programmatically match data. The @lines and @line_chars offsets
 * can be used for printing the location in a file.
 * 
 * Note that the @lines parameter starts from 0 and is increased
 * whenever a CSS line break is encountered. (CSS defines the C character
 * sequences &#34;\\r\\n&#34;, &#34;\\r&#34;, &#34;\\n&#34; and &#34;\\f&#34; as newlines.)
 * If your document uses different rules for line breaking, you might want
 * run into problems here.
 */
public class CssLocation extends io.github.jwharm.javagi.ResourceBase {

    public CssLocation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
