package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoScriptIter} is used to iterate through a string
 * and identify ranges in different scripts.
 */
public class ScriptIter extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoScriptIter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ScriptIter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ScriptIter newInstance = new ScriptIter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ScriptIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ScriptIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull java.lang.String text, int length) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_script_iter_new.invokeExact(
                    Interop.allocateNativeString(text),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code PangoScriptIter}, used to break a string of
     * Unicode text into runs by Unicode script.
     * <p>
     * No copy is made of {@code text}, so the caller needs to make
     * sure it remains valid until the iterator is freed with
     * {@link ScriptIter#free}.
     * @param text a UTF-8 string
     * @param length length of {@code text}, or -1 if {@code text} is nul-terminated
     */
    public ScriptIter(@NotNull java.lang.String text, int length) {
        super(constructNew(text, length), Ownership.FULL);
    }
    
    /**
     * Frees a {@code PangoScriptIter}.
     */
    public void free() {
        try {
            DowncallHandles.pango_script_iter_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets information about the range to which {@code iter} currently points.
     * <p>
     * The range is the set of locations p where *start &lt;= p &lt; *end.
     * (That is, it doesn't include the character stored at *end)
     * <p>
     * Note that while the type of the {@code script} argument is declared
     * as {@code PangoScript}, as of Pango 1.18, this function simply returns
     * {@code GUnicodeScript} values. Callers must be prepared to handle unknown
     * values.
     * @param start location to store start position of the range
     * @param end location to store end position of the range
     * @param script location to store script for range
     */
    public void getRange(@NotNull Out<java.lang.String> start, @NotNull Out<java.lang.String> end, @NotNull Out<org.pango.Script> script) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        java.util.Objects.requireNonNull(script, "Parameter 'script' must not be null");
        MemorySegment startPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment endPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment scriptPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_script_iter_get_range.invokeExact(
                    handle(),
                    (Addressable) startPOINTER.address(),
                    (Addressable) endPOINTER.address(),
                    (Addressable) scriptPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        start.set(Interop.getStringFrom(startPOINTER.get(ValueLayout.ADDRESS, 0)));
        end.set(Interop.getStringFrom(endPOINTER.get(ValueLayout.ADDRESS, 0)));
        script.set(new org.pango.Script(scriptPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    /**
     * Advances a {@code PangoScriptIter} to the next range.
     * <p>
     * If {@code iter} is already at the end, it is left unchanged
     * and {@code false} is returned.
     * @return {@code true} if {@code iter} was successfully advanced
     */
    public boolean next() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_script_iter_next.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_script_iter_new = Interop.downcallHandle(
            "pango_script_iter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle pango_script_iter_free = Interop.downcallHandle(
            "pango_script_iter_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_script_iter_get_range = Interop.downcallHandle(
            "pango_script_iter_get_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle pango_script_iter_next = Interop.downcallHandle(
            "pango_script_iter_next",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
