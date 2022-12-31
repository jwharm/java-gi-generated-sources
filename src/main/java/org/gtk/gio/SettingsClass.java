package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SettingsClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSettingsClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("writable_changed"),
            Interop.valueLayout.ADDRESS.withName("changed"),
            Interop.valueLayout.ADDRESS.withName("writable_change_event"),
            Interop.valueLayout.ADDRESS.withName("change_event"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SettingsClass}
     * @return A new, uninitialized @{link SettingsClass}
     */
    public static SettingsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SettingsClass newInstance = new SettingsClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface WritableChangedCallback {
        void run(org.gtk.gio.Settings settings, java.lang.String key);

        @ApiStatus.Internal default void upcall(MemoryAddress settings, MemoryAddress key) {
            run((org.gtk.gio.Settings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(settings)), org.gtk.gio.Settings.fromAddress).marshal(settings, Ownership.NONE), Marshal.addressToString.marshal(key, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WritableChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code writable_changed}
     * @param writableChanged The new value of the field {@code writable_changed}
     */
    public void setWritableChanged(WritableChangedCallback writableChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("writable_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writableChanged == null ? MemoryAddress.NULL : writableChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChangedCallback {
        void run(org.gtk.gio.Settings settings, java.lang.String key);

        @ApiStatus.Internal default void upcall(MemoryAddress settings, MemoryAddress key) {
            run((org.gtk.gio.Settings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(settings)), org.gtk.gio.Settings.fromAddress).marshal(settings, Ownership.NONE), Marshal.addressToString.marshal(key, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
    }
    
    @FunctionalInterface
    public interface WritableChangeEventCallback {
        boolean run(org.gtk.gio.Settings settings, org.gtk.glib.Quark key);

        @ApiStatus.Internal default int upcall(MemoryAddress settings, int key) {
            var RESULT = run((org.gtk.gio.Settings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(settings)), org.gtk.gio.Settings.fromAddress).marshal(settings, Ownership.NONE), new org.gtk.glib.Quark(key));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WritableChangeEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code writable_change_event}
     * @param writableChangeEvent The new value of the field {@code writable_change_event}
     */
    public void setWritableChangeEvent(WritableChangeEventCallback writableChangeEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("writable_change_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writableChangeEvent == null ? MemoryAddress.NULL : writableChangeEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChangeEventCallback {
        boolean run(org.gtk.gio.Settings settings, org.gtk.glib.Quark keys, int nKeys);

        @ApiStatus.Internal default int upcall(MemoryAddress settings, MemoryAddress keys, int nKeys) {
            org.gtk.glib.Quark keysALIAS = new org.gtk.glib.Quark(keys.get(Interop.valueLayout.C_INT, 0));
            var RESULT = run((org.gtk.gio.Settings) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(settings)), org.gtk.gio.Settings.fromAddress).marshal(settings, Ownership.NONE), keysALIAS, nKeys);
            keys.set(Interop.valueLayout.C_INT, 0, keysALIAS.getValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangeEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_event}
     * @param changeEvent The new value of the field {@code change_event}
     */
    public void setChangeEvent(ChangeEventCallback changeEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("change_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeEvent == null ? MemoryAddress.NULL : changeEvent.toCallback()));
    }
    
    /**
     * Create a SettingsClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SettingsClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SettingsClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SettingsClass(input, ownership);
    
    /**
     * A {@link SettingsClass.Builder} object constructs a {@link SettingsClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SettingsClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SettingsClass struct;
        
        private Builder() {
            struct = SettingsClass.allocate();
        }
        
         /**
         * Finish building the {@link SettingsClass} struct.
         * @return A new instance of {@code SettingsClass} with the fields 
         *         that were set in the Builder object.
         */
        public SettingsClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setWritableChanged(WritableChangedCallback writableChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writable_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writableChanged == null ? MemoryAddress.NULL : writableChanged.toCallback()));
            return this;
        }
        
        public Builder setChanged(ChangedCallback changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
            return this;
        }
        
        public Builder setWritableChangeEvent(WritableChangeEventCallback writableChangeEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writable_change_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writableChangeEvent == null ? MemoryAddress.NULL : writableChangeEvent.toCallback()));
            return this;
        }
        
        public Builder setChangeEvent(ChangeEventCallback changeEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeEvent == null ? MemoryAddress.NULL : changeEvent.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
