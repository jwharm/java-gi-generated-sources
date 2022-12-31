package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function used for gtk_tree_view_map_expanded_rows().
 */
@FunctionalInterface
public interface TreeViewMappingFunc {
    void run(org.gtk.gtk.TreeView treeView, org.gtk.gtk.TreePath path);

    @ApiStatus.Internal default void upcall(MemoryAddress treeView, MemoryAddress path, MemoryAddress userData) {
        run((org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(treeView)), org.gtk.gtk.TreeView.fromAddress).marshal(treeView, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TreeViewMappingFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
