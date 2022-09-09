package io.github.jwharm.javagi.interop;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import io.github.jwharm.javagi.interop.jextract.GError;

import static io.github.jwharm.javagi.interop.Interop.getScope;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_POINTER;

public class GErrorException extends Exception {

    private int code;
    private int domain;

    private static MemorySegment dereference(MemorySegment pointer) {
        return GError.ofAddress(pointer.get(C_POINTER, 0), getScope());
    }
    private static String getMessage(MemorySegment pointer) {
        return GError.message$get(dereference(pointer)).getUtf8String(0);
    }
    private static int getCode(MemorySegment pointer) {
        return GError.code$get(dereference(pointer));
    }
    private static int getDomain(MemorySegment pointer) {
        return GError.domain$get(dereference(pointer));
    }
    private static void freeMemory(MemorySegment pointer) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_error_free(dereference(pointer));
    }

    public GErrorException(MemorySegment gerrorPtr) {
        super(getMessage(gerrorPtr));
        this.code = getCode(gerrorPtr);
        this.domain = getDomain(gerrorPtr);
        freeMemory(gerrorPtr);
    }

    /**
     * Returns true when an error was set on this pointer
     */
    public static boolean isErrorSet(MemorySegment gerrorPtr) {
        MemoryAddress gerror = gerrorPtr.get(C_POINTER, 0);
        return (! gerror.equals(MemoryAddress.NULL));
    }

    public int getCode() {
        return code;
    }

    public int getDomain() {
        return domain;
    }
}
