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

    public FilenameCompleter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FilenameCompleter */
    public static FilenameCompleter castFrom(org.gtk.gobject.Object gobject) {
        return new FilenameCompleter(gobject.refcounted());
    }
    
    private static final MethodHandle g_filename_completer_new = Interop.downcallHandle(
        "g_filename_completer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_filename_completer_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new filename completer.
     */
    public FilenameCompleter() {
        super(constructNew());
    }
    
    private static final MethodHandle g_filename_completer_get_completion_suffix = Interop.downcallHandle(
        "g_filename_completer_get_completion_suffix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains a completion for {@code initial_text} from {@code completer}.
     */
    public @Nullable java.lang.String getCompletionSuffix(@NotNull java.lang.String initialText) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_filename_completer_get_completion_suffix.invokeExact(handle(), Interop.allocateNativeString(initialText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_filename_completer_get_completions = Interop.downcallHandle(
        "g_filename_completer_get_completions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets an array of completion strings for a given initial text.
     */
    public PointerString getCompletions(@NotNull java.lang.String initialText) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_filename_completer_get_completions.invokeExact(handle(), Interop.allocateNativeString(initialText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle g_filename_completer_set_dirs_only = Interop.downcallHandle(
        "g_filename_completer_set_dirs_only",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code dirs_only} is {@code true}, {@code completer} will only
     * complete directory names, and not file names.
     */
    public @NotNull void setDirsOnly(@NotNull boolean dirsOnly) {
        try {
            g_filename_completer_set_dirs_only.invokeExact(handle(), dirsOnly ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface GotCompletionDataHandler {
        void signalReceived(FilenameCompleter source);
    }
    
    /**
     * Emitted when the file name completion information comes available.
     */
    public SignalHandle onGotCompletionData(GotCompletionDataHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("got-completion-data"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(FilenameCompleter.Callbacks.class, "signalFilenameCompleterGotCompletionData",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalFilenameCompleterGotCompletionData(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (FilenameCompleter.GotCompletionDataHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new FilenameCompleter(Refcounted.get(source)));
        }
        
    }
}
