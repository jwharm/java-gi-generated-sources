package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkBuildableIface} interface contains methods that are
 * necessary to allow {@code GtkBuilder} to construct an object from
 * a {@code GtkBuilder} UI definition.
 */
public class BuildableIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuildableIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("set_id"),
            Interop.valueLayout.ADDRESS.withName("get_id"),
            Interop.valueLayout.ADDRESS.withName("add_child"),
            Interop.valueLayout.ADDRESS.withName("set_buildable_property"),
            Interop.valueLayout.ADDRESS.withName("construct_child"),
            Interop.valueLayout.ADDRESS.withName("custom_tag_start"),
            Interop.valueLayout.ADDRESS.withName("custom_tag_end"),
            Interop.valueLayout.ADDRESS.withName("custom_finished"),
            Interop.valueLayout.ADDRESS.withName("parser_finished"),
            Interop.valueLayout.ADDRESS.withName("get_internal_child")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BuildableIface}
     * @return A new, uninitialized @{link BuildableIface}
     */
    public static BuildableIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BuildableIface newInstance = new BuildableIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetIdCallback} callback.
     */
    @FunctionalInterface
    public interface SetIdCallback {
    
        void run(org.gtk.gtk.Buildable buildable, java.lang.String id);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buildable, MemoryAddress id) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), Marshal.addressToString.marshal(id, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetIdCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_id}
     * @param setId The new value of the field {@code set_id}
     */
    public void setSetId(SetIdCallback setId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setId == null ? MemoryAddress.NULL : setId.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIdCallback} callback.
     */
    @FunctionalInterface
    public interface GetIdCallback {
    
        java.lang.String run(org.gtk.gtk.Buildable buildable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress buildable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIdCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_id}
     * @param getId The new value of the field {@code get_id}
     */
    public void setGetId(GetIdCallback getId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getId == null ? MemoryAddress.NULL : getId.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AddChildCallback} callback.
     */
    @FunctionalInterface
    public interface AddChildCallback {
    
        void run(org.gtk.gtk.Buildable buildable, org.gtk.gtk.GtkBuilder builder, org.gtk.gobject.GObject child, @Nullable java.lang.String type);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buildable, MemoryAddress builder, MemoryAddress child, MemoryAddress type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), (org.gtk.gobject.GObject) Interop.register(child, org.gtk.gobject.GObject.fromAddress).marshal(child, null), Marshal.addressToString.marshal(type, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddChildCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_child}
     * @param addChild The new value of the field {@code add_child}
     */
    public void setAddChild(AddChildCallback addChild) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addChild == null ? MemoryAddress.NULL : addChild.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetBuildablePropertyCallback} callback.
     */
    @FunctionalInterface
    public interface SetBuildablePropertyCallback {
    
        void run(org.gtk.gtk.Buildable buildable, org.gtk.gtk.GtkBuilder builder, java.lang.String name, org.gtk.gobject.Value value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buildable, MemoryAddress builder, MemoryAddress name, MemoryAddress value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), Marshal.addressToString.marshal(name, null), org.gtk.gobject.Value.fromAddress.marshal(value, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetBuildablePropertyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_buildable_property}
     * @param setBuildableProperty The new value of the field {@code set_buildable_property}
     */
    public void setSetBuildableProperty(SetBuildablePropertyCallback setBuildableProperty) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_buildable_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setBuildableProperty == null ? MemoryAddress.NULL : setBuildableProperty.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConstructChildCallback} callback.
     */
    @FunctionalInterface
    public interface ConstructChildCallback {
    
        org.gtk.gobject.GObject run(org.gtk.gtk.Buildable buildable, org.gtk.gtk.GtkBuilder builder, java.lang.String name);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress buildable, MemoryAddress builder, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), Marshal.addressToString.marshal(name, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConstructChildCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code construct_child}
     * @param constructChild The new value of the field {@code construct_child}
     */
    public void setConstructChild(ConstructChildCallback constructChild) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("construct_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constructChild == null ? MemoryAddress.NULL : constructChild.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CustomTagStartCallback} callback.
     */
    @FunctionalInterface
    public interface CustomTagStartCallback {
    
        boolean run(org.gtk.gtk.Buildable buildable, org.gtk.gtk.GtkBuilder builder, @Nullable org.gtk.gobject.GObject child, java.lang.String tagname, org.gtk.gtk.BuildableParser parser, @Nullable Out<java.lang.foreign.MemoryAddress> data);
        
        @ApiStatus.Internal default int upcall(MemoryAddress buildable, MemoryAddress builder, MemoryAddress child, MemoryAddress tagname, MemoryAddress parser, MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<java.lang.foreign.MemoryAddress> dataOUT = new Out<>(data);
                var RESULT = run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), (org.gtk.gobject.GObject) Interop.register(child, org.gtk.gobject.GObject.fromAddress).marshal(child, null), Marshal.addressToString.marshal(tagname, null), org.gtk.gtk.BuildableParser.fromAddress.marshal(parser, null), dataOUT);
                data.set(Interop.valueLayout.ADDRESS, 0, (Addressable) dataOUT.get());
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CustomTagStartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code custom_tag_start}
     * @param customTagStart The new value of the field {@code custom_tag_start}
     */
    public void setCustomTagStart(CustomTagStartCallback customTagStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_tag_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (customTagStart == null ? MemoryAddress.NULL : customTagStart.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CustomTagEndCallback} callback.
     */
    @FunctionalInterface
    public interface CustomTagEndCallback {
    
        void run(org.gtk.gtk.Buildable buildable, org.gtk.gtk.GtkBuilder builder, @Nullable org.gtk.gobject.GObject child, java.lang.String tagname);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buildable, MemoryAddress builder, MemoryAddress child, MemoryAddress tagname, MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), (org.gtk.gobject.GObject) Interop.register(child, org.gtk.gobject.GObject.fromAddress).marshal(child, null), Marshal.addressToString.marshal(tagname, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CustomTagEndCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code custom_tag_end}
     * @param customTagEnd The new value of the field {@code custom_tag_end}
     */
    public void setCustomTagEnd(CustomTagEndCallback customTagEnd) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_tag_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (customTagEnd == null ? MemoryAddress.NULL : customTagEnd.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CustomFinishedCallback} callback.
     */
    @FunctionalInterface
    public interface CustomFinishedCallback {
    
        void run(org.gtk.gtk.Buildable buildable, org.gtk.gtk.GtkBuilder builder, @Nullable org.gtk.gobject.GObject child, java.lang.String tagname);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buildable, MemoryAddress builder, MemoryAddress child, MemoryAddress tagname, MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), (org.gtk.gobject.GObject) Interop.register(child, org.gtk.gobject.GObject.fromAddress).marshal(child, null), Marshal.addressToString.marshal(tagname, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CustomFinishedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code custom_finished}
     * @param customFinished The new value of the field {@code custom_finished}
     */
    public void setCustomFinished(CustomFinishedCallback customFinished) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_finished"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (customFinished == null ? MemoryAddress.NULL : customFinished.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ParserFinishedCallback} callback.
     */
    @FunctionalInterface
    public interface ParserFinishedCallback {
    
        void run(org.gtk.gtk.Buildable buildable, org.gtk.gtk.GtkBuilder builder);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buildable, MemoryAddress builder) {
            run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ParserFinishedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code parser_finished}
     * @param parserFinished The new value of the field {@code parser_finished}
     */
    public void setParserFinished(ParserFinishedCallback parserFinished) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parser_finished"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parserFinished == null ? MemoryAddress.NULL : parserFinished.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetInternalChildCallback} callback.
     */
    @FunctionalInterface
    public interface GetInternalChildCallback {
    
        org.gtk.gobject.GObject run(org.gtk.gtk.Buildable buildable, org.gtk.gtk.GtkBuilder builder, java.lang.String childname);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress buildable, MemoryAddress builder, MemoryAddress childname) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.Buildable) Interop.register(buildable, org.gtk.gtk.Buildable.fromAddress).marshal(buildable, null), (org.gtk.gtk.GtkBuilder) Interop.register(builder, org.gtk.gtk.GtkBuilder.fromAddress).marshal(builder, null), Marshal.addressToString.marshal(childname, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetInternalChildCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_internal_child}
     * @param getInternalChild The new value of the field {@code get_internal_child}
     */
    public void setGetInternalChild(GetInternalChildCallback getInternalChild) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_internal_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getInternalChild == null ? MemoryAddress.NULL : getInternalChild.toCallback()));
        }
    }
    
    /**
     * Create a BuildableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BuildableIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuildableIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BuildableIface(input);
    
    /**
     * A {@link BuildableIface.Builder} object constructs a {@link BuildableIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BuildableIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BuildableIface struct;
        
        private Builder() {
            struct = BuildableIface.allocate();
        }
        
        /**
         * Finish building the {@link BuildableIface} struct.
         * @return A new instance of {@code BuildableIface} with the fields 
         *         that were set in the Builder object.
         */
        public BuildableIface build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setSetId(SetIdCallback setId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setId == null ? MemoryAddress.NULL : setId.toCallback()));
                return this;
            }
        }
        
        public Builder setGetId(GetIdCallback getId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getId == null ? MemoryAddress.NULL : getId.toCallback()));
                return this;
            }
        }
        
        public Builder setAddChild(AddChildCallback addChild) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add_child"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addChild == null ? MemoryAddress.NULL : addChild.toCallback()));
                return this;
            }
        }
        
        public Builder setSetBuildableProperty(SetBuildablePropertyCallback setBuildableProperty) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_buildable_property"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setBuildableProperty == null ? MemoryAddress.NULL : setBuildableProperty.toCallback()));
                return this;
            }
        }
        
        public Builder setConstructChild(ConstructChildCallback constructChild) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("construct_child"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constructChild == null ? MemoryAddress.NULL : constructChild.toCallback()));
                return this;
            }
        }
        
        public Builder setCustomTagStart(CustomTagStartCallback customTagStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("custom_tag_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (customTagStart == null ? MemoryAddress.NULL : customTagStart.toCallback()));
                return this;
            }
        }
        
        public Builder setCustomTagEnd(CustomTagEndCallback customTagEnd) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("custom_tag_end"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (customTagEnd == null ? MemoryAddress.NULL : customTagEnd.toCallback()));
                return this;
            }
        }
        
        public Builder setCustomFinished(CustomFinishedCallback customFinished) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("custom_finished"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (customFinished == null ? MemoryAddress.NULL : customFinished.toCallback()));
                return this;
            }
        }
        
        public Builder setParserFinished(ParserFinishedCallback parserFinished) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parser_finished"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parserFinished == null ? MemoryAddress.NULL : parserFinished.toCallback()));
                return this;
            }
        }
        
        public Builder setGetInternalChild(GetInternalChildCallback getInternalChild) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_internal_child"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getInternalChild == null ? MemoryAddress.NULL : getInternalChild.toCallback()));
                return this;
            }
        }
    }
}
