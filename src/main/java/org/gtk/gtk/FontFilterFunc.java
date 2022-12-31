package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function that is used for deciding what fonts get
 * shown in a {@code GtkFontChooser}.
 * <p>
 * See {@link FontChooser#setFilterFunc}.
 */
@FunctionalInterface
public interface FontFilterFunc {
    boolean run(org.pango.FontFamily family, org.pango.FontFace face);

    @ApiStatus.Internal default int upcall(MemoryAddress family, MemoryAddress face, MemoryAddress data) {
        var RESULT = run((org.pango.FontFamily) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(family)), org.pango.FontFamily.fromAddress).marshal(family, Ownership.NONE), (org.pango.FontFace) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(face)), org.pango.FontFace.fromAddress).marshal(face, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontFilterFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
