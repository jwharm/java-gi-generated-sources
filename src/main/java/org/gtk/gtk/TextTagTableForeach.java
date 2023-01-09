package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used with gtk_text_tag_table_foreach(),
 * to iterate over every {@code GtkTextTag} inside a {@code GtkTextTagTable}.
 */
/**
 * Functional interface declaration of the {@code TextTagTableForeach} callback.
 */
@FunctionalInterface
public interface TextTagTableForeach {

    /**
     * A function used with gtk_text_tag_table_foreach(),
     * to iterate over every {@code GtkTextTag} inside a {@code GtkTextTagTable}.
     */
    void run(org.gtk.gtk.TextTag tag);
    
    @ApiStatus.Internal default void upcall(MemoryAddress tag, MemoryAddress data) {
        run((org.gtk.gtk.TextTag) Interop.register(tag, org.gtk.gtk.TextTag.fromAddress).marshal(tag, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TextTagTableForeach.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
