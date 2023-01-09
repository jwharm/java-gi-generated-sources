package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table to implement for {@code GtkBuilderScope} implementations.
 * Default implementations for each function do exist, but they usually just fail,
 * so it is suggested that implementations implement all of them.
 */
public class BuilderScopeInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuilderScopeInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("get_type_from_name"),
            Interop.valueLayout.ADDRESS.withName("get_type_from_function"),
            Interop.valueLayout.ADDRESS.withName("create_closure")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BuilderScopeInterface}
     * @return A new, uninitialized @{link BuilderScopeInterface}
     */
    public static BuilderScopeInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BuilderScopeInterface newInstance = new BuilderScopeInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code GetTypeFromNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetTypeFromNameCallback {
    
        org.gtk.glib.Type run(org.gtk.gtk.BuilderScope self, org.gtk.gtk.GtkBuilder builder, java.lang.String typeName);
        
        @ApiStatus.Internal default long upcall(MemoryAddress self, MemoryAddress builder, MemoryAddress typeName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.BuilderScope) Interop.register(self, org.gtk.gtk.BuilderScope.fromAddress).marshal(self, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), Marshal.addressToString.marshal(typeName, null));
                return RESULT.getValue().longValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetTypeFromNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_type_from_name}
     * @param getTypeFromName The new value of the field {@code get_type_from_name}
     */
    public void setGetTypeFromName(GetTypeFromNameCallback getTypeFromName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_type_from_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getTypeFromName == null ? MemoryAddress.NULL : getTypeFromName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetTypeFromFunctionCallback} callback.
     */
    @FunctionalInterface
    public interface GetTypeFromFunctionCallback {
    
        org.gtk.glib.Type run(org.gtk.gtk.BuilderScope self, org.gtk.gtk.GtkBuilder builder, java.lang.String functionName);
        
        @ApiStatus.Internal default long upcall(MemoryAddress self, MemoryAddress builder, MemoryAddress functionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.BuilderScope) Interop.register(self, org.gtk.gtk.BuilderScope.fromAddress).marshal(self, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), Marshal.addressToString.marshal(functionName, null));
                return RESULT.getValue().longValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetTypeFromFunctionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_type_from_function}
     * @param getTypeFromFunction The new value of the field {@code get_type_from_function}
     */
    public void setGetTypeFromFunction(GetTypeFromFunctionCallback getTypeFromFunction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_type_from_function"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getTypeFromFunction == null ? MemoryAddress.NULL : getTypeFromFunction.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateClosureCallback} callback.
     */
    @FunctionalInterface
    public interface CreateClosureCallback {
    
        org.gtk.gobject.Closure run(org.gtk.gtk.BuilderScope self, org.gtk.gtk.GtkBuilder builder, java.lang.String functionName, org.gtk.gtk.BuilderClosureFlags flags, org.gtk.gobject.GObject object);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress builder, MemoryAddress functionName, int flags, MemoryAddress object) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.BuilderScope) Interop.register(self, org.gtk.gtk.BuilderScope.fromAddress).marshal(self, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), Marshal.addressToString.marshal(functionName, null), new org.gtk.gtk.BuilderClosureFlags(flags), (org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateClosureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_closure}
     * @param createClosure The new value of the field {@code create_closure}
     */
    public void setCreateClosure(CreateClosureCallback createClosure) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_closure"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createClosure == null ? MemoryAddress.NULL : createClosure.toCallback()));
        }
    }
    
    /**
     * Create a BuilderScopeInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BuilderScopeInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuilderScopeInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BuilderScopeInterface(input);
    
    /**
     * A {@link BuilderScopeInterface.Builder} object constructs a {@link BuilderScopeInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BuilderScopeInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BuilderScopeInterface struct;
        
        private Builder() {
            struct = BuilderScopeInterface.allocate();
        }
        
        /**
         * Finish building the {@link BuilderScopeInterface} struct.
         * @return A new instance of {@code BuilderScopeInterface} with the fields 
         *         that were set in the Builder object.
         */
        public BuilderScopeInterface build() {
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
        
        public Builder setGetTypeFromName(GetTypeFromNameCallback getTypeFromName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_type_from_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getTypeFromName == null ? MemoryAddress.NULL : getTypeFromName.toCallback()));
                return this;
            }
        }
        
        public Builder setGetTypeFromFunction(GetTypeFromFunctionCallback getTypeFromFunction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_type_from_function"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getTypeFromFunction == null ? MemoryAddress.NULL : getTypeFromFunction.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateClosure(CreateClosureCallback createClosure) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_closure"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createClosure == null ? MemoryAddress.NULL : createClosure.toCallback()));
                return this;
            }
        }
    }
}
