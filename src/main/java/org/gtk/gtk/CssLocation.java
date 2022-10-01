package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a location in a file or other source of data parsed
 * by the CSS engine.
 * <p>
 * The {@code bytes} and {@code line_bytes} offsets are meant to be used to
 * programmatically match data. The {@code lines} and {@code line_chars} offsets
 * can be used for printing the location in a file.
 * <p>
 * Note that the {@code lines} parameter starts from 0 and is increased
 * whenever a CSS line break is encountered. (CSS defines the C character
 * sequences "\\r\\n", "\\r", "\\n" and "\\f" as newlines.)
 * If your document uses different rules for line breaking, you might want
 * run into problems here.
 */
public class CssLocation extends io.github.jwharm.javagi.ResourceBase {

    public CssLocation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public CssLocation() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkCssLocation.allocate(Interop.getAllocator()).address()));
    }
    
}
