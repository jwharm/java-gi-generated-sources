package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoScriptIter} is used to iterate through a string
 * and identify ranges in different scripts.
 */
public class ScriptIter extends Struct {
    
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
    
    /**
     * Allocate a new {@link ScriptIter}
     * @return A new, uninitialized @{link ScriptIter}
     */
    public static ScriptIter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ScriptIter newInstance = new ScriptIter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ScriptIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ScriptIter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ScriptIter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ScriptIter(input);
    
    private static MemoryAddress constructNew(java.lang.String text, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.pango_script_iter_new.invokeExact(
                        Marshal.stringToAddress.marshal(text, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public ScriptIter(java.lang.String text, int length) {
        super(constructNew(text, length));
        this.takeOwnership();
    }
    
    /**
     * Frees a {@code PangoScriptIter}.
     */
    public void free() {
        try {
            DowncallHandles.pango_script_iter_free.invokeExact(handle());
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
    public void getRange(@Nullable Out<java.lang.String> start, @Nullable Out<java.lang.String> end, @Nullable Out<org.pango.Script> script) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment startPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment endPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment scriptPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_script_iter_get_range.invokeExact(
                        handle(),
                        (Addressable) (start == null ? MemoryAddress.NULL : (Addressable) startPOINTER.address()),
                        (Addressable) (end == null ? MemoryAddress.NULL : (Addressable) endPOINTER.address()),
                        (Addressable) (script == null ? MemoryAddress.NULL : (Addressable) scriptPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (start != null) start.set(Marshal.addressToString.marshal(startPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (end != null) end.set(Marshal.addressToString.marshal(endPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (script != null) script.set(org.pango.Script.of(scriptPOINTER.get(Interop.valueLayout.C_INT, 0)));
        }
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
            RESULT = (int) DowncallHandles.pango_script_iter_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_script_iter_new = Interop.downcallHandle(
                "pango_script_iter_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_script_iter_free = Interop.downcallHandle(
                "pango_script_iter_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_script_iter_get_range = Interop.downcallHandle(
                "pango_script_iter_get_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_script_iter_next = Interop.downcallHandle(
                "pango_script_iter_next",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
