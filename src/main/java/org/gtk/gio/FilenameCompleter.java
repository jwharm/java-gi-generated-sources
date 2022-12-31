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
public class FilenameCompleter extends org.gtk.gobject.GObject {
    
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
    protected FilenameCompleter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FilenameCompleter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FilenameCompleter(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    public @Nullable java.lang.String getCompletionSuffix(java.lang.String initialText) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_completer_get_completion_suffix.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(initialText, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets an array of completion strings for a given initial text.
     * @param initialText text to be completed.
     * @return array of strings with possible completions for {@code initial_text}.
     * This array must be freed by g_strfreev() when finished.
     */
    public PointerString getCompletions(java.lang.String initialText) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filename_completer_get_completions.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(initialText, null));
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
                    Marshal.booleanToInteger.marshal(dirsOnly, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_filename_completer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface GotCompletionData {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceFilenameCompleter) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GotCompletionData.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the file name completion information comes available.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<FilenameCompleter.GotCompletionData> onGotCompletionData(FilenameCompleter.GotCompletionData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("got-completion-data"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link FilenameCompleter.Builder} object constructs a {@link FilenameCompleter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FilenameCompleter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FilenameCompleter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FilenameCompleter}.
         * @return A new instance of {@code FilenameCompleter} with the properties 
         *         that were set in the Builder object.
         */
        public FilenameCompleter build() {
            return (FilenameCompleter) org.gtk.gobject.GObject.newWithProperties(
                FilenameCompleter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_filename_completer_new = Interop.downcallHandle(
            "g_filename_completer_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filename_completer_get_completion_suffix = Interop.downcallHandle(
            "g_filename_completer_get_completion_suffix",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filename_completer_get_completions = Interop.downcallHandle(
            "g_filename_completer_get_completions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_filename_completer_set_dirs_only = Interop.downcallHandle(
            "g_filename_completer_set_dirs_only",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_filename_completer_get_type = Interop.downcallHandle(
            "g_filename_completer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
