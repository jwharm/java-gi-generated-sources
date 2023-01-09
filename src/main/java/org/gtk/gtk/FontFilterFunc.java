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
/**
 * Functional interface declaration of the {@code FontFilterFunc} callback.
 */
@FunctionalInterface
public interface FontFilterFunc {

    /**
     * The type of function that is used for deciding what fonts get
     * shown in a {@code GtkFontChooser}.
     * <p>
     * See {@link FontChooser#setFilterFunc}.
     */
    boolean run(org.pango.FontFamily family, org.pango.FontFace face);
    
    @ApiStatus.Internal default int upcall(MemoryAddress family, MemoryAddress face, MemoryAddress data) {
        var RESULT = run((org.pango.FontFamily) Interop.register(family, org.pango.FontFamily.fromAddress).marshal(family, null), (org.pango.FontFace) Interop.register(face, org.pango.FontFace.fromAddress).marshal(face, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontFilterFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
