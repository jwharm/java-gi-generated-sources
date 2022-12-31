package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to be used by {@code GtkCustomLayout} to measure a widget.
 */
@FunctionalInterface
public interface CustomMeasureFunc {
    void run(org.gtk.gtk.Widget widget, org.gtk.gtk.Orientation orientation, int forSize, Out<Integer> minimum, Out<Integer> natural, Out<Integer> minimumBaseline, Out<Integer> naturalBaseline);

    @ApiStatus.Internal default void upcall(MemoryAddress widget, int orientation, int forSize, MemoryAddress minimum, MemoryAddress natural, MemoryAddress minimumBaseline, MemoryAddress naturalBaseline) {
        Out<Integer> minimumOUT = new Out<>(minimum.get(Interop.valueLayout.C_INT, 0));
        Out<Integer> naturalOUT = new Out<>(natural.get(Interop.valueLayout.C_INT, 0));
        Out<Integer> minimumBaselineOUT = new Out<>(minimumBaseline.get(Interop.valueLayout.C_INT, 0));
        Out<Integer> naturalBaselineOUT = new Out<>(naturalBaseline.get(Interop.valueLayout.C_INT, 0));
        run((org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), org.gtk.gtk.Orientation.of(orientation), forSize, minimumOUT, naturalOUT, minimumBaselineOUT, naturalBaselineOUT);
        minimum.set(Interop.valueLayout.C_INT, 0, minimumOUT.get());
        natural.set(Interop.valueLayout.C_INT, 0, naturalOUT.get());
        minimumBaseline.set(Interop.valueLayout.C_INT, 0, minimumBaselineOUT.get());
        naturalBaseline.set(Interop.valueLayout.C_INT, 0, naturalBaselineOUT.get());
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CustomMeasureFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
