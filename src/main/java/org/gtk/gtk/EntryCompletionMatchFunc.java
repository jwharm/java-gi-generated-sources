package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function which decides whether the row indicated by {@code iter} matches
 * a given {@code key}, and should be displayed as a possible completion for {@code key}.
 * <p>
 * Note that {@code key} is normalized and case-folded (see g_utf8_normalize()
 * and g_utf8_casefold()). If this is not appropriate, match functions
 * have access to the unmodified key via
 * {@code gtk_editable_get_text (GTK_EDITABLE (gtk_entry_completion_get_entry ()))}.
 */
/**
 * Functional interface declaration of the {@code EntryCompletionMatchFunc} callback.
 */
@FunctionalInterface
public interface EntryCompletionMatchFunc {

    /**
     * A function which decides whether the row indicated by {@code iter} matches
     * a given {@code key}, and should be displayed as a possible completion for {@code key}.
     * <p>
     * Note that {@code key} is normalized and case-folded (see g_utf8_normalize()
     * and g_utf8_casefold()). If this is not appropriate, match functions
     * have access to the unmodified key via
     * {@code gtk_editable_get_text (GTK_EDITABLE (gtk_entry_completion_get_entry ()))}.
     */
    boolean run(org.gtk.gtk.EntryCompletion completion, java.lang.String key, org.gtk.gtk.TreeIter iter);
    
    @ApiStatus.Internal default int upcall(MemoryAddress completion, MemoryAddress key, MemoryAddress iter, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run((org.gtk.gtk.EntryCompletion) Interop.register(completion, org.gtk.gtk.EntryCompletion.fromAddress).marshal(completion, null), Marshal.addressToString.marshal(key, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EntryCompletionMatchFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
