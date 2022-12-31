package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used with gtk_text_tag_table_foreach(),
 * to iterate over every {@code GtkTextTag} inside a {@code GtkTextTagTable}.
 */
@FunctionalInterface
public interface TextTagTableForeach {
    void run(org.gtk.gtk.TextTag tag);

    @ApiStatus.Internal default void upcall(MemoryAddress tag, MemoryAddress data) {
        run((org.gtk.gtk.TextTag) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(tag)), org.gtk.gtk.TextTag.fromAddress).marshal(tag, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TextTagTableForeach.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
