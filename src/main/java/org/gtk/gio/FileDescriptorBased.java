package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link FileDescriptorBased} is implemented by streams (implementations of
 * {@link InputStream} or {@link OutputStream}) that are based on file descriptors.
 * <p>
 * Note that {@code <gio/gfiledescriptorbased.h>} belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config
 * file when using it.
 */
public interface FileDescriptorBased extends io.github.jwharm.javagi.Proxy {

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
