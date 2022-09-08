package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GFileDescriptorBased is implemented by streams (implementations of
 * #GInputStream or #GOutputStream) that are based on file descriptors.
 * 
 * Note that `<gio/gfiledescriptorbased.h>` belongs to the UNIX-specific
 * GIO interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file when using it.
 */
public interface FileDescriptorBased extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the underlying file descriptor.
     */
    public default int getFd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_descriptor_based_get_fd(HANDLE());
        return RESULT;
    }
    
    class FileDescriptorBasedImpl extends org.gtk.gobject.Object implements FileDescriptorBased {
        public FileDescriptorBasedImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
