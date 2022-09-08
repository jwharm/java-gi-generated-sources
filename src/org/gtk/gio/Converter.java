package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GConverter is implemented by objects that convert
 * binary data in various ways. The conversion can be
 * stateful and may fail at any place.
 * 
 * Some example conversions are: character set conversion,
 * compression, decompression and regular expression
 * replace.
 */
public interface Converter extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Resets all internal state in the converter, making it behave
     * as if it was just created. If the converter has any internal
     * state that would produce output then that output is lost.
     */
    public default void reset() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_converter_reset(HANDLE());
    }
    
    class ConverterImpl extends org.gtk.gobject.Object implements Converter {
        public ConverterImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
