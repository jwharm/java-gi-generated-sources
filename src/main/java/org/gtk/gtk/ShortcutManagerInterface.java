package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of functions that can be implemented for the {@code GtkShortcutManager}
 * interface.
 * <p>
 * Note that no function is mandatory to implement, the default implementation
 * will work fine.
 */
public class ShortcutManagerInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutManagerInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("add_controller"),
            Interop.valueLayout.ADDRESS.withName("remove_controller")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ShortcutManagerInterface}
     * @return A new, uninitialized @{link ShortcutManagerInterface}
     */
    public static ShortcutManagerInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ShortcutManagerInterface newInstance = new ShortcutManagerInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code AddControllerCallback} callback.
     */
    @FunctionalInterface
    public interface AddControllerCallback {
    
        void run(org.gtk.gtk.ShortcutManager self, org.gtk.gtk.ShortcutController controller);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress controller) {
            run((org.gtk.gtk.ShortcutManager) Interop.register(self, org.gtk.gtk.ShortcutManager.fromAddress).marshal(self, null), (org.gtk.gtk.ShortcutController) Interop.register(controller, org.gtk.gtk.ShortcutController.fromAddress).marshal(controller, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddControllerCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_controller}
     * @param addController The new value of the field {@code add_controller}
     */
    public void setAddController(AddControllerCallback addController) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_controller"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addController == null ? MemoryAddress.NULL : addController.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RemoveControllerCallback} callback.
     */
    @FunctionalInterface
    public interface RemoveControllerCallback {
    
        void run(org.gtk.gtk.ShortcutManager self, org.gtk.gtk.ShortcutController controller);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress controller) {
            run((org.gtk.gtk.ShortcutManager) Interop.register(self, org.gtk.gtk.ShortcutManager.fromAddress).marshal(self, null), (org.gtk.gtk.ShortcutController) Interop.register(controller, org.gtk.gtk.ShortcutController.fromAddress).marshal(controller, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RemoveControllerCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_controller}
     * @param removeController The new value of the field {@code remove_controller}
     */
    public void setRemoveController(RemoveControllerCallback removeController) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_controller"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeController == null ? MemoryAddress.NULL : removeController.toCallback()));
        }
    }
    
    /**
     * Create a ShortcutManagerInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ShortcutManagerInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutManagerInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutManagerInterface(input);
    
    /**
     * A {@link ShortcutManagerInterface.Builder} object constructs a {@link ShortcutManagerInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ShortcutManagerInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ShortcutManagerInterface struct;
        
        private Builder() {
            struct = ShortcutManagerInterface.allocate();
        }
        
        /**
         * Finish building the {@link ShortcutManagerInterface} struct.
         * @return A new instance of {@code ShortcutManagerInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ShortcutManagerInterface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setAddController(AddControllerCallback addController) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add_controller"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addController == null ? MemoryAddress.NULL : addController.toCallback()));
                return this;
            }
        }
        
        public Builder setRemoveController(RemoveControllerCallback removeController) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("remove_controller"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeController == null ? MemoryAddress.NULL : removeController.toCallback()));
                return this;
            }
        }
    }
}
