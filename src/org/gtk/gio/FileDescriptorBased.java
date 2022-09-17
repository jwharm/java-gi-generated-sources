package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GFileDescriptorBased is implemented by streams (implementations of
 * <h1>nputStream or #GOutputStream) that are based on file descriptors.</h1>
 * <p>
 * Note that <code>&#60;gio/gfiledescriptorbased.h&#62;</code> belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the <code>gio-unix-2.0.pc</code> pkg-config
 * file when using it.
 */
public interface FileDescriptorBased extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the underlying file descriptor.
     */
    public default int getFd() {
        var RESULT = gtk_h.g_file_descriptor_based_get_fd(handle());
        return RESULT;
    }
    
    class FileDescriptorBasedImpl extends org.gtk.gobject.Object implements FileDescriptorBased {
        public FileDescriptorBasedImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
