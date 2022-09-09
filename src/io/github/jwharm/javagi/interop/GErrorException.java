package io.github.jwharm.javagi.interop;

import jdk.incubator.foreign.MemorySegment;
import io.github.jwharm.javagi.interop.jextract.GError;

public class GErrorException extends Exception {

    private static String getErrorMessageAndFree(MemorySegment gerror) {
        try {
            return GError.message$get(gerror).getUtf8String(0);
        } finally {
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_error_free(gerror);
        }
    }

    public GErrorException(MemorySegment gerror) {
        super(getErrorMessageAndFree(gerror));
    }
}
