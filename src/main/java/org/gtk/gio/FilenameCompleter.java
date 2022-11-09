package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Completes partial file and directory names given a partial string by
 * looking in the file system for clues. Can return a list of possible
 * completion strings for widget implementations.
 */
public class FilenameCompleter extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFilenameCompleter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FilenameCompleter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FilenameCompleter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FilenameCompleter if its GType is a (or inherits from) "GFilenameCompleter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FilenameCompleter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFilenameCompleter", a ClassCastException will be thrown.
     */
    public static FilenameCompleter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GFilenameCompleter"))) {
            return new FilenameCompleter(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GFilenameCompleter");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_completer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new filename completer.
     */
    public FilenameCompleter() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Obtains a completion for {@code initial_text} from {@code completer}.
     * @param initialText text to be completed.
     * @return a completed string, or {@code null} if no
     *     completion exists. This string is not owned by GIO, so remember to g_free()
     *     it when finished.
     */
    public @Nullable java.lang.String getCompletionSuffix(@NotNull java.lang.String initialText) {
        java.util.Objects.requireNonNull(initialText, "Parameter 'initialText' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_completer_get_completion_suffix.invokeExact(
                    handle(),
                    Interop.allocateNativeString(initialText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets an array of completion strings for a given initial text.
     * @param initialText text to be completed.
     * @return array of strings with possible completions for {@code initial_text}.
     * This array must be freed by g_strfreev() when finished.
     */
    public @NotNull PointerString getCompletions(@NotNull java.lang.String initialText) {
        java.util.Objects.requireNonNull(initialText, "Parameter 'initialText' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_completer_get_completions.invokeExact(
                    handle(),
                    Interop.allocateNativeString(initialText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * If {@code dirs_only} is {@code true}, {@code completer} will only
     * complete directory names, and not file names.
     * @param dirsOnly a {@code gboolean}.
     */
    public void setDirsOnly(boolean dirsOnly) {
        try {
            DowncallHandles.g_filename_completer_set_dirs_only.invokeExact(
                    handle(),
                    dirsOnly ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GotCompletionData {
        void signalReceived(FilenameCompleter source);
    }
    
    /**
     * Emitted when the file name completion information comes available.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FilenameCompleter.GotCompletionData> onGotCompletionData(FilenameCompleter.GotCompletionData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("got-completion-data"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FilenameCompleter.Callbacks.class, "signalFilenameCompleterGotCompletionData",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<FilenameCompleter.GotCompletionData>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_filename_completer_new = Interop.downcallHandle(
            "g_filename_completer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filename_completer_get_completion_suffix = Interop.downcallHandle(
            "g_filename_completer_get_completion_suffix",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filename_completer_get_completions = Interop.downcallHandle(
            "g_filename_completer_get_completions",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filename_completer_set_dirs_only = Interop.downcallHandle(
            "g_filename_completer_set_dirs_only",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalFilenameCompleterGotCompletionData(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (FilenameCompleter.GotCompletionData) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new FilenameCompleter(source, Ownership.UNKNOWN));
        }
    }
}
